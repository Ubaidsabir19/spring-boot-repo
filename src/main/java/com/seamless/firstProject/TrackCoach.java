package com.seamless.firstProject;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Run a hard 5k";
    }
}
