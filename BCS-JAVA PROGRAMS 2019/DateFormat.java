import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class DateFormat{
	public static void main(String args[]) throws ParseException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=sdf.parse("2018-12-31");
		Date date2=sdf.parse("2019-01-01");
		System.out.println("date1 :" +sdf.format(date1));
		System.out.println("date2 :" +sdf.format(date2));
		if(date1.compareTo(date2)>0){
			System.out.println("Date1 is after Date2");
		}
		else if(date1.compareTo(date2)<0){
			System.out.println("Date1 is before Date2");
		}
		else if(date1.compareTo(date2)==0){
			System.out.println("Date1 is equal to Date2");
		}
		else{
			System.out.println("Something went wrong!!!");
		}
		Date date=new Date();
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		String strDate=sdf.format(date);
		System.out.println("Date format with dd-MM-yyyy : "+strDate);

		sdf=new SimpleDateFormat("dd MMMM yyyy");
		strDate=sdf.format(date);
		System.out.println("Date format with dd MMMM yyyy : "+strDate);

		sdf=new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate=sdf.format(date);
		System.out.println("Date format with dd MMMM yyyy zzzz : "+strDate);

		sdf=new SimpleDateFormat("E,dd MMMM yyyy HH:mm:ss z");
		strDate=sdf.format(date);
		System.out.println("Date format with E,dd MMMM yyyy HH:mm:ss z :"+strDate);
	}
}