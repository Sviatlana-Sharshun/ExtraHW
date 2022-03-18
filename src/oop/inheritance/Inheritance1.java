package oop.inheritance;

/**
 * Правильно унаследуй классы:
 *
 * машину — от транспортного средства;
 * электрокар — от машины.
 * Удали дублирующиеся переменные.
 * Требования:
 * •	Класс Car должен наследоваться от класса Vehicle.
 * •	Класс ElectricCar должен наследоваться от класса Car.
 * •	Дублирующих переменных не должно быть.
 */

public class Inheritance1 {

  public class ElectricCar {
    double maxSpeed;
    int wheelCount;
    double weight;
    int electricEnginePower;
  }

  public class Vehicle {
    double maxSpeed;

  }

  public class Car {
    double maxSpeed;
    int wheelCount;
    double weight;
  }

}
