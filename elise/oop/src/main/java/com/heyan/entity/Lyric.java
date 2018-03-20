package com.heyan.entity;

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
@Table(name = "ncm_lyric")
public class Lyric {
	@Id
	@GeneratedValue
	private Integer	id;

	private String	lyricText;

	private int songId;

	private int version;

	private boolean nolyric = false;

	private Date addTime;
	private Date updateTime;
}
