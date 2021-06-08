package com.udemy.cousedemo.springboot;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    public CricketCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    @Override
    public String getWorkout() {
        return  "...cricket workout coach running ...";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    @Override
    public String getEmailadress() {
        return null;
    }
}
