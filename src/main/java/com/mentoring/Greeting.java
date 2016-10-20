package com.mentoring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Gabor_Istvan_Pogonyi on 9/8/2016.
 */
@Controller
public class Greeting {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@ModelAttribute("model")ModelMap model) {

        return "login";
    }
}
