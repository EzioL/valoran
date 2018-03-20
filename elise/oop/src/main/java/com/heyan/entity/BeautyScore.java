package com.heyan.entity;

import java.math.BigDecimal;
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
@Table(name = "oop_beauty_score")
public class BeautyScore {
	@Id
	@GeneratedValue
	private Integer	id;
	private Integer	oopId;
	private String	imgUrl;
	private BigDecimal femaleScore;
	private BigDecimal maleScore;
	private Date addTime;
	private Date updateTime;
}
