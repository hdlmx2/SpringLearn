package cn.hdlmx.factory;

import cn.hdlmx.bean.Car;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
    private static Map<String, Car> cars = new HashMap<String, Car>();

    static {
        cars.put("audi", new Car("audi", 20000));
        cars.put("ford", new Car("ford", 300000));
    }

    public static Car getCar(String name) {
        return cars.get(name);
    }
}
