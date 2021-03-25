package com.sheliming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {

    private static final Logger logger  = LoggerFactory.getLogger(ProviderApplication.class);

    public static void main(String[] args) {
        logger.info("开始启动");
        SpringApplication.run(ProviderApplication.class, args);
    }
}
