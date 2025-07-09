import java.util.Scanner;
public class BirthdayDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Eneter Your date Of Barth onlay Date Like (15) :");
		int date=sc.nextInt();
		System.out.println("Enter Your birth month first 3 letter of month Like (jan):");
		String month=new Scanner(System.in).next().toUpperCase();
	    System.out.println("Enter Your Year of Barth like(2003):");
	    int year=sc.nextInt();	
		System.out.println(monthCode(month));
		System.out.println(getYearCode(year));
		
	}
	/*
	public static double lastDigitYear(int year){
		int num=year;
		while (num!=0)
		{
		}
		*/
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


}
