package Patients;

import Interfaces.Goable;
import Interfaces.Swimable;
import java.time.LocalDate;

public class Cat extends Animal implements Goable, Swimable {

  public Cat(String name, LocalDate birthday) {
    super(name, birthday);
  }

  @Override
  public String toString() {
    return String.format("Имя = %s, дата рождения = %s\n", name, birthday);
  }

  @Override
  public double swim() {
    return 2;
  }

  @Override
  public double run() {
    return 6;
  }
}
