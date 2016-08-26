/**   
* @Title: AdsRepository.java
* @Package com.zyq.dao
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月25日 下午2:22:59
* @version V1.0   
*/


package com.zyq.dao;

import javax.annotation.Resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zyq.model.Ads;

/**
 * @ClassName: AdsRepository
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 下午2:22:59
 * 
 */

public interface AdsRepository extends CrudRepository<Ads,Integer>{

}
