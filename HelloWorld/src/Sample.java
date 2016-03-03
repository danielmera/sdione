import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;

public class Sample {

	public static void main(String[] args) throws ParseException {
		String inputDate = "27-06-2008 15:51:20";
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date myDate = format.parse(inputDate);
		System.out.println(myDate);
	}
}
