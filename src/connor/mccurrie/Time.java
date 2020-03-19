package connor.mccurrie;

import java.util.concurrent.ThreadLocalRandom;

public class Time {
    private int hours;

    public Time() {
        hours = 0;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public int getTimeIn(){
        int randomTime = ThreadLocalRandom.current().nextInt(7, 12);
        return randomTime;
    }

    public int getTimeOut(){
        int randomTime = ThreadLocalRandom.current().nextInt(1, 11);
        return randomTime;
    }
}
