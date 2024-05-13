package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> listUsers();

    void addCar(Car car);

    List<User> getUserByModelAndSeries(String model, int series);
}
