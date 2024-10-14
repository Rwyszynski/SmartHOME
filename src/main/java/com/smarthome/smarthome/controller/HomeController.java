package com.smarthome.smarthome.controller;

import com.smarthome.smarthome.model.Component;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.math.BigDecimal;

@Controller //Punkt dostepu
public class HomeController {

    @GetMapping("/") // Mapowanie na adres
    public String home(Model model) {
        model.addAttribute("Component", new Component("Manipulator1", "Manipulator", "Jakiś opis", new BigDecimal("750"), "https://help.ampio.com/assets/modules/M-DIM-2s/600x600.png"));
        return "Homepage";
    }
}
