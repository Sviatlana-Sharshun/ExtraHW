package hashmap;

import java.util.HashMap;

/**
 *В классе Map объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение - его средняя оценка.
 *  Твоя задача — реализовать метод addStudents, который добавит 5 студентов с их средней оценкой в коллекцию grades.
 * Значения можешь выбрать любые.
 * Требования:
 * •	В классе Map нужно инициализировать публичное статическое поле grades типа HashMap<String, Double>.
 * •	В классе Map должен быть публичный статический метод addStudents с типом возвращаемого значения void.
 * •	Метод addStudents должен добавлять 5 студентов со средней оценкой в поле grades.
 */
public class Map {

    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
        printStudentsInfo();
        printStudents();
        getAverageMark();
    }

    public static void addStudents() {
        grades.put("Ильин Николай", 8.3);
        grades.put("Ажаронок Виталий", 8.4);
        grades.put("Тимошенко Василий", 8.4);
        grades.put("Салачёнок Ольга ", 8.5);
        grades.put("Клевко Дмитрий", 8.1);
        grades.put("Бричковская Ирина", 8.2);
        grades.put("Ковалев Никита", 8.5);
        grades.put("Шаршун Светлана" , 8.4);
        grades.put("Шукалович Наталья", 8.3);
        grades.put("Новыш Екатерина", 8.6);
    }
    /**
     * Метод printStudents должен выводить всех студентов (имя и фамилия) из коллекции grades с новой строки.
     */
    public static void printStudents() { // Список студентов группы: ...
        for (String name: grades.keySet()) {
            System.out.println(name);}
    }

    /**
     * Метод getAverageMark должен возвращать средний балл всех студентов из коллекции grades.
     * @return  который возвращает средний балл всех студентов.
     */
    public static Double getAverageMark() { // Средний балл группы: ....
        Double sum = 0.0;
        for (Double mark:grades.values()){
            sum += mark;
        }
        return sum/grades.size();
    }

    /**
     * 	Метод printStudentsInfo должен выводить текст в консоли
     * 	вывод будет следующим: Андрей Петров : 4.5
     * 	...
     */
    public static void printStudentsInfo() {
        for (String name: grades.keySet()) {
            System.out.println(name + " средний бал " + grades.get(name));}
    }

}
