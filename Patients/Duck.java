package Patients;

import Interfaces.Flyable;
import Interfaces.Goable;
import Interfaces.Swimable;
import java.time.LocalDate;

public class Duck extends Animal implements Goable, Swimable, Flyable {

  private int wingCount;

  public Duck(String name, LocalDate birthday, int wingCount) {
    super(name, birthday);
    this.wingCount = wingCount;
  }

  public int wingCount() {
    return wingCount;
  }

  @Override
  public String toString() {
    return String.format(
      "Имя = %s, дата рождения = %s, количество крыльев = %s\n",
      name,
      birthday,
      wingCount
    );
  }

  @Override
  public double run() {
    return 2;
  }

  @Override
  public double swim() {
    return 5;
  }

  @Override
  public double fly() {
    return 10;
  }
}
