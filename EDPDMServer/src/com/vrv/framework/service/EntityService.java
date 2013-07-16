package com.vrv.framework.service;

import java.io.Serializable;

import com.vrv.framework.dao.BaseDAO;
import com.vrv.framework.dao.domain.BaseEntity;
import com.vrv.framework.vo.Page;
import com.vrv.framework.vo.SearchCondition;

/**
 * 
 * @author 曹保利
 * 
 * @param <T>
 */
public interface EntityService<Entity extends BaseEntity> extends BaseService {

	/**
	 * 
	 * @param dao
	 */
	public void setDao(BaseDAO<Entity, Serializable> dao);

	/**
	 * 保存业务Entity
	 * 
	 * @param entity
	 *            业务Entity
	 * @return
	 */
	public LogicProcessResult save(Entity valueObject);

	/**
	 * 
	 * @param o
	 * @return
	 */
	public LogicProcessResult save(Entity... valueObjects);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public LogicProcessResult remove(Serializable id);

	/**
	 * 
	 * @param ids
	 */
	public LogicProcessResult remove(Serializable... ids);

	/**
	 * 
	 * @param entity
	 * @return
	 */
	public LogicProcessResult remove(Entity valueObject);

	/**
	 * 
	 * @param entities
	 */
	public LogicProcessResult remove(Entity... valueObjects);

	/**
	 * 根据主键获取对象
	 * 
	 * @param id
	 * @return 表示对象
	 */
	public LogicProcessResult get(Serializable id);

	/**
	 * 
	 * @param ids
	 * @return
	 */
	public LogicProcessResult get(Serializable... ids);

	/**
	 * 获取所有对象
	 * 
	 * @return 表示对象集
	 */
	public LogicProcessResult getAll();

	/**
	 * 
	 * @param search
	 * @return
	 */
	public LogicProcessResult search(SearchCondition searchCondition);

	public Page searchAndCount(SearchCondition searchCondition);

	/**
	 * 
	 * @param search
	 * @return
	 */
	public LogicProcessResult searchUnique(SearchCondition searchCondition);
}
