package com.antao.servermanager.service;

import com.antao.servermanager.model.ServiceModel;

/**
 * @author     ：antao
 * @date        2022/7/24 13:42
 * @description： 服务接口
 * @modified By：
 */
public interface ServiceManageFacade {

    void  addService(ServiceModel serviceModel);
}