package Patients;

import Interfaces.Goable;
import java.time.LocalDate;

public class Snake extends Animal implements Goable {

  protected String scaleColour;

  public Snake(String name, LocalDate birthday, String scaleColour) {
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
  public double run() {
    return 1;
  }
}
