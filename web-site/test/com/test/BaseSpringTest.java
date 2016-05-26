package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author zhangjian
 * @Date 2015/10/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:webapp/WEB-INF/mvc-dispatcher-servlet.xml","file:webapp/WEB-INF/conf/applicationContext-*.xml","classpath*:applicationContext-bean.xml"})
public class BaseSpringTest extends AbstractJUnit4SpringContextTests {

    @Test
   public void test(){

   }
}
