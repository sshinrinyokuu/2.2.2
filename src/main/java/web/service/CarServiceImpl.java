package web.service;


import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car>  getCars(Integer count) {
        if (count == null) {
            return carDao. getCars();
        }
        return carDao. getCars().stream().limit(count).toList();
    }
}
