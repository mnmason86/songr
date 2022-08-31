package com.mnmason6.songr.repositories;

import com.mnmason6.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongrAlbumRepository extends JpaRepository<Album, Long>{
    public Album find
}
