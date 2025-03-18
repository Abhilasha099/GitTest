package TestJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateTest {

	public static void main(String[] args) {


		//current date and current time
		
		Date date=new Date();
		System.out.println(date.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

		System.out.println(sdf.format(date));
		System.out.println(sdf1.format(date));
		//mm/dd/yyyy
		//HH:MM
		
		//Calander Demo
		
		Calendar cal= Calendar.getInstance();
		SimpleDateFormat sdf2=new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdf2.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.AM_PM)); 
	}

}
