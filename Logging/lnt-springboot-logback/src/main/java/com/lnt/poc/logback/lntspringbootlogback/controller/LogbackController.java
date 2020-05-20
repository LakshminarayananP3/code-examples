package com.lnt.poc.logback.lntspringbootlogback.controller;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogbackController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public void printLog(){
        logger.trace("trace log");
        logger.info("info log");
        logger.debug("debug log");
        logger.warn("warn log");
        logger.error("error log");
    }

    @GetMapping("/test")
    public void testSpringStart(){
        System.out.println("started test spring app...");

    }


}
