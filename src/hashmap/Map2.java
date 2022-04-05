package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * В классе Map2 есть метод getProgrammingLanguages,
 * который возвращает список языков программирования. Тебе нужно переписать этот метод, чтобы он возвращал HashMap<Integer, String>.
 * Ключом в этой коллекции будет индекс элемента в ArrayList.
 * Требования:
 * •	В классе Map2 должен быть публичный статический метод getProgrammingLanguages с типом возвращаемого значения HashMap<Integer, String>.
 * •	Метод getProgrammingLanguages() должен возвращать HashMap заполненным в соответствии с списком.
 */

public class Map2 {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> programmingLanguages = new HashMap<>();
        programmingLanguages.put(0,"Java");
        programmingLanguages.put(1,"Kotlin");
        programmingLanguages.put(2,"Go");
        programmingLanguages.put(3,"Javascript");
        programmingLanguages.put(4,"Typescript");
        programmingLanguages.put(5,"Python");
        programmingLanguages.put(6,"PHP");
        programmingLanguages.put(7,"C++");
        return programmingLanguages;
    }
}
