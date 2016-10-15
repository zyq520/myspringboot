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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.redis.core.StringRedisTemplate;
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
    
    @Cacheable(value="findByUsername")
    @Override
    public UserInfo findByUsername(String username) {
       System.out.println("UserInfoServiceImpl.findByUsername()====执行数据库查找");
       return userInfoRepository.findByUsername(username);
    }
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Override
    @Cacheable(value="cache")
    public String cache(String name) {
        // TODO Auto-generated method stub
        System.out.println("UserInfoServiceImpl.cache()====执行数据库查找");
        System.out.println(stringRedisTemplate.opsForValue().get("zyq"));
        return "增加缓存";
    }
   
}
