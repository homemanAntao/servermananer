package com.antao.servermanager.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author     ：antao
 * @date        2022/7/24 12:39
 * @description：服务对象
 * @modified By：
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)//链式注解
public class ServiceModel implements Serializable {

    //id
    private int id;

    //该服务是否作废
    private boolean disabled = false;

    //名称
    private String name;

    //该服务所在电脑的ip地址
    private String host;

    //服务端口
    private int port;

    //启动命令
    private String startUpCommand;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getStartUpCommand() {
        return startUpCommand;
    }

    public void setStartUpCommand(String startUpCommand) {
        this.startUpCommand = startUpCommand;
    }
}