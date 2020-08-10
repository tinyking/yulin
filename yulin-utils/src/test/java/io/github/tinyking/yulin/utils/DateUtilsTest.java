package io.github.tinyking.yulin.utils;

import static java.util.Calendar.YEAR;
import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * DateUtilsTest.
 *
 * @author Wang Jianchao(tinyking)
 * <p>
 * Created on 2020/8/6
 */
public class DateUtilsTest {

    @Test
    public void parse() throws ParseException {
        String dateStr = "2020-08-06";
        Date parse = DateUtils.parse(dateStr);

        Calendar instance = Calendar.getInstance();
        instance.setTime(parse);
        assertEquals(2020, instance.get(YEAR));
    }

    @Test
    public void testParse() {
    }
}
