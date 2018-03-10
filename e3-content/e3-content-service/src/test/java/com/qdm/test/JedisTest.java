package com.qdm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author QiuDongMing 2017年12月26日 10:48
 * @version 1.0
 */
public class JedisTest {

    @Test
    public void testGetKey() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-redis.xml");
//        JedisClientCluster clientCluster = applicationContext.getBean(JedisClientCluster.class);
//        String s = clientCluster.hget("CONTENT_LIST", 89+"");
//        System.out.println("s = " + s);
    }






}
