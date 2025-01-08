package com.sist.vo;

import lombok.Data;

/*
 * FNO                                                NUMBER(38)
 NAME                                               VARCHAR2(4000)
 TYPE                                               VARCHAR2(4000)
 PHONE                                              VARCHAR2(26)
 ADDRESS                                            VARCHAR2(4000)
 SCORE                                              NUMBER(38,1)
 THEME                                              VARCHAR2(4000)
 POSTER                                             VARCHAR2(4000)
 IMAGES                                             VARCHAR2(4000)
 TIME                                               VARCHAR2(128)
 PARKING                                            VARCHAR2(4000)
 CONTENT                                            VARCHAR2(4000)
 * 
 * 
 * 
 * 
 */
@Data
public class FoodVO {
	private int fno;
	private String name, type, phone, address, theme, poster, image, time, parking, content;
	private double score;
}
