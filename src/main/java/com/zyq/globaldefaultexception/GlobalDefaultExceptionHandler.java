/**   
* @Title: GlobalDefaultExceptionHandler.java
* @Package com.zyq.springboot
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月25日 下午1:43:05
* @version V1.0   
*/


package com.zyq.globaldefaultexception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ClassName: GlobalDefaultExceptionHandler
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 下午1:43:05
 * 
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(value=Exception.class)
    public void defaultErrorHandler(HttpServletRequest req, Exception e){
        System.out.println(e.toString());
    }
}
