package com.antao.servermanager.service;

import com.antao.servermanager.dao.ServiceDao;
import com.antao.servermanager.model.ServiceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author     ：antao
 * @date        2022/7/24 13:43
 * @description：
 * @modified By：
 */
@Service
@Transactional
public class ServiceManageFacadeImpl implements ServiceManageFacade {

    @Autowired
    ServiceDao serviceDao;


    @Override
    public void addService(ServiceModel serviceModel) {
        serviceDao.addService(serviceModel);
    }
}