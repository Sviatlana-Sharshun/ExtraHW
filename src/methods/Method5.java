package methods;

import java.util.Scanner;

/**
 * Неплохо было бы иметь один метод для решения различных задач. У тебя есть возможность написать такой.
 * Создай еще 9 методов universalMethod(). В сумме их должно получиться 10.
 * Параметры, которые они должны принимать, придумай сам.
 * Требования:
 * •	Программа должна содержать 10 методов с именем universalMethod.
 */


public class Method5 {

  String duck;
  String quack;
  int age;

  public Method5(String duck, String quack, int age) {
    this.duck = duck;
    this.quack = quack;
    this.age = age;
  }

  public String getDuck() {
    return duck;
  }

  public void setDuck(String duck) {
    this.duck = duck;
  }

  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    universalMethod5();

  }

  public String universalMethod1() {
    String name = scanner.nextLine();
    return name;
  }

  public void universalMethod2() {
    scanner.close();
  }

  public static int universalMethod3() {
    int random = (int) (Math.random() * 100);
    System.out.println(random);
    return random;
  }

  public static void universalMethod4() {
  }

  public static void universalMethod5() {
    int[] array = new int[100];
    for (int i = 0; i < array.length; i++) {
      array[i] = universalMethod3();
    }
    for (int a : array) {
      System.out.println(a);
    }

  }
  public static void universalMethod6(){

  }
  public static void universalMethod7(){

  }
  public static void universalMethod8(){

  }
  public static void universalMethod9(){

  }
  public static void universalMethod10(){

  }

}
