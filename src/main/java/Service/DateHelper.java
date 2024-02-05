package Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateHelper {
    public Calendar stringToCalendar (String str, String format) {
        SimpleDateFormat ft = new SimpleDateFormat (format);
        Calendar cDate = GregorianCalendar.getInstance();
        Date parsingDate;
        try {
            parsingDate = ft.parse(str);
            cDate.setTime(parsingDate);
        } catch (ParseException e) {
            return null;
        }
        return cDate;
    }

    public String calendarToString (Calendar calendar) {
        String[] months = {"01", "02", "03", "04", "05", "06", "07", "08", "09",
                "10", "11", "12"};
        return calendar.get(Calendar.DATE) + "."
                + months[calendar.get(Calendar.MONTH)] + "."
                + calendar.get(Calendar.YEAR);
    }
}
