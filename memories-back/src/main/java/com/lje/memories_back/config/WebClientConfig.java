package com.lje.memories_back.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.Value;

@Configuration
public class WebClientConfig {
  
  @Value("${openai.api.key}")
  private String openAIKey;

  @Bean
  public WebClient openAiWebClient() {
    return WebClient.builder()
    .baseUrl("https://api.openai.com/vi")
    .defaultHeader("Content-Type", "application/json")
    .defaultHeader("Authorization", "Bearer" + openAIKey)
    .build();
  }

}
