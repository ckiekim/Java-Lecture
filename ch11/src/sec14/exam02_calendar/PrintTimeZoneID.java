package sec14.exam02_calendar;
import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
		
		TimeZone tz = TimeZone.getTimeZone("US/Pacific");
		Calendar nowLA = Calendar.getInstance(tz);
		System.out.print(nowLA.get(Calendar.MONTH)+1 +"월 ");
		System.out.print(nowLA.get(Calendar.DAY_OF_MONTH) +"일 ");
		int amPm = nowLA.get(Calendar.AM_PM);   
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전 ";
		} else {
			strAmPm = "오후 ";
		}
		System.out.print(strAmPm + nowLA.get(Calendar.HOUR) + "시 ");
		System.out.println(nowLA.get(Calendar.MINUTE) + "분");
	}
}
