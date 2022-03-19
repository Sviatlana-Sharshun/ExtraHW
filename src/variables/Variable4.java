package variables;

/**
 *
 УсловиеДерево классов

 Используя только оператор декремента, измени значение переменной toothCounter, чтобы на экран вывелось число 23.
 Требования:
 •	Не изменяй команду объявления переменной toothCounter.
 •	К переменной toothCounter нужно применить несколько команд декремента, чтобы она изменила значение на 23.
 •	Программа должна выводить на экран переменную toothCounter со значением 23.
 */

public class Variable4 {

  public static void main(String[] args) {
    int toothCounter = 32;
    while (toothCounter > 23) {
      toothCounter--;
    }
    System.out.println(toothCounter);
  }
}
