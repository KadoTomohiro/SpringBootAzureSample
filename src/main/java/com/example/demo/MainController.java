package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by riaux03 on 2017/06/15.
 */
@Controller
public class MainController {
    @RequestMapping("/")
    public String mainpage(Model model) {
        return "mainpage";
    }
}
