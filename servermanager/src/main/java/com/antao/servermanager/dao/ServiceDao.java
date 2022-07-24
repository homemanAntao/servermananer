package com.antao.servermanager.dao;

import com.antao.servermanager.model.ServiceModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ：antao
 * @date 2022/7/24 12:46
 * @description：服务对象实体
 * @modified By：
 */
@Mapper
@Repository
public interface ServiceDao {
    boolean addService(ServiceModel service);

}
