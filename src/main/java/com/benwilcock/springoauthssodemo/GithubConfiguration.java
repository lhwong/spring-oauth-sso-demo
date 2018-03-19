package com.benwilcock.springoauthssodemo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GithubConfiguration {

    @Bean(name = "github")
    @ConfigurationProperties("github")
    public ClientResources github() {
        return new ClientResources();
    }

}
