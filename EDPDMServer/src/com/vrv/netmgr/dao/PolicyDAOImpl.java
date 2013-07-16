/*
 * Copyright 2005-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vrv.netmgr.dao;

import org.springframework.stereotype.Repository;

import com.vrv.framework.dao.mybatis.BaseMyBatisDAOImpl;
import com.vrv.netmgr.entity.Policy;

/**
 * PolicyListDAO
 * 
 * @author 修改成自己的名字
 * @version 1.0
 */
@Repository(value = "policyDao")
public class PolicyDAOImpl extends BaseMyBatisDAOImpl<Policy, String> implements PolicyDAO {

}