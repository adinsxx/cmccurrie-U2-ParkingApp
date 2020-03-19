package last.one;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Time {
    private int hours;
    private String pattern = "HH";

    public Time() {
        hours = 0;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public int getTimeIn(){
        int randomTime = ThreadLocalRandom.current().nextInt(7, 12);
        String randomHour = Integer.toString(randomTime);
        DateFormat standard = new SimpleDateFormat(pattern);
        return randomTime;
    }

    public int getTimeOut(){
        int randomTime = ThreadLocalRandom.current().nextInt(1, 11);
        String randomHour = Integer.toString(randomTime);
        DateFormat standard = new SimpleDateFormat(pattern);
        return randomTime;
    }
}
