import cn.hdlmx.bean.Car;

import java.util.List;

/**
 * Created by handong on 2017/5/25.
 */
public class Person2 {
    private String name;
    private int age;
    List<Car> car;

    public Person2() {
    }

    public Person2(String name, int age, List<Car> car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
