package Patients;

import Interfaces.Swimable;
import java.time.LocalDate;

public class Fish extends Animal implements Swimable {

  protected String scaleColour;

  public Fish(String name, LocalDate birthday, String scaleColour) {
    super(name, birthday);
    this.scaleColour = scaleColour;
  }

  @Override
  public String toString() {
    return String.format(
      "Имя = %s, дата рождения = %s, цвет чешуи = %s\n",
      name,
      birthday,
      scaleColour
    );
  }

  @Override
  public double swim() {
    return 7;
  }
}
