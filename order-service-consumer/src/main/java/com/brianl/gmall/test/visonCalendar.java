package com.brianl.gmall.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-05-14 14:47
 */
public class visonCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String temp = df.format(calendar.getTime());
        try {
            Date date = df.parse(temp);
            calendar.setTime(date);
            int day = calendar.get(Calendar.DATE);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            int FirstDay = calendar.get(Calendar.DAY_OF_WEEK);
            int maxDate   = calendar.getActualMaximum(Calendar.DATE);
            System.out.println(FirstDay);

            System.out.println("日\t一\t二\t三\t四\t五\t六");
            for(int i = 1; i <= maxDate; i++ ){
                if (i == day){
                    System.out.print("*");
                }
                while((FirstDay-1)>0){   //按照需要打印的格式，本月1号从第FirstDay天开始，所以前面需要（FirstDay-1）个" \t"
                    System.out.print(" \t");
                    FirstDay--;
                }

                System.out.print(i+"\t");
                int w = calendar.get(Calendar.DAY_OF_WEEK);
                if(w == Calendar.SATURDAY){  //每到周六换行
                    System.out.print("\n");
                }
                calendar.add(Calendar.DATE, 1);  //从1号开始打印，每次打印完日期加1，否则换行if判断无效

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
