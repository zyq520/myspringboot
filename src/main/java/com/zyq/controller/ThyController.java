package com.zyq.controller;

/**
 * @ClassName: ThyController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月26日 上午10:48:55
 * 
 */

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThyController {

    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
       map.put("hello","from TemplateController.helloHtml");
       return "/helloHtml";
    }
}
