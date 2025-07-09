import java.util.Scanner;
public class BirthdayDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Eneter Your date Of Barth onlay Date Like (15) :");
		int date=sc.nextInt();
		System.out.println("Enter Your birth month first 3 letter of month Like (jan):");
		//String month=new Scanner(System.in).next().toUpperCase();
		String month=sc.next().toUpperCase();
	    System.out.println("Enter Your Year of Barth like(2003):");
	    int year=sc.nextInt();
		System.out.println("Date is: "+date);
		System.out.println("MonthCode Is: "+monthCode(month));
		int assingMonthCode=monthCode(month);
		System.out.println("Year Code is: "+getYearCode(year));
		int assingYearCode=getYearCode(year);
		System.out.println("Last Digit Of Year Is: "+lastDigitYear(year));
		int quatient1=lastDigitYear(year);
		int quatientYear=quatientOfYear(quatient1);
		System.out.println("Quatient of year Is: "+quatientYear);
		
		// Total/7
		int total=date + assingMonthCode + assingYearCode + quatientYear+quatient1;
		System.out.println("Total is: "+total);
		
		int isdayNumber=total%7;
		System.out.println("Day Num is:"+isdayNumber);
		if (year%4==0)
		{
			if ((date>=1 && month.equals("JAN"))&& (date<=29 && month.equals("feb")))
			{
				isdayNumber=isdayNumber-1;
				System.out.println("Day is:"+getDay(isdayNumber));	
			}
		}
		System.out.println("Day is:"+getDay(isdayNumber));
		
	}
	public static int quatientOfYear(int quatient1){
		int quatient2 = quatient1/4;
		return quatient2;
		
	}
	
	public static int lastDigitYear(int year){
		int lastTwoDigit =year%100;
		return lastTwoDigit;			
	}
	// Method Get Month Code
	public static int monthCode(String month){
		if (month.equals("JAN"))
		{
			return 0;
		}
		if (month.equals("FEB"))
		{
			return 3;
		}
		if (month.equals("MAR"))
		{
			return 3;
		}
		if (month.equals("APR"))
		{
			return 6;
		}
		if (month.equals("MAY"))
		{
			return 1;
		}
		if (month.equals("JUNE"))
		{
			return 4;
		}
		if (month.equals("JULAY"))
		{
			return 6;
		}
		if (month.equals("AUG"))
		{
			return 2;
		}
		if (month.equals("SEP"))
		{
			return 5;
		}
		if (month.equals("OCT"))
		{
			return 0;
		}
		if (month.equals("NOV"))
		{
			return 3;
		}
		if (month.equals("DEC"))
		{
			return 5;
		}
		return 0;
		
	}
	
	public static int getYearCode(int year){
		if (year>=1600 && year<=1699)
		{
			return 6;
		}
		if (year>=1700 && year<=1799)
		{
			return 4;
		}
		if (year>=1800 && year<=1899)
		{
			return 2;
		}
		if (year>=1900 && year<=1999)
		{
			return 0;
		}
		if (year>=2000 && year<=2099)
		{
			return 6;
		}
		if (year>=2100 && year<=2199)
		{
			return 4;
		}
		if (year>=2200 && year<=2299)
		{
			return 2;
		}
		return 0;
	}
	
	public static String getDay(int num) {
    if (num == 1) {
        return "Monday";
    }
    if (num == 2) {
        return "Tuesday";
    }
    if (num == 3) {
        return "Wednesday";
    }
    if (num == 4) {
        return "Thursday";
    }
    if (num == 5) {
        return "Friday";
    }
    if (num == 6) {
        return "Saturday";
    }
    if (num == 0) {
        return "Sunday";
    }
    return "Wrong Choice";
}



}
