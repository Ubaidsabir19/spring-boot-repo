package com.seamless.firstProject;
import org.springframework.stereotype.Component;

// @Component mark the class as a Spring bean
@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 minutes, Now!!!";
    }
}
