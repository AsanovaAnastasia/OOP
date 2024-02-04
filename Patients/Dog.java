package Patients;

import Interfaces.Goable;
import Interfaces.Swimable;
import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {

  public Dog(String name, LocalDate birthday) {
    super(name, birthday);
  }

  @Override
  public String toString() {
    return String.format("Имя = %s, дата рождения = %s\n", name, birthday);
  }

  @Override
  public double run() {
    return 9;
  }

  @Override
  public double swim() {
    return 5;
  }
}
