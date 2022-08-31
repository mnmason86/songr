package com.mnmason6.songr.controllers;

import com.mnmason6.songr.models.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }

    @GetMapping("/capitalize/{word}")
    public String getCapitalize(@PathVariable String word, Model m){
        m.addAttribute("word", word.toUpperCase());
        return "capitalize";
    }

}
