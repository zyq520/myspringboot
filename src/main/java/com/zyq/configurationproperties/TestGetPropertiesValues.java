/**   
* @Title: TestGetPropertiesValues.java
* @Package com.zyq.configurationproperties
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年8月31日 上午10:13:56
* @version V1.0   
*/


package com.zyq.configurationproperties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zyq.App;

/**
 * @ClassName: TestGetPropertiesValues
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年8月31日 上午10:13:56
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class TestGetPropertiesValues {
    @Autowired
    private GetPropertiesValues test;
    @Test
    public void testBlog() throws Exception {
        System.out.println(test.getName()+"---------->"+test.getTitle());
    }
}
