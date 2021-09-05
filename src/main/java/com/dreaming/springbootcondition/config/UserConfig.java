package com.dreaming.springbootcondition.config;

import com.dreaming.springbootcondition.condition.ClassCondition;
import com.dreaming.springbootcondition.condition.ConditionOnClass;
import com.dreaming.springbootcondition.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {


//    @Conditional(ClassCondition.class)
    @Bean
    @ConditionOnClass("redis.clients.jedis.Jedis")
    public User user(){
        return new User();
    }

}
