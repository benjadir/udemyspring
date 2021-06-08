package com.udemy.cousedemo.springboot;

public class footballCoach implements Coach{
    private  FortuneService fortuneService;
    @Override
    public String getWorkout() {
        return "the workout of the footbal coach";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return "set dependancy Injection :"+this.fortuneService.getFortune();
    }
}
