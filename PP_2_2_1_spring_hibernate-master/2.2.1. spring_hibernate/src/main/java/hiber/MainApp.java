package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

//        userService.addUser(new User("User1", "Lastname1", "user1@mail.ru"));
//        userService.addUser(new User("User2", "Lastname2", "user2@mail.ru"));
//        userService.addUser(new User("User3", "Lastname3", "user3@mail.ru"));
//        userService.addUser(new User("User4", "Lastname4", "user4@mail.ru"));
//
//


        User user1 = new User("User1", "Lastname1", "user1@mail.ru");
        Car car1 = new Car("model1", 1);
        user1.setUsCar(car1);
        userService.addUser(user1);

        User user2 = new User("User2", "Lastname2", "user2@mail.ru");
        Car car2 = new Car("model2", 2);
        user2.setUsCar(car2);
        userService.addUser(user2);


        User user3 = new User("User3", "Lastname3", "user3@mail.ru");
        Car car3 = new Car("model3", 3);
        user3.setUsCar(car3);
        userService.addUser(user3);


        List<User> users = userService.listUsers();
        for (User user : users) {
            System.out.println("Id = " + user.getId());
            System.out.println("First Name = " + user.getFirstName());
            System.out.println("Last Name = " + user.getLastName());
            System.out.println("Email = " + user.getEmail());
            System.out.println();
        }


        List<User> users2 = userService.getUserByModelAndSeries("model3", 3);
        for (User user : users2) {
            System.out.println(user);
        }


        context.close();
    }
}
