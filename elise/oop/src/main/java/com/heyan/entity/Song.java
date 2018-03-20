package com.heyan.entity;

import com.heyan.domain.PlayListRep;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Created by Ezio on 2018/2/27.
 */
@Data
@Entity
@Table(name = "ncm_song")
public class Song {
	@Id
	@GeneratedValue
	private Integer id;

	private Integer ncmId;

	private String name;
	private int singerId = 0;
	private String singerName;

	private Date addTime;
	private Date updateTime;

	public static Song translationFromTrack(PlayListRep.PlaylistBean.TracksBean e) {
		Song song = new Song();
		song.setNcmId(e.getId());
		song.setName(e.getName());
		song.setSingerName(e.getAr().get(0).getName());
		return song;
	}
}
