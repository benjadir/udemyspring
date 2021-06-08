package com.udemy.cousedemo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbootcourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootcourseApplication.class, args);
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
      //  Coach coa=ctx.getBean("mycoach",Coach.class); //Coach INTERFACE CLASS BOTH WORK but there is diffrence
        footballCoach coa2= context.getBean("mycoach",footballCoach.class);
        System.out.println("footbal coatch mail: "+ ((footballCoach) coa2).getEmailadress());

       // System.out.println(coa.getDailyFortune());
        System.out.println(coa2.getDailyFortune());

    }


}
