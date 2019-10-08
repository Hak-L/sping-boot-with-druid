package com.sgl.spingbootwithdruid.action.controller;/**
 * Created by Ni Klaus on 2019/10/8 0008
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName Login
 *@Description TODO
 *@Author Ni Klaus
 *@Date 2019/10/8 0008 下午 18:24
 *@Version 1.0
 */
@RestController
public class Login {

    @GetMapping(value = "/login")
    public String login(){
        return "chengong!";
    }
}
