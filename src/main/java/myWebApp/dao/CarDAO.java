package myWebApp.dao;

import org.springframework.stereotype.Component;
import myWebApp.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> auto;

    {
        auto = new ArrayList<>();

        auto.add(new Car("Red", "BMW", 5));
        auto.add(new Car("Black", "Opel", 3));
        auto.add(new Car("White", "VW", 6));
        auto.add(new Car("Yellow", "Ford", 2));
        auto.add(new Car("Blue", "Audi", 8));
    }

    public List<Car> index() {
        return auto;
    }

    public List<Car> getCountCars(int count) {
        return auto.subList(0, count);

    }
}
