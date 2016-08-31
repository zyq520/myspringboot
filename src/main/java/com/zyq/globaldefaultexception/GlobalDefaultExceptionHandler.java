package com.zyq.globaldefaultexception;

/**
 * @ClassName: GlobalDefaultExceptionHandler
 * @Description: TODO(全局异常定义)
 * @author 庄友权
 * @date 2016年8月25日 下午1:43:05
 * 
 */

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(value=Exception.class)
    public void defaultErrorHandler(HttpServletRequest req, Exception e){
        System.out.println(e.toString());
    }
}
