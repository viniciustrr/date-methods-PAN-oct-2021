package OutrosPaises;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeZone {
	public static void main(String[] args) {
		Calendar euroCal = new GregorianCalendar(java.util.TimeZone.getTimeZone("Europe/Tiraspol"));
		System.out.println(euroCal.get(Calendar.HOUR_OF_DAY));
	}
}
