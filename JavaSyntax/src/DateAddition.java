import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;

/**
 * TODO: Document me!
 *
 * @author kalpap
 *
 */
public class DateAddition {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String LegalYearDob = "2015";
        int NoOfDays = 12;

        String LegalIDMand = "645030275V";
        String LegalYearDob1 = LegalIDMand.substring(0, 2);
        System.out.println(LegalYearDob1);

        String LegalDob = LegalYearDob + "-01-01";
        SimpleDateFormat LegalDobFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar CalenderInstance = Calendar.getInstance();
        try {
            CalenderInstance.setTime(LegalDobFormat.parse(LegalDob));
        } catch (ParseException excep) {
            excep.printStackTrace();
        }
        CalenderInstance.add(Calendar.DAY_OF_MONTH, NoOfDays);
        String LegalDobDate = LegalDobFormat.format(CalenderInstance.getTime());
        System.out.println(LegalDobDate);
        LegalDobDate = LegalDobDate.toString().replace("-", "");
        System.out.println(LegalDobDate);

    }
}