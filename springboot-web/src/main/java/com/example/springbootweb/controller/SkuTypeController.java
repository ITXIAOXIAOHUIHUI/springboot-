package com.example.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jhh
 * @company GeekPlus
 * @date 2018/10/28 17:00
 */
@RestController
@RequestMapping(value="/skutype")
public class SkuTypeController {

    @RequestMapping(path="/download")
    public Object getDownLoad(){

        return  "测试列子";
    }
}
