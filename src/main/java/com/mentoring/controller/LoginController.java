package com.mentoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error
            , @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView modelAndView = new ModelAndView();

        if (error != null) {
            modelAndView.addObject("error", "Invalid Credentials provided.");
        }

        if (logout != null) {
            modelAndView.addObject("message", "Logged out from this shit successfully.");
        }

        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = { "customer"}, method = RequestMethod.GET)
    public ModelAndView customerPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("customer");
        return model;
    }
}
