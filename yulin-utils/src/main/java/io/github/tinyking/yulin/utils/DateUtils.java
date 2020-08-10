package io.github.tinyking.yulin.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateUtils.
 *
 * @author Wang Jianchao(tinyking)
 * <p>
 * Created on 2020/8/6
 */
public final class DateUtils {

    public final static String DATE = "yyyy-MM-dd";

    public static Date parse(String dateStr) throws ParseException {
        return parse(dateStr, DATE);
    }

    public static Date parse(String dateStr, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(dateStr);
    }

    public static String format(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
}
