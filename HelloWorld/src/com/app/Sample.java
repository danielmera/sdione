package com.app;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;

public class Sample {

	public static void main(String[] args){
		doSomething();
	}

	public static void doSomething() {
		String inputDate = "27-06-2008 15:51:20";
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		try {
			Date myDate = format.parse(inputDate);
			System.out.println(myDate);
			System.out.println(new Date());
			for(int i=0;i<5;i++){
				System.out.println(i);
			}
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}
}
