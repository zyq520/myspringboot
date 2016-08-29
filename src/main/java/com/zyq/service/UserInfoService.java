/**   
* @Title: UserInfoService.java
* @Package com.zyq.service
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月29日 上午10:56:03
* @version V1.0   
*/


package com.zyq.service;

import com.zyq.model.UserInfo;

/**
 * @ClassName: UserInfoService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月29日 上午10:56:03
 * 
 */

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
