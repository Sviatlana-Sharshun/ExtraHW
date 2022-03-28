package oop.inheritance.repka_difficult;

public class Person implements RepkaItem{
  private String name;
  private String namePadezh;


  public Person(String name, String namePadezh) {
    this.name = name;
    this.namePadezh = namePadezh;
  }



  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNamePadezh() {
    return namePadezh;
  }

  public void setNamePadezh(String namePadezh) {
    this.namePadezh = namePadezh;
  }
}
