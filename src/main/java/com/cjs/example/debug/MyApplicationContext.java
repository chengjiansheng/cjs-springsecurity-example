package com.cjs.example.debug;

import com.cjs.example.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.stereotype.Component;

/**
 * 调试
 * 看一下是不是自己配置的那个Bean
 */
@Component
public class MyApplicationContext implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Object obj = applicationContext.getBean(UserService.class);
        RedisCacheManager redisCacheManager = applicationContext.getBean(RedisCacheManager.class);
        Object redisTemplate = applicationContext.getBean("redisTemplate");
        System.out.println("这里可以打断点查看我们自己配置的Bean是否生效");
    }
}
