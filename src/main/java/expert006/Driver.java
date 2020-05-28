package main.java.expert006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("main/java/expert006/expert006.xml");

        Car car = context.getBean("car", Car.class);
        System.out.println(car.getTireBrand());
    }
}