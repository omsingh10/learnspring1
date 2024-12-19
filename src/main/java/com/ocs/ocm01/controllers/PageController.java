package com.ocs.ocm01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


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

    //about controler
    
    @RequestMapping("/about") 
    // double quotes are important
    public String about(Model model){

        model.addAttribute("islogin" , true);


        System.out.println("About page handler");
    
        model.addAttribute("Youtube practice", "learning  spring");


        return "about";
    }

    //servercontroler
    @RequestMapping("/service")

    public String service( Model model) {

        System.out.println("Service page handler");



        return "service";
    }
    

}
