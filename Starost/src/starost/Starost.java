package starost;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Starost {
    public static void main(String[] args) {
        LocalDate now1 = LocalDate.now();
        LocalDate birthday = LocalDate.of(2006, Month.NOVEMBER, 21);
 
Period p = Period.between(birthday, now1);
long p2 = ChronoUnit.DAYS.between(birthday, now1);
long p3 = ChronoUnit.MONTHS.between(birthday, now1);
 
System.out.println("Imas " + p.getYears() + " godina, " + p.getMonths() + " meseci, i " + p.getDays() + " dana. (" + p2 + " dana ukupno ili " + p3 + " meseci)");

    Date now = new Date(); // now
Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("sr"));
calendar.setTime(now);

calendar.add(Calendar.HOUR, 12); // now + 12h
calendar.add(Calendar.MINUTE, 00);
Date start = calendar.getTime();

calendar.add(Calendar.HOUR, 10); // now + 22h
calendar.add(Calendar.MINUTE, 00);
Date end = calendar.getTime();

long diff = end.getTime() - start.getTime();
System.out.print(diff / (60 * 60 * 1000) % 24 + " hours, ");
System.out.println(diff / (60 * 1000) % 60 + " minutes");
    
    }
    }
    

