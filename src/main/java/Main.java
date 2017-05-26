import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by handong on 2017/5/25.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        Car car3=(Car) ctx.getBean("car3");
        System.out.println(car3);

        Person2 person3=(Person2)ctx.getBean("person3");
        System.out.println(person3);

    }
}
