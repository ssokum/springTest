package com.spring.springTest.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class SungjukVo {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private int tot;
	private double avg;
	private String grade;
}
