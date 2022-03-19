package if_else;

import java.util.Scanner;

/**
 * Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает. Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
 * Перепиши программу без использования тернарного оператора.
 * Требования:
 * •	Программа должна считывать число c клавиатуры.
 * •	Вместо тернарного оператора в программе должен быть использован оператор if.
 * •	Функционал программы не должен измениться.
 */

public class Operator8 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.close();
    if (number < 5)
      System.out.println("число меньше 5");
    else if (number > 5)
      System.out.println("число больше 5");
    else
      System.out.println("число равно 5");
  }
}
