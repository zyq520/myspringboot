package com.zyq.dao;

/**
 * @ClassName: AdsRepository
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 下午2:22:59
 * 
 */

import org.springframework.data.repository.CrudRepository;
import com.zyq.model.Ads;



public interface AdsRepository extends CrudRepository<Ads,Integer>{

}
