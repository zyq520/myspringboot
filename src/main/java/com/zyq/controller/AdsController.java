/**   
* @Title: AdsController.java
* @Package com.zyq.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月25日 下午2:26:04
* @version V1.0   
*/


package com.zyq.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyq.model.Ads;
import com.zyq.service.AdsService;

/**
 * @ClassName: AdsController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月25日 下午2:26:04
 * 
 */
@RestController
@RequestMapping("/ads")
public class AdsController {
    @Resource
    private AdsService adsService;
    @RequestMapping("/save")
    public String save(Ads ads){
        adsService.saveAds(ads);
        return "保存成功";
    }
    
    @RequestMapping("/getById")
    public Ads save(int id){
        Ads ads=adsService.getById(id);
        return ads;
    }
}
