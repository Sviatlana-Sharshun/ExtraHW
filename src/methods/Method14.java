package methods;

import classes.Car;

/**
 * Напиши метод, который определяет, какой объект в него передали.
 * Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
 *
 * Примечание: постарайся определять тип животного как можно более точно.
 * Требования:
 * •	Класс Method14 должен содержать классы Cat, Tiger, Lion, Bull, Cow, Animal.
 * •	Класс Method14 должен содержать метод String getObjectType(Object o).
 * •	Метод getObjectType() должен возвращать строку "Кот", если передан объект типа Cat.
 * •	Метод getObjectType() должен возвращать строку "Тигр", если передан объект типа Tiger.
 * •	Метод getObjectType() должен возвращать строку "Лев", если передан объект типа Lion.
 * •	Метод getObjectType() должен возвращать строку "Бык", если передан объект типа Bull.
 * •	Метод getObjectType() должен возвращать строку "Корова", если передан объект типа Cow.
 * •	Метод getObjectType() должен возвращать строку "Животное", если передан объект типа Animal.
 * •	Программа должна выводить на экран результат метода getObjectType().
 */

public class Method14 {


  public static void main(String[] args) {
    System.out.println(new Cat().getClass().getSimpleName());

//    System.out.println(getObjectType(new Cat()));
//    System.out.println(getObjectType(new Tiger()));
//    System.out.println(getObjectType(new Lion()));
//    System.out.println(getObjectType(new Bull()));
//    System.out.println(getObjectType(new Cow()));
//    System.out.println(getObjectType(new Animal()));
  }

  public static String getObjectType(Object o) {
    if (o instanceof Lion) {
      return "Лев";
    } else if (o instanceof Tiger) {
      return "Тигр";
    } else if (o instanceof Cat) {
      return "Кот";
    } else if (o instanceof Bull) {
      return "Бык";
    } else if (o instanceof Cow) {
      return "Корова";
    } else return "Животное";

  }

  public static class Cat extends Animal
  {
  }

  public static class Tiger extends Cat {
  }

  public static class Lion extends Cat {
  }

  public static class Bull extends Animal {
  }

  public static class Cow extends Animal {
  }

  public static class Animal {
  }
}
