package com.mnmason6.songr.controllers;


import com.mnmason6.songr.models.Album;
import com.mnmason6.songr.repositories.SongrAlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {
    @Autowired
    SongrAlbumRepository songrAlbumRepository;

    @GetMapping("/")
    public String getAlbums(Model m){
        List<Album> albumList = songrAlbumRepository.findAll();
        m.addAttribute("albumList", albumList);
        return "albums";
    }

    @PostMapping("/")
    public RedirectView addAlbum(String title, String artist, Integer songCount,
                                 Integer length, String imageUrl){
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        songrAlbumRepository.save(newAlbum);
        return new RedirectView("/");
    }

}
