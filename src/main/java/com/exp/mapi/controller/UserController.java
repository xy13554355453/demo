package com.exp.mapi.controller;



/**
 * Create By xiayang on 2018/8/8
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("id")
    public int getId(){
        return 2;
    }
}
