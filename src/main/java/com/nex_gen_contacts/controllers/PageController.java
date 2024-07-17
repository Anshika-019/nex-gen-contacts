package com.nex_gen_contacts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home page handler");
        model.addAttribute( "title", "Home - NexGen Contacts");
        model.addAttribute( "content", "Welcome to the home page of NexGen Contacts");
        model.addAttribute( "currentYear", 2024);
        return "home";

    }

}
