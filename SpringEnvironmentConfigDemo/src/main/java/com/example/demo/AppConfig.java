package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application-${spring.profiles.active}.properties")
public class AppConfig {

    @Bean
    public EnvironmentBox envBox(@Value("${app.environment.name}") String env)
    {
        EnvironmentBox box = new EnvironmentBox();
        box.setName(env);
        System.out.println("Environment: " + box.getName());
        return box;
    }

}
