/**   
* @Title: UserInfoController.java
* @Package com.zyq.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月29日 下午1:35:43
* @version V1.0   
*/


package com.zyq.controller;

/**
 * @ClassName: UserInfoController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月29日 下午1:35:43
 * 
 */

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
   
    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    @RequiresPermissions("userInfo:view")//权限管理;
    public String userInfo(){
       return "userInfo";
    }
   
    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(){
       return "userInfoAdd";
    }
    
    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel(){
       return "userInfoDel";
    }
   
}
