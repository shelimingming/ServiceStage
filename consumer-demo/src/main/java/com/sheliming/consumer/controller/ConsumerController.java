package com.sheliming.consumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("consumer")
    public String hello(String name) {
        logger.info("consumer:"+name);
        return restTemplate.getForObject("http://provider/hello", String.class);

    }
}
