package if_else;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
 * Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
 *
 * Примеры:
 * a) при вводе чисел 1 2 2 получим вывод 2 2
 *
 * b) при вводе чисел 2 2 2 получим вывод 2 2 2
 * Требования:
 * •	Программа должна считывать три числа c клавиатуры.
 * •	Программа должна содержать System.out.println() или System.out.print()
 * •	Если два числа равны между собой, необходимо вывести их на экран.
 * •	Если все три числа равны между собой, необходимо вывести все три.
 * •	Если нет равных чисел, ничего не выводить.
 */

public class Operator5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    scanner.close();
    if (a==b&&a==c)
      System.out.println(Integer.toString(a) + " " + b + " " +c);
    else if (a==b||a==c)
      System.out.println(Integer.toString(a) +" " + a);
    else if (b==c)
      System.out.println(Integer.toString(b) + " " +c);
  }
}
