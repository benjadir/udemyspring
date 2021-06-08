package com.udemy.cousedemo.springboot;

public class footballCoach implements Coach{

    private  FortuneService fortuneService;
    private String emailadress; //these are litteral value we want to inject in the
    private  String team; //the class using xml config file of spring boot
    @Override
    public String getWorkout() {
        return "the workout of the footbal coach";
    }
    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public String getEmailadress() {
        return emailadress;
    }

    public void setEmailadress(String emailadress) {
        this.emailadress = emailadress;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return "set dependancy Injection :"+this.fortuneService.getFortune();
    }
}
