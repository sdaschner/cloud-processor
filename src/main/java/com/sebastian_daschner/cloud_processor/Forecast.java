package com.sebastian_daschner.cloud_processor;

import javax.ejb.Stateless;
import java.util.Random;
import java.util.concurrent.locks.LockSupport;

@Stateless
public class Forecast {

    public String getSimple() {
        return computeForecast();
    }

    public String getExtensive() {
        waitRandomly();
        return computeForecast();
    }

    private void waitRandomly() {
        int waitTime = 1_000_000_000 * new Random().nextInt(4);
        LockSupport.parkNanos(waitTime);
    }

    private String computeForecast() {
        if (new Random().nextBoolean())
            return "sunny";
        return "cloudy";
    }

}
