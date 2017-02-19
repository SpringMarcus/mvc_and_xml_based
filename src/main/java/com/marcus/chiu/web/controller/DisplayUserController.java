package com.marcus.chiu.web.controller;

import com.marcus.chiu.database.UserDaoJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by marcus.chiu on 10/2/16.
 */
@Controller
@RequestMapping("/display_user")
public class DisplayUserController {

    @Autowired
    private UserDaoJdbc userDaoJdbc;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String display(ModelMap model) {
        model.addAttribute("data", userDaoJdbc.getUser(2).toString());

        return "display_user";
    }
}
