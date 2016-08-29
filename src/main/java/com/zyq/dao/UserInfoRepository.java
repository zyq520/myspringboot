/**   
* @Title: UserInfoRepository.java
* @Package com.zyq.dao
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月29日 上午10:55:11
* @version V1.0   
*/


package com.zyq.dao;

import org.springframework.data.repository.CrudRepository;

import com.zyq.model.UserInfo;

/**
 * @ClassName: UserInfoRepository
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月29日 上午10:55:11
 * 
 */

public interface UserInfoRepository extends CrudRepository<UserInfo,Long>{
   
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
   
}
