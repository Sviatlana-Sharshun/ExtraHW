package variables;

/**
 * Посмотри, что делает программа. Расставь модификатор final общепринятым константам (переменным с неизменными значениями).
 * Требования:
 * •	Модификатор final должен быть установлен всем константам.
 */

public class Variable13 {

  public static final double PI = 3.14;
  public static final double RADIUS = 2.5;
  public static final double DIAMETER = 5;

  public static void main(String[] args) {
    System.out.println("Плошадь круга равна: " + PI * RADIUS * RADIUS);
    System.out.println("Периметр круга равен: " + PI * DIAMETER);
  }
}
