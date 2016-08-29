/**   
* @Title: UserInfoServiceImpl.java
* @Package com.zyq.service.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月29日 上午10:56:37
* @version V1.0   
*/


package com.zyq.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zyq.dao.UserInfoRepository;
import com.zyq.model.UserInfo;
import com.zyq.service.UserInfoService;

/**
 * @ClassName: UserInfoServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月29日 上午10:56:37
 * 
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{
   
    @Resource
    private UserInfoRepository userInfoRepository;
   
    @Override
    public UserInfo findByUsername(String username) {
       System.out.println("UserInfoServiceImpl.findByUsername()");
       return userInfoRepository.findByUsername(username);
    }
   
}
