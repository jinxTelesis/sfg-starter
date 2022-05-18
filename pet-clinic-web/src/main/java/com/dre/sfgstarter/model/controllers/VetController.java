package com.dre.sfgstarter.model.controllers;

import com.dre.sfgstarter.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    // this is vets/index.html from the templates file structure
    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(Model model){

        model.addAttribute("vets",vetService.findAll());

        return "vets/index";
    }


}
