package com.mnmason6.songr.repositories;

import com.mnmason6.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {

}
