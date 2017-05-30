package cn.hdlmx.bean;

/**
 * Created by handong on 2017/5/25.
 */

public class Car {
    private String brand;//品牌
    private double price;
    private double speed;

    public Car() {
    }

    public Car(String brand, double price, double speed) {
        this.brand = brand;
        this.price = price;
        this.speed = speed;
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "cn.hdlmx.bean.Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
