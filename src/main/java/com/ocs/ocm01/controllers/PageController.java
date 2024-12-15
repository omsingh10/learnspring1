package com.ocs.ocm01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {

    @RequestMapping("/home") 
    // double quotes are important
    public String home(Model model){


        System.out.println("Home page handler");
        model.addAttribute("name", "shiv is superhero");
        model.addAttribute("Youtube practice", "learning  spring");


        return "home";
    }

}
