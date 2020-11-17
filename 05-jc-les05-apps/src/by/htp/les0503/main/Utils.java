package by.htp.les0503.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static Date createTime(String timeString) {

        try {
            DateFormat format = new SimpleDateFormat("HH:mm");
            Date date = format.parse(timeString);
            return date;
        } catch (Throwable t) {
            return null;
        }
    }
}

