package variables;

/**
 * Расставь операторы приведения типов в выражениях таким образом, чтобы код компилировался.
 * Изменять типы переменных a, b, c и d нельзя.
 * Требования:
 * •	Типы переменных a,b,c и d не должны измениться.
 * •	При присвоении значения выражения должно использоваться приведение типа.
 */

public class Variable19 {
  long a = 109 + 15;
  int b = (int) (a * 2);
  short c = (short)(a / b);
  byte d = (byte) (a + b - c);
}
