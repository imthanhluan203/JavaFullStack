package car.example.autowiring.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Car myCar  = (Car) context.getBean("car3");
        myCar.displayDetails();
    }
}
