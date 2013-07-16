package com.vrv.framework.service;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vrv.common.utils.BeanUtils;
import com.vrv.common.utils.GenericsUtils;
import com.vrv.common.utils.StringUtil;
import com.vrv.framework.dao.BaseDAO;
import com.vrv.framework.dao.domain.BaseEntity;
import com.vrv.framework.vo.Page;
import com.vrv.framework.vo.SearchCondition;

public class EntityServiceImpl<Entity extends BaseEntity> extends BaseServiceImpl implements EntityService<Entity> {

	/**
	 * 日志对象
	 */
	protected static Logger logger = LoggerFactory.getLogger(EntityServiceImpl.class);

	protected BaseDAO<Entity, Serializable> dao = null;

	protected Class<Entity> entityClass = null;

	/**
	 * 缺省构造函数
	 * <p>
	 * 初始化VO class类型;初始化Entity class类型;
	 * 
	 */
	@SuppressWarnings("unchecked")
	public EntityServiceImpl() {
		super();
		entityClass = GenericsUtils.getGenericClass(getClass());
	}

	/**
	 * 设置DAO
	 */
	public void setDao(BaseDAO<Entity, Serializable> dao) {
		this.dao = dao;
	}

	/**
	 * 获取Entity的名称
	 * 
	 * @return Entity名称
	 */
	protected String getEntityName() {
		return entityClass.getSimpleName();
	}

	@Transactional(readOnly = true)
	public LogicProcessResult get(Serializable id) {
		LogicProcessResult logicProcessResult = new LogicProcessResult();
		Entity entity = dao.find(id);
		if (entity != null) {
			logicProcessResult.setResultObject(entity);
		}
		return logicProcessResult;
	}

	@Transactional(readOnly = true)
	public LogicProcessResult get(Serializable... ids) {
		LogicProcessResult logicProcessResult = new LogicProcessResult();
		List<Entity> entityList = dao.find(ids);
		logicProcessResult.setResultObject(entityList);
		return logicProcessResult;
	}

	@Transactional(readOnly = true)
	public LogicProcessResult getAll() {
		LogicProcessResult logicProcessResult = new LogicProcessResult();
		List<Entity> entityList = dao.findAll();
		logicProcessResult.setResultObject(entityList);
		return logicProcessResult;
	}

	@Transactional(readOnly = true)
	public Page searchAndCount(SearchCondition searchCondition) {
		return dao.pageQuery("selectPage", searchCondition);
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public LogicProcessResult remove(Serializable id) {
		return new LogicProcessResult(dao.removeById(id));
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public LogicProcessResult remove(Serializable... ids) {
		dao.removeByIds(ids);
		return new LogicProcessResult();

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public LogicProcessResult remove(Entity entity) {
		return new LogicProcessResult(dao.remove(entity));
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@SuppressWarnings("unchecked")
	public LogicProcessResult remove(Entity... entities) {
		Entity[] entitys = (Entity[]) Array.newInstance(entityClass, entities.length);
		dao.remove(entitys);
		return new LogicProcessResult();
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public LogicProcessResult save(Entity valueObject) {
		Entity entity = null;
		if (StringUtil.isValidString(valueObject.getId())) {
			entity = prepare4Update(valueObject);
			entity = dao.update(entity);
		} else {
			entity = dao.save(valueObject);
		}
		LogicProcessResult logicProcessResult = new LogicProcessResult();
		if (null != entity) {
			logicProcessResult.setResultObject(entity);
			logicProcessResult.setSuccess(Boolean.TRUE);
			return logicProcessResult;
		} else {
			logicProcessResult.setSuccess(Boolean.FALSE);
			return logicProcessResult;
		}
	}

	/**
	 * 更新用Entity数据转配
	 * 
	 * @param valueObject
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private Entity prepare4Update(Entity valueObject) {
		// 从数据库上获取要更新的业务Entity
		Entity tmpEntity = (Entity) dao.find(valueObject.getId());
		// 获取业务Entity中所有类型为BaseEntity的属性
		List<Field> entityFields = BeanUtils.getFieldsByType(tmpEntity, BaseEntity.class);
		// 对检索到的业务Entity创建副本
		Entity entity = (Entity) BeanUtils.deepClone(tmpEntity);
		Map<String, Object> fieldNames = new HashMap<String, Object>();
		for (Field entityField : entityFields) {
			BaseEntity holdEntity = (BaseEntity) BeanUtils.getProperty(entity, entityField.getName());
			// 避免含有同类型的Entity且相同时出现的值传递问题、故对类型相同的第二个属性进行克隆
			if (holdEntity != null && fieldNames.containsKey(entityField.getType().getName())) {
				holdEntity = (BaseEntity) BeanUtils.deepClone(holdEntity);
			} else {
				// 对于首次出现的直接添加到Map中，以备后续检查
				fieldNames.put(entityField.getType().getName(), entityField);
			}
			if (holdEntity != null) {
				BeanUtils.setProperty(entity, entityField.getName(), holdEntity);
			}
		}
		// 乐观锁判断对象是否存在版本冲突，如果存在就抛出异常
		if (entity.getVersion() != null && valueObject.getVersion() != null) {
			if (entity.getVersion().compareTo(valueObject.getVersion()) != 0) {
				throw new OptimisticLockingFailureException("");
			}
		}
		BeanUtils.beanShallowCopy(entity, valueObject);
		return entity;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public LogicProcessResult save(BaseEntity... valueObjects) {
		for (int i = 0; i < valueObjects.length; i++) {
			save(valueObjects[i]);
		}
		return new LogicProcessResult();
	}

	@Transactional(readOnly = true)
	public LogicProcessResult search(SearchCondition searchCondition) {
		List<Entity> entityList = dao.search(searchCondition);
		return new LogicProcessResult(entityList);
	}

	@Transactional(readOnly = true)
	public LogicProcessResult searchUnique(SearchCondition searchCondition) {
		LogicProcessResult logicProcessResult = new LogicProcessResult();
		Entity entity = dao.searchUnique(searchCondition);
		if (entity == null) {
			return logicProcessResult;
		}
		logicProcessResult.setResultObject(entity);
		return logicProcessResult;
	}

}
