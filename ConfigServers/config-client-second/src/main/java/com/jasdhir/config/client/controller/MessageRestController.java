package com.jasdhir.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController()
@RequestMapping("second")
class MessageRestController {
 
    @Value("${msg:Config Server is not working. Please check...}")
    private String msg;
    
    @Value("${shared.msg}")
    private String sharedMsg;
 
    @GetMapping("/msg")
    public String getMsg() {
        return this.msg;
    }
    
    @GetMapping("/shared")
    public String getSharedMsg() {
        return this.sharedMsg;
    }
    
    @GetMapping("/hi")
    public String getHi() {
        return "Hello ";
    }
}
