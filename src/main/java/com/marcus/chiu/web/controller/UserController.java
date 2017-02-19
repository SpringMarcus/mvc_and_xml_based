package com.marcus.chiu.web.controller;

import com.marcus.chiu.web.SpringException;
import com.marcus.chiu.web.ControllerConfig;
import com.marcus.chiu.database.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by marcus.chiu on 9/29/16.
 */
@Controller
@RequestMapping(ControllerConfig.USER)
public class UserController {

    /**
     * passed a blank User object in the ModelAndView object
     * with name 'command' bc Spring Framework expects and object
     * with name 'command' if using <form:form></form:form> tags
     * in your JSP file.
     * So when user() is called it returns 'user.jsp' view
     * @return ModelAndView
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView user() {
        return new ModelAndView("user", "command", new User());
    }

    /**
     * addUser() will be called with POST method on HelloWeb/addStudent URL
     * prepares model object based on the submitted information
     * @param user
     * @param model
     * @return "result" view returned from the service method,
     * from the rendering of result.jsp
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ExceptionHandler(SpringException.class)
    public String addStudent(@ModelAttribute("SpringWeb")User user, ModelMap model) {
        if(user.getName().length() < 5) {
            throw new SpringException("Given name is too short");
        } else {
            model.addAttribute("name", user.getName());
        }

        if(user.getAge() < 10) {
            throw new SpringException("Given age is too low");
        } else {
            model.addAttribute("age", user.getAge());
        }

        model.addAttribute("id", user.getId());

        return "result";
    }
}
