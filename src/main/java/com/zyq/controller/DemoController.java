package com.zyq.controller;

/**
 * @ClassName: DemoController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 上午11:37:00
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.zyq.model.Demo;
import com.zyq.service.DemoService;


@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;
    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo=new Demo();
        demo.setId(1);
        demo.setName("zyq");
        return demo;
    }
    
    @RequestMapping("/likeName")
    public List<Demo> likeName(String name,int pageNum,int pageSize){
        //第一个参数是第几页；
        //第二个参数是每页显示条数。
        PageHelper.startPage(pageNum,pageSize);
        return demoService.likeName(name);
    }
}
