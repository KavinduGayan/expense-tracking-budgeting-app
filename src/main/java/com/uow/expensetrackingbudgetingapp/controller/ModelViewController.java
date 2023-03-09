package com.uow.expensetrackingbudgetingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelViewController {

    @GetMapping("")
    public String getHomePage() {
        return "index";
    }
}
