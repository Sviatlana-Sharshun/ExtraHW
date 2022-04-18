package oop.poliformism.superMethod;

public class Cat extends Pet {
  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println(CAT);
  }

  public static final String CAT = "Я не люблю людей.";

}
