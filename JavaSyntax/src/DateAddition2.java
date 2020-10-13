import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;

/**
 * TODO: Document me!
 *
 * @author kalpap
 *
 */
public class DateAddition2 {

    /**
     * @param args
     * @throws ParseException 
     */
    public static void main(String[] args) throws ParseException {
        // TODO Auto-generated method stub
System.out.println("In Application");
        Date d = "2012-01-14";
        sdfgjhs
        LocalDate localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String DateFormatted = "";
        if (localDate.getMonthValue() < 10) {
            DateFormatted = Integer.toString(localDate.getYear()) + "0" + Integer.toString(localDate.getMonthValue())
                    + Integer.toString(localDate.getDayOfMonth());
        } else {
            DateFormatted = Integer.toString(localDate.getYear()) + Integer.toString(localDate.getMonthValue())
                    + Integer.toString(localDate.getDayOfMonth());
        }

        SimpleDateFormat format3 = new SimpleDateFormat("yyyymmdd");
        Date date3 = format3.parse(DateFormatted);
        System.out.println( date3);
    }
}