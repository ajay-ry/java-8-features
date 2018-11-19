package com.exp.j8.joda.times;

import java.time.*;

public class JodaTimes {


    public static void local_date(){
        LocalDate ld = LocalDate.now();
        System.out.printf("%d-%d-%d",ld.getDayOfMonth(),ld.getMonth().getValue(),ld.getYear());

        LocalDate ld2 = LocalDate.of(2018,11,7);

        Period p = Period.between(ld,ld2);
        System.out.println("\nDiff:"+p.getDays());
    }

    public static void local_time(){
        LocalTime lt = LocalTime.now();
        System.out.printf("%d:%d:%d:%d",lt.getHour(),lt.getMinute(),lt.getSecond(),lt.getNano());

    }

    public static void local_date_time(){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.printf("%d-%d-%d:%d:%d:%d",ldt.getYear(),ldt.getMonth().getValue(),ldt.getDayOfMonth(),ldt.getHour(),ldt.getMinute(),ldt.getSecond());

        LocalDateTime ldt2 = LocalDateTime.of(LocalDate.of(2018,11,8),LocalTime.of(10,30));

        System.out.println(ldt2);
    }

    public static void zone_date_time(){
        ZoneId zoneId = ZoneId.of("Australia/Sydney");
        ZonedDateTime zone_date_time = ZonedDateTime.now(zoneId);
        System.out.printf("%d-%d-%d:%d:%d:%d",zone_date_time.getYear(),zone_date_time.getMonth().getValue(),zone_date_time.getDayOfMonth(),zone_date_time.getHour(),zone_date_time.getMinute(),zone_date_time.getSecond());

        ZonedDateTime new_zone_date_time = zone_date_time.plusDays(2);
        System.out.println();
        System.out.printf("%d-%d-%d:%d:%d:%d",new_zone_date_time.getYear(),new_zone_date_time.getMonth().getValue(),new_zone_date_time.getDayOfMonth(),new_zone_date_time.getHour(),new_zone_date_time.getMinute(),new_zone_date_time.getSecond());

    }



    public static void main(String[] args) {
        System.out.println("LocalDate...");
        local_date();
        System.out.println("LocalTime...");
        local_time();
        System.out.println("\nLocalDateTime...");
        local_date_time();
        System.out.println("ZoneDateTime...");
        zone_date_time();
    }
}
