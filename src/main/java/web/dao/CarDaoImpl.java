package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    @Override
    public List<Car>  getCars() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Audi", "Red"));
        cars.add(new Car(2, "Zaporozhec", "White"));
        cars.add(new Car(3, "Mercedes", "Orange"));
        cars.add(new Car(4, "Chevrolet", "Black"));
        cars.add(new Car(5, "BMW", "Blue"));
        return cars;
    }

}
