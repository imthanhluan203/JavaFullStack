package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserManager userManagerOne = (UserManager) context.getBean("userDatabase");
        System.out.println(userManagerOne.getUserDetail());


        UserManager userManagerTwo = (UserManager) context.getBean("userWebservice");
        System.out.println(userManagerTwo.getUserDetail());
//        Name of user in database
//        User information from web service
    }
}
