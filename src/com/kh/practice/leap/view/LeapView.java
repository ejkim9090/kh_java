package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	private LeapController ctrl = new LeapController();
	public LeapView() {
//		2019년은 평년입니다.
//		총 날짜 수 : 73716
		//Calendar cal = Calendar.getInstance();   // Singleton pattern 싱글톤패턴
		Calendar cal = new GregorianCalendar(); // 지정 날짜 없으면 오늘 날짜
		cal.set(2020, 3, 15);   // 특정 날짜 지정
		//System.out.println(cal.getTime());
		int year = cal.getWeekYear();
		boolean isLeap = ctrl.isLeapYear(year);
		Formatter f = new Formatter(System.out);
		f.format("%d년은 %s입니다.\n", year, (isLeap)?"윤년":"평년");
		f.format("총 날짜 수: %d\n", ctrl.leapDate(cal));
		f.close();
	}
}
