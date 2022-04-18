package oop.poliformism.superMethod;

public class Dog extends Pet {
  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println(DOG);
  }

  public static final String DOG = "Я люблю людей.";
}
