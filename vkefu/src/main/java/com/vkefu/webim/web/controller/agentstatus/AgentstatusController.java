package com.vkefu.webim.web.controller.agentstatus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 坐席状态Controller
 * created by yxm 20180610 10:58:21
 */
@RestController
@RequestMapping("/vkefu/agentstatus")
public class AgentstatusController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
