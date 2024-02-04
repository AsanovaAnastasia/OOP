package Patients;

import Interfaces.Goable;
import Interfaces.Swimable;
import java.time.LocalDate;

public class Penguin extends Animal implements Swimable, Goable {

  public Penguin(String name, LocalDate birthday) {
    super(name, birthday);
  }

  @Override
  public double swim() {
    return 7;
  }

  @Override
  public double run() {
    return 4;
  }

  @Override
  public String toString() {
    return String.format("Имя = %s, дата рождения = %s\n", name, birthday);
  }
}
