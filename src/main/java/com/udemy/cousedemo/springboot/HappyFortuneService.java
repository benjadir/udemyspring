package com.udemy.cousedemo.springboot;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "THE HAPPY FORTUNE SERVICE OF THE COACH";
    }
}
