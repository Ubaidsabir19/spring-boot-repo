//package com.seamless.firstProject;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class CoachSetterController {
//
//    private Coach myCoach;
//
//    // Used for setter injection
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }
//
//    @GetMapping("/dailyWork")
//    public String getDaily(){
//        return myCoach.getDailyWorkOut();
//    }
//
//}
