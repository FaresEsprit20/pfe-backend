package com.github.workTimeMangementGithub.config;


import com.github.workTimeMangementGithub.entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class GithubConfiguration {



  @Bean
 public RestTemplate getRestTemplate(){
    return  new RestTemplate();
  }


}
