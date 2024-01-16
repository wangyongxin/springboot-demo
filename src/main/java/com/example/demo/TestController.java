package com.example.demo;

import io.sentry.Sentry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    public Object test(){
        try {
            Random random = new Random();
            throw new Exception("This is a test." + random.nextInt());
        } catch (Exception e) {
//            Sentry.captureException(e);
            log.error("错误", e);
        }
        return List.of(1, 2, 3);
    }

    @GetMapping("/test2")
    public Object test2(){
        try {
            Random random = new Random();
            throw new Exception("This is a test2." + random.nextInt());
        } catch (Exception e) {
//            Sentry.captureException(e);
            log.error("错误2", e);
        }
        return List.of(1, 2, 3);
    }

    @GetMapping("/test3")
    public Object test3(){
        try {
            Random random = new Random();
            throw new Exception("This is a test3." + random.nextInt());
        } catch (Exception e) {
//            Sentry.captureException(e);
            log.error("错误3", e);
        }
        return List.of(1, 2, 3);
    }

}
