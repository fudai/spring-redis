package com.fudai.spring.redis.service;

import com.fudai.spring.redis.Bootstrap;
import org.assertj.core.util.Sets;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @className: RedisClientTest
 * @description:
 * @author: fudai
 * @date: 2023-02-16 16:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Bootstrap.class)
public class RedisClientTest {

    @Autowired
    private RedisClient redisClient;

    @Test
    public void set() {
        Assert.assertTrue(redisClient.set("test3", "3",1));
    }

    @Test
    public void delete() {
        Assert.assertTrue(redisClient.delete("test"));
    }
}