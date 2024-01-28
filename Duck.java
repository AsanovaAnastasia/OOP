import java.time.LocalDate;

public class Duck extends Animal{
    private int wingCount;

    public Duck(String name, LocalDate birthday, Illness illness, int wingCount) {
    super(name, birthday, illness);
    this.wingCount = wingCount;
}
public int wingCount(){
    return wingCount;
}
@Override
public String toString() {
    return name;
}

@Override
  public void toGo() {
    System.out.println("Утка умеет ходить");
  }

  @Override
  public void fly(){
    System.out.println("Утка умеет летать");
  }

  @Override
public void swim(){
    System.out.println("Утка умеет плавать");
  }

}
