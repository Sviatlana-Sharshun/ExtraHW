package stream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Напиши программу, которая будет считывать с клавиатуры путь к директории,
 * получать список файлов и директорий в заданной директории и выводить в консоли информацию о них в виде:
 * "<путь к файлу> - это файл", если это файл,
 * "<путь к директории> - это директория", если это директория.
 * Треугольные скобки и кавычки выводить не нужно.
 * Используй соответствующие методы класса Files: newDirectoryStream(Path), isRegularFile(Path) и isDirectory(Path).
 *
 * Ввод:
 * C:\home\
 *
 * Вывод:
 * C:\home\test.txt - это файл
 * C:\home\tasks - это директория
 * ...
 * Требования:
 * •	Программа должна считать из консоли путь к директории.
 * •	В программе должны быть использованы соответствующие методы класса Files: newDirectoryStream(Path), isRegularFile(Path) и isDirectory(Path).
 * •	Программа должна получать список файлов и директорий в заданной директории и выводить в консоли информацию согласно условию.
 * •	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */

public class File2 {


  private static final String THIS_IS_FILE = " - это файл";
  private static final String THIS_IS_DIR = " - это директория";

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    Path directory = Path.of(scanner.nextLine());
    if (Files.isRegularFile(directory)) {
      System.out.println(directory + THIS_IS_FILE);
    } else if (Files.isDirectory(directory)) {
      try (DirectoryStream<Path> files = Files.newDirectoryStream(directory)) {
        for (Path path : files)
          System.out.println(path + THIS_IS_DIR);
      }
    }


  }
}
