package classes;

/**
 *
 В методе main конвертируй строку string в тип double с помощью статического метода parseDouble класса Double.
 Затем округли полученное значение, используя статический метод round класса Math.
 Результат выведи на экран.
 Требования:
 •	В методе main должен вызываться метод parseDouble класса Double.
 •	В методе main должен вызываться метод round класса Math.
 •	В консоли должно выводиться число 13.
 */

public class Class2 {

  public static void main(String[] args) {
    String string = "12.84";
    Double a = Double.parseDouble(string);
    int i = (int)Math.round(a);
    System.out.println(i);
  }
}

