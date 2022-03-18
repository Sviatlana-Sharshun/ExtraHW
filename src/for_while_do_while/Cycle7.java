package for_while_do_while;

import java.util.Scanner;

/**
 * В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
 * Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно), кратных multiple.
 * Для этого используй цикл for.
 * Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.
 * Требования:
 * •	Программа должна вывести в консоль сумму чисел от start (включительно) до end (не включительно), кратных multiple.
 * •	В программе необходимо использовать цикл for.
 * •	В цикле for необходимо использовать оператор continue.
 */

public class Cycle7 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int start = scanner.nextInt();
    int end = scanner.nextInt();
    int multiple = scanner.nextInt();

    int sum = 0;
    if (start == end && start % multiple == 0) {
      System.out.println(start);
    } else if (start == end && start % multiple != 0) {
      System.out.println("нет подходящих чисел");
    } else {
      for (; start < end; start++) {
        if (start % multiple != 0) {
          start++;
          continue;
        }
        sum += start;
      }
      if (sum == 0) {
        System.out.println("нет подходящих чисел");
      } else System.out.println(sum);
    }
  }
}
