package com.zyq.configurationproperties;

/**
 * @ClassName: TestGetPropertiesValues
 * @Description: TODO(spring preoperties值读取junit测试类)
 * @author 庄友权
 * @date 2016年8月31日 上午10:13:56
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zyq.App;

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
