package com.zyq.controller;

/**
 * @ClassName: ErrorController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 下午1:45:04
 * 
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/error")
public class ErrorController {
    @RequestMapping("/")
    public String getError(){
        int i=100/0;
        System.out.println(i);
        return "error";
    }
}
