package com.antao.servermanager.controller;

import com.antao.servermanager.model.ResMessage;
import com.antao.servermanager.model.ServiceModel;
import com.antao.servermanager.service.ServiceManageFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务管理请求controller
 * @author     ：antao
 * @date        2022/7/24 10:39
 * @description：
 * @modified By：
 */
@RestController
public class ServerManagerController {

    @Autowired
    ServiceManageFacade serviceManageFacade;
    //测试提交

    @PostMapping("serviceManager/add")
    public ResMessage jumpTest() {
        ResMessage message = new ResMessage();
        try {
            ServiceModel serviceModel = new ServiceModel();
            serviceModel.setName("mongodb服务");
            serviceModel.setHost("192.168.0.251");
            serviceModel.setPort(5678);
            serviceModel.setStartUpCommand("start up");
            serviceManageFacade.addService(serviceModel);
        } catch (Exception e) {
            message.setCode(ResMessage.FAIL);
            message.setErrMessage(e.getMessage());
        }
        return message;
    }

}