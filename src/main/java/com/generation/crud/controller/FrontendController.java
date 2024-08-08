package com.generation.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

    @GetMapping("/")
    public String home() {
        return "redirect:/cadastrados";
    }

    @GetMapping("/cadastrados")
    public String cadastrados() {
        return "cadastrados";
    }
}
