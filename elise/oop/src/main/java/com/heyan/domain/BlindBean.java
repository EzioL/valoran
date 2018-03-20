package com.heyan.domain;

import java.util.Date;

import lombok.Data;

/**
 * Created by Ezio on 2018/2/19.
 */
@Data
public class BlindBean {
	//情况
	Integer id;
	String title;
	String distanceNow;
	Date birth;
	Integer height;//cm
	Integer weight;//kg
	String city;
	String job;
	String parent;
	String family;
	String income;
	String longDistanceLove;
	String marryTime;
	String childCount;
	//对另一半要求
	String education;
	String minimumrRequirements;
	String specialRequirements;

}
