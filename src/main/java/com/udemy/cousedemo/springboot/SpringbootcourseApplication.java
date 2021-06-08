package com.udemy.cousedemo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbootcourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootcourseApplication.class, args);
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coa=ctx.getBean("mycoach",Coach.class); //Coach INTERFACE CLASS BOTH WORK
        Coach coa2=ctx.getBean("mycoach",footballCoach.class);
        System.out.println(coa.getDailyFortune());
        System.out.println(coa2.getDailyFortune());

    }


}
