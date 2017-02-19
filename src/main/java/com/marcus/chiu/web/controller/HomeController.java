package com.marcus.chiu.web.controller;

import com.marcus.chiu.web.ControllerConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by marcus.chiu on 9/28/16.
 * @Controller - defines the class as a Spring MVC controller
 * @RequestMapping("/hello") - indicates all handling methods on this
 * controller are relative to the /hello path
 */
@Controller
@RequestMapping(ControllerConfig.HOME)
public class HomeController {

    // @RequestMapping(method = RequestMapping.GET) - declares method
    // as default service method to handle HTTP GET request
    @RequestMapping(value = "")
    public String home() {
        return "home";
    }
}
