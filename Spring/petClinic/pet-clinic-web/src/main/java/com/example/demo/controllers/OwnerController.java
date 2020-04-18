package com.example.demo.controllers;

import lombok.extern.slf4j.Slf4j;
import com.example.demo.model.Owner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.services.OwnerService;

import java.util.List;
@Slf4j

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    private final OwnerService ownerService;
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwner(Model model){
        model.addAttribute("owners", ownerService.findAll());
        log.debug("hello i am in list oweners");
        return "owners/index";
    }

    @RequestMapping("/find")
    public String initFindOwners(Model model){
        model.addAttribute("owner", new Owner());
        log.debug("hello i am in find oweners init");
        return "owners/findOwners";
    }

    @GetMapping
    public String processFindForm(Owner owner, BindingResult result, Model model){
        if (owner.getLastName() == null){
            owner.setLastName("");
        }
        List<Owner> list = ownerService.findAllByLastName("%" + owner.getLastName() + "%");
        //System.out.println("list size: " + list.size());

        if (list.isEmpty()){
            result.rejectValue("lastName", "notFound", "notFound");
            log.debug("i am empty as hell");
            return "owners/findOwners";
        } else if (list.size()== 1){
            owner = list.get(0);
            return "redirect:/owners/" + owner.getId();
        } else{
            model.addAttribute("selections", list);
            return "owners/ownersList";
        }
    }





}
