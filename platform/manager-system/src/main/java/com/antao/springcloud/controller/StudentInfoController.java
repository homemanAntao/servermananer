package com.antao.springcloud.controller;

import com.antao.springcloud.resultHandle.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author     ：antao
 * @date        2022/9/3 14:43
 * @description：
 * @modified By：
 */
@RestController
@RequestMapping("/manager-system/studentInfo")
public class StudentInfoController {

    @GetMapping("/getUser/{id}")
    public Result getUserInfo(@PathVariable int id) {
        System.out.println("id-------:" + id);
        return  Result.success(55555);
    }
}