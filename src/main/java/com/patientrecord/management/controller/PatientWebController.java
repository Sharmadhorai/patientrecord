package com.patientrecord.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PatientWebController {

    @GetMapping("/patientweb")
    public String loadpatient() {
        return "patientweb"; 
    }
}

