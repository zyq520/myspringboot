/**   
* @Title: DemoController.java
* @Package com.zyq.springboot
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月25日 上午11:37:00
* @version V1.0   
*/


package com.zyq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyq.model.Demo;

/**
 * @ClassName: DemoController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 上午11:37:00
 * 
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo=new Demo();
        demo.setId(1);
        demo.setName("zyq");
        return demo;
    }
}
