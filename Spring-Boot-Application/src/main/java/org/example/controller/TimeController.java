package org.example.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
@RestController
public class TimeController {

    @GetMapping("/status")
    public String getCurrentTime () {
        LocalTime currentTime = LocalTime.now();
        return "Running "+currentTime;
    }
}
