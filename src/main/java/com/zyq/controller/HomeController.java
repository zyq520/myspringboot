package com.zyq.controller;

/**
 * @ClassName: HomeController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月29日 上午10:18:51
 * 
 */

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zyq.model.UserInfo;
import com.zyq.service.UserInfoService;


@Controller
public class HomeController {
    
    @Resource
    private UserInfoService userInfoService;
    
    @RequestMapping({"/index","/"})
    public String index(){
       return"/index";
    }
    
    @RequestMapping({"/cache"})
    public String cache(){
       userInfoService.cache("123");
       return"/index";
    }
   
    @RequestMapping("/login")
    public String login(HttpServletRequest request, Map<String, Object> map) throws Exception{
        System.out.println("HomeController.login()");
        // 登录失败从request中获取shiro处理的异常信息。
        // shiroLoginFailure:就是shiro异常类的全类名.
        String exception = (String) request.getAttribute("shiroLoginFailure");
  
        System.out.println("exception=" + exception);
        String msg = "";
        if (exception != null) {
            if (UnknownAccountException.class.getName().equals(exception)) {
               System.out.println("UnknownAccountException -- > 账号不存在：");
               msg = "UnknownAccountException -- > 账号不存在：";
            } else if (IncorrectCredentialsException.class.getName().equals(exception)) {
               System.out.println("IncorrectCredentialsException -- > 密码不正确：");
               msg = "IncorrectCredentialsException -- > 密码不正确：";
            } else if ("kaptchaValidateFailed".equals(exception)) {
               System.out.println("kaptchaValidateFailed -- > 验证码错误");
               msg = "kaptchaValidateFailed -- > 验证码错误";
            } else {
               msg = "else >> "+exception;
               System.out.println("else -- >" + exception);
            }
        }
        map.put("msg", msg);
        // 此方法不处理登录成功,由shiro进行处理.
        return "/login";
    }
    
    @RequestMapping("/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
        }
        return "/login";
    }
}
