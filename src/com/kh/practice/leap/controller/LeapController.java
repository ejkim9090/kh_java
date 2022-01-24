package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		boolean result = false;
		GregorianCalendar cal = new GregorianCalendar();  
		// 자료형 GregorianCalendar 사용 --> isLeapYear() 접근 가능
		result = cal.isLeapYear(year);
		return result;
	}
	public long leapDate(Calendar c) {
		long result = 0;
//		Calendar c1 = new GregorianCalendar(1, 1, 1);  // 1년 1월 1일
		Calendar c1 = new GregorianCalendar(2019, 3, 15);  // 2020년 3월 15일 
		long diffTime = c.getTimeInMillis() - c1.getTimeInMillis();
		result = diffTime / 24 / 60 / 60 / 1000; // 1일 = 24시간/60분/60초/1000millis
		return result;
	}

}
