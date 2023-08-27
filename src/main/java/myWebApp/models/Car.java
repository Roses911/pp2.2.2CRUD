package myWebApp.models;

import lombok.Data;

@Data
public class Car {
    private String color;
    private String model;
    private int series;

    public Car(String color, String model, int series) {
        this.color = color;
        this.model = model;
        this.series = series;
    }

    public Car() {
    }
}
