package com.dre.sfgstarter.model.controllers;

import com.dre.sfgstarter.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    public String listOwners(Model model){

        model.addAttribute("owners",ownerService.findAll());

        return "owners/index";
    }

}
