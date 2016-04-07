
public class DayCalculator {
	private String[] dayNames = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
	int[] numberOfMonthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getTotalDays(int year, int month, int day){
		int totalDays=0;
		
		for(int yearIndex=1 ; yearIndex < year ; year++)
			totalDays += 365;
		
		
		for(int monthIndex = 1 ; monthIndex < month ; monthIndex++ ){
			totalDays += numberOfMonthDay[monthIndex];	
		}
		
		return totalDays;
	}
	
	public String getDay(int year, int month, int day){
		int totalDays=getTotalDays(year, month, day);
		
		totalDays += day;
		
		return dayNames[totalDays%7];
	}

	public static boolean isLeap(int year) {
		if(year % 400 == 0) return true;
		else if(year % 100 == 0) return false;
		else if(year % 4 == 0) return true;
		else return false;
	}
}
