package lab7;

import java.util.ArrayList;
import java.util.Random;

class Driver {
    String name;
    int age;
    int experience;

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
}

class Car {
    String brand;
    double enginePower;
    Driver driver;
    double price;
    int year;

    public Car(String brand, double enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }
}

class TaxiHelper {
    public static Car getRandomCar(ArrayList<Car> cars) {
        Random random = new Random();
        return cars.get(random.nextInt(cars.size()));
    }

    public static void pickUpPassenger(Car car) {
        System.out.println("Автомобіль марки " + car.brand + " з водієм " + car.driver.name + " виїхав за вами");
        arriveAtDestination(car);
    }

    public static void arriveAtDestination(Car car) {
        System.out.println("Водій " + car.driver.name + " прибув на місце");
    }
}

public class Task1 {
    public static void task1() {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", 150, new Driver("Іван", 30, 6), 20000, 2018));
        cars.add(new Car("BMW", 180, new Driver("Петро", 28, 4), 25000, 2019));
        cars.add(new Car("Audi", 200, new Driver("Олег", 35, 10), 30000, 2020));
        cars.add(new Car("Mercedes", 220, new Driver("Юрій", 40, 15), 40000, 2017));
        cars.add(new Car("Ford", 140, new Driver("Андрій", 27, 3), 18000, 2016));
        cars.add(new Car("Volkswagen", 160, new Driver("Сергій", 33, 8), 22000, 2015));
        cars.add(new Car("Honda", 170, new Driver("Максим", 26, 2), 21000, 2021));
        cars.add(new Car("Nissan", 175, new Driver("Василь", 29, 5), 23000, 2014));
        cars.add(new Car("Mazda", 190, new Driver("Дмитро", 24, 1), 24000, 2023));
        cars.add(new Car("Chevrolet", 130, new Driver("Роман", 31, 7), 17000, 2012));

        // Ремонт половини автопарку
        for (int i = 0; i < cars.size() / 2; i++) {
            cars.get(i).enginePower *= 1.1;
            cars.get(i).driver = new Driver("Новий Водій" + i, 32, 6);
        }

        // Збільшення потужності і ціни кожній другій машині
        for (int i = 1; i < cars.size(); i += 2) {
            cars.get(i).enginePower *= 1.1;
            cars.get(i).price *= 1.05;
        }

        // Перевірка водіїв та підвищення кваліфікації
        for (Car car : cars) {
            if (car.driver.experience < 5 && car.driver.age > 25) {
                car.driver.experience += 1;
            }
        }

        // Використання методу для виклику випадкового авто
        Car selectedCar = TaxiHelper.getRandomCar(cars);
        TaxiHelper.pickUpPassenger(selectedCar);
    }
}
