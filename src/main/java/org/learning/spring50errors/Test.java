package org.learning.spring50errors;

import java.util.Calendar;

/**
 * @author lizhiyong <lizhiyong@kuaishou.com>
 * Created on 2023-03-14
 */
public class Test {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 3, 1);
        System.out.println(calendar.getWeekYear());
        System.out.println(calendar.getWeeksInWeekYear());
    }
}
