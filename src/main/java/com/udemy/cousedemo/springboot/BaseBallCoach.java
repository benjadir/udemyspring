package com.udemy.cousedemo.springboot;

public class BaseBallCoach implements  Coach{
    //define the field of the dependency injection
    private FortuneService fortuneService;
    //then define a  constructor for the dependency injection;
    public  BaseBallCoach(FortuneService thefortuneservice){
        this.fortuneService=thefortuneservice;
    }
    @Override
    public String getWorkout() {
        return "baseBallcoach";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
