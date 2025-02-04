package com.example.Assignment1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
public class BankController {

    Model model;
    @GetMapping("/bankServices")
    String getBankAddress()
    {
        return "bankservices";
    }

    @GetMapping("/bankName")
    String getBankName()
    {
        return "bankname_nw";
    }


}
