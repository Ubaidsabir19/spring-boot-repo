package com.seamless.firstProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachConstructorController {

    private final Coach myCoach;

    // It tells spring to inject a dependency
    // Used for Constructor injection
    @Autowired
    public CoachConstructorController(@Qualifier("baseBallCoach") Coach coach){
        myCoach = coach;
    }

    @GetMapping("/dailyWork")
    public String getDaily(){
        return myCoach.getDailyWorkOut();
    }

}
