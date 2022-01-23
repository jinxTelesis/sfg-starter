package com.dre.sfgstarter.model.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    // this is vets/index.html from the templates file structure
    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }


}
