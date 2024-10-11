package com.smarthome.smarthome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Punkt dostepu
public class HomeController {

    @GetMapping("/") // Mapowanie na adres
    public String home() {
        return "Homepage";
    }
}
