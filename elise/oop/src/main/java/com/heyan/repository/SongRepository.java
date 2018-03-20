package com.heyan.repository;

import com.heyan.entity.Song;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ezio on 2018/2/27.
 */
public interface SongRepository extends JpaRepository<Song, Integer> {


}
