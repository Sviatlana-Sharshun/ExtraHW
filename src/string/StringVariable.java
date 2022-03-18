import java.util.Scanner;

/**
 * Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
 * Требования:
 * •	Программа должна считывать две строки c клавиатуры.
 * •	Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
 * •	Если строки разные, то программа должна вывести сообщение "строки разные".
 */

public class StringVariable {

  public static boolean skan() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите строку: ");
    String a = scanner.nextLine();
    System.out.println("Введите строку: ");
    String b = scanner.nextLine();
    scanner.close();
    return a.equals(b);
  }

  public static void main(String[] args) {
    if (skan() == true) {
      System.out.println("строки одинаковые");
    } else {
      System.out.println("строки разные");
    }
  }
}