package com.zyq.dao;

/**
 * @ClassName: UserInfoRepository
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月29日 上午10:55:11
 * 
 */

import org.springframework.data.repository.CrudRepository;

import com.zyq.model.UserInfo;



public interface UserInfoRepository extends CrudRepository<UserInfo,Long>{
   
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
   
}
