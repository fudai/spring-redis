/**
 * Copyright (c) 2009-2023 fudai,Inc.All Rights Reserved.
 *
 * @fileName: RedisClient
 * @package: com.fudai.spring.redis.service
 * @date: 2023-02-16 16:11
 * @version: V1.0
 */
package com.fudai.spring.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @className: RedisClient
 * @description:
 * @author: fudai
 * @date: 2023-02-16 16:11
 */
@Service
public class RedisClient {

    @Autowired
    private RedisTemplate redisTemplate;

    public boolean set(String lockKey, Object value, int expSeconds) {
        return redisTemplate.boundValueOps(lockKey).setIfAbsent(value, expSeconds, TimeUnit.SECONDS);
    }

    public boolean delete(String lockKey){
        return redisTemplate.delete(lockKey);
    }

}
