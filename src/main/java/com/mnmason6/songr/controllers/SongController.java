package com.mnmason6.songr.controllers;


import com.mnmason6.songr.models.Album;
import com.mnmason6.songr.models.Song;
import com.mnmason6.songr.repositories.SongRepository;
import com.mnmason6.songr.repositories.SongrAlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;
    @Autowired
    SongrAlbumRepository songrAlbumRepository;

    @GetMapping("/songs")
    public String getAllSongs(Model m){
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "all-songs";
    }

    @PostMapping("/songs")
    public RedirectView addSongToAlbum(String songTitle, Integer length,
                                       Integer trackNumber, String album){
        Album foundAlbum = songrAlbumRepository.findByTitle(album);
        Song newSong = new Song(songTitle, length, trackNumber, foundAlbum);
        songRepository.save(newSong);

        return new RedirectView("/songs");
    }
}
