package com.nantian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @project: uccp-practice
 * @ClassName: IndexController
 * @author:
 * @date: 2021/7/19/0019 14:53
 */
@Controller
public class IndexController {

    @RequestMapping("/practice")
    public String index(){
        return "practice";
    }

}
