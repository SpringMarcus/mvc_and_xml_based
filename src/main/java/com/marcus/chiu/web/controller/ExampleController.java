package com.marcus.chiu.web.controller;

import com.marcus.chiu.database.UserDaoJdbc;
import com.marcus.chiu.example.BeanExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by marcus.chiu on 10/3/16.
 */
@Controller
@RequestMapping("/example")
public class ExampleController {

    @Autowired
    private BeanExample beanExample;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String display(ModelMap model) {
        model.addAttribute("data", beanExample.getRandomNumber());

        return "example";
    }
}
