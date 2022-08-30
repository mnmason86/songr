package com.mnmason6.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

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

    @GetMapping("/albums")
    public String getAlbums(Model m){
        Album[] albumList = Album.listAlbums();
        m.addAttribute("albumList", albumList);
        return "albums";
    }

}
