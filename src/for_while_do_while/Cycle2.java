package for_while_do_while;
import java.util.Scanner;

/**
 * Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
 * Вывести на экран полученную сумму и завершить программу.
 * Требования:
 * •	Программа должна считывать данные c клавиатуры.
 * •	Программа должна выводить данные на экран, если пользователь ввел слово "ENTER".
 * •	Необходимо посчитать сумму введенных целых чисел и вывести её на экран.
 * •	В программе необходимо использовать цикл while.
 */
public class Cycle2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    int sum = 0;
    boolean a = false;
    while (!a) {
      if (scanner.hasNextInt()) {
        int number = scanner.nextInt();
        sum += number;
      } else if (scanner.hasNextLine()) {
        String slovo = scanner.nextLine();
        if (slovo.equals("ENTER")) {
          a = true;
        }
      }
    }
    System.out.println(sum);
  }
}
