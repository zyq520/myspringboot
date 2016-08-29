/**   
* @Title: AdsService.java
* @Package com.zyq.service
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月25日 下午2:23:56
* @version V1.0   
*/


package com.zyq.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.zyq.dao.AdsDao;
import com.zyq.dao.AdsRepository;
import com.zyq.model.Ads;

/**
 * @ClassName: AdsService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 下午2:23:56
 * 
 */
@Service
public class AdsService {
    @Resource
    private AdsRepository adsRepository;
    @Resource
    private AdsDao adsDao;
    @Transactional
    public void saveAds(Ads ads){
        adsRepository.save(ads);
    }
    @Transactional
    public Ads getById(int id){
        return adsDao.getById(id);
    }
}
