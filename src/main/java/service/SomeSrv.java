package service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class SomeSrv {
    public final long MINUTE = 1000 * 60;
    public int add(int a, int b) {
        return a+b;
    }

    //every hour
    @Scheduled(fixedRate = 500)
    public void printTime() {
        System.out.println(Instant.now());
    }
}
