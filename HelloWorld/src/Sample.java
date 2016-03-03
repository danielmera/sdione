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
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}
}
