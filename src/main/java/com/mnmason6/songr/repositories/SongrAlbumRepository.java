package com.mnmason6.songr.repositories;

import com.mnmason6.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

//Facilitates communication between database and controller
public interface SongrAlbumRepository extends JpaRepository<Album, Long>{
    public Album findByTitle(String title);
    public Album findByArtist(String artist);
}
