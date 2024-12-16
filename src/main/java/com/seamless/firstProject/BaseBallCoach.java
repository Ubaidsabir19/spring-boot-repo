package com.seamless.firstProject;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Get 30 minutes of batting";
    }
}
