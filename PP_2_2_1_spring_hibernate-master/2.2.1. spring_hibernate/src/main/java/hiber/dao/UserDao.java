package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> listUsers();

    void addCar(Car car);

    List<Car> listCars();

    List<Object[]> getUserByModelAndSeries(String model, int series);
}
