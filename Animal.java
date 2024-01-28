// 1) Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
// 2) Создать по два класса
// наследника Animal, умеющих летать, плавать, бегать(животное может как уметь что-то одно, так и все сразу).
// 3) В main добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят)
// 4) В файле readme.md в репозитории гитхаб описать
// какие проблемы в таком проектировании Вы увидели,
// а также там же написать возникшие при выполнении дз вопросы
// (если они есть)


import java.time.LocalDate;

public class Animal {

  protected String name;
  protected LocalDate birthday;
  protected Illness illness;

  public Animal(String name, LocalDate birthday, Illness illness) {
    this.name = name;
    this.birthday = birthday;
    this.illness = illness;
  }

  public Animal() {
    this("Вася", LocalDate.now(), new Illness("Чумка"));
  }

  private void wakeUp(){
    System.out.println(getType() + " Проснулся");
  }

  // private void wakeUp(String time){
  //   System.out.println(getType() + " Проснулся в " + time);
  // }

  private void hunt(){
    System.out.println(getType() + " Охотится");
  }

  private void eat(){
    System.out.println(getType() + " Кушает");
  }

  private void sleep(){
    System.out.println(getType() + " Спит");
  }

  public void lifeCycle(){
    wakeUp();
    hunt();
    eat();
    sleep();
  }

  public void toGo(){
    System.out.println(getType() + " умеет ходить");
  }

  public void fly(){
    System.out.println(getType() + " умеет летать");
  }

  public void swim(){
    System.out.println(getType() + " умеет плавать");
  }

  public void skills(){
    toGo();
    fly();
    swim();
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
      return String.format("name = %s, birthday = %s, illness = %s", name, birthday, illness);

}
}
