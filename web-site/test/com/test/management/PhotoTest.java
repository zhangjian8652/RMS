package com.test.management;

import com.joker.modules.management.dao.AvatarDao;
import com.test.BaseSpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author zhangjian
 * @Date 2015/11/21
 */
public class PhotoTest extends BaseSpringTest{
   @Autowired
    private AvatarDao avatarDao;
    @Test
    public void testAddPhoto(){
        avatarDao.findAllAvatar();
    }
}
