package com.mentoring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Gabor_Istvan_Pogonyi on 9/8/2016.
 */
@Controller
public class Greeting {

    @RequestMapping("/greeting")
    @ResponseBody
    public String greeting() {
        return "Szijja Zoli!!";
    }
}
