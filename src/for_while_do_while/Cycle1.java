package for_while_do_while;
import java.util.Scanner;

/**
 * Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
 * Каждый вывод - с новой строки.
 * Пример вывода на экран для имени Света:
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Света любит меня.
 * Требования:
 * •	Программа должна считывать имя c клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Программа должна выводить 10 раз текст, указанный в задании. Каждый вывод - с новой строки.
 * •	В программе необходимо использовать цикл while.
 */

public class Cycle1 {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите имя: ");
    String name = scanner.nextLine();
    scanner.close();
    String text = " любит меня.";
    int i = 0;
    while (i<10){
      System.out.println(name + text);
      i++;
    }
  }
}
