/**   
* @Title: ErrorController.java
* @Package com.zyq.springboot
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月25日 下午1:45:04
* @version V1.0   
*/


package com.zyq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ErrorController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 下午1:45:04
 * 
 */
@RestController
@RequestMapping("/error")
public class ErrorController {
    @RequestMapping("/")
    public String getError(){
        int i=100/0;
        return "error";
    }
}
