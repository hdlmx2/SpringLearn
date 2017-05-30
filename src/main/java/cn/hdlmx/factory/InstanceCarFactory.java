package cn.hdlmx.factory;

import cn.hdlmx.bean.Car;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
    private Map<String, Car> cars = null;

    public InstanceCarFactory() {
        cars = new HashMap<String, Car>();
        cars.put("audi", new Car("audi", 200000));
        cars.put("ford", new Car("ford", 300000));
    }

    public Car getCars(String name) {
        return cars.get(name);
    }
}
