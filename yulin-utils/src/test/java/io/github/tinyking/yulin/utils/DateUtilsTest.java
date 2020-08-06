package io.github.tinyking.yulin.utils;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.Assert;
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

        System.out.println(parse.toString());
    }

    @Test
    public void testParse() {
    }
}
