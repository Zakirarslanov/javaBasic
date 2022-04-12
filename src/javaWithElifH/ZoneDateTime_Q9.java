package javaWithElifH;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDateTime_Q9 {
    // Baska ülke veya bolgelerin saat dilimine gore zamani alma
    // New york un saat dilimine gore saat ?
    // zoneId Link :https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
        //String ifade onemli, hatsiz yazilmasi gerek.. yoksa Unknown time-zone ID hatasi verir
        ZonedDateTime zdtLocal =ZonedDateTime.now(); //yerelde bulundugunuz yerin zamanini verir
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm" ); //istenilen formatta
        System.out.println("zdt = " + zdt.format(format));
        System.out.println("zdtLocal = " + zdtLocal.format(format));
    }
}
