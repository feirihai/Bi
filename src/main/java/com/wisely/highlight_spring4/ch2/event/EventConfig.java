package com.wisely.highlight_spring4.ch2.event;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class EventConfig {
    @Bean
    DemoPublisher demoPublisher(){
        return new DemoPublisher();
    }
    @Bean
    DemoEvent demoEvent(){
        return new DemoEvent(this,"ssssss");
    }
    @Bean
    DemoListener demoListener(){
        return new DemoListener();
    }
}
