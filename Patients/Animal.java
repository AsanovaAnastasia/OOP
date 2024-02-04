package Patients;

import java.time.LocalDate;

public class Animal {

  protected String name;
  protected LocalDate birthday;
  protected Illness illness;

  public Animal(String name, LocalDate birthday) {
    this.name = name;
    this.birthday = birthday;
  }

  public Animal() {
    this("Вася", LocalDate.now());
  }

  private void wakeUp() {
    System.out.println(getType() + " Проснулся");
  }

  private void hunt() {
    System.out.println(getType() + " Охотится");
  }

  private void eat() {
    System.out.println(getType() + " Кушает");
  }

  private void sleep() {
    System.out.println(getType() + " Спит");
  }

  public void lifeCycle() {
    wakeUp();
    hunt();
    eat();
    sleep();
  }

  public void setIllness(Illness illness) {
    this.illness = illness;
  }

  public String getName() {
    return name;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public Illness getIllness() {
    return illness;
  }

  public String getType() {
    return getClass().getSimpleName();
  }

  @Override
  public String toString() {
    return String.format("Имя = %s, дата рождения = %s\n", name, birthday);
  }
}
