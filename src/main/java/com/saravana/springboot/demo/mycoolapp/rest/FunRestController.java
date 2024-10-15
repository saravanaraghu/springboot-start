package com.saravana.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamInfo;
    //expose "/"  that return "Hello world"
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!!!";
    }
    @GetMapping("/world")
    public String sayWold(){
        return "World is big";
    }
    @GetMapping("/")
    public String sayNothing(){
        return "Nothing is permanent";
    }

    @GetMapping("/coach")
    public String getCoachName(){
        return coachName;
    }
    @GetMapping("/team")
    public String getTeamInfo(){
        return teamInfo;
    }
    @GetMapping("/teaminfo")
    public String getTeam(){
        return "Coach: " + coachName + "Team Representing: "+ teamInfo;
    }
    @GetMapping("/Ajitheyy")
    public String giveAjith(){
        return "KADAVULEY AJITHEY..!!";
    }

}
