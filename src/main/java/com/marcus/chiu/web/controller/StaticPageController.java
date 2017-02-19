package com.marcus.chiu.web.controller;

import com.marcus.chiu.web.ControllerConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by marcus.chiu on 9/29/16.
 */
@Controller
@RequestMapping(ControllerConfig.STATIC_PAGE)
public class StaticPageController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "static_pages";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/pages/static.html";
    }
}
