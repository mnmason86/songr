package com.mnmason6.songr.controllers;


import com.mnmason6.songr.models.Album;
import com.mnmason6.songr.repositories.SongrAlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    SongrAlbumRepository songrAlbumRepository;

    @GetMapping("/")
    public String getSongrAlbums(Model m){
        Album[] albums = SongrAlbumRepository.findAll();
        m.addAttribute("albums", albums);
        return "albums";
    }

    @PostMapping("addAlbum")
    public RedirectView addAlbum(String title, String artist, int songCount,
                                 int length, String imageUrl){
        Album newAlbum = new Album(title,artist, songCount, length, imageUrl);
        songrAlbumRepository.save(newAlbum);
        return new RedirectView("/");
    }

}
