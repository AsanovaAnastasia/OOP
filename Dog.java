import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String name, LocalDate birthday, Illness illness) {
    super(name, birthday, illness);
}

@Override
  public void toGo() {
    System.out.println("Собака умеет ходить");
  }

  @Override
  public void fly(){
    System.out.println("Собака не умеет летать");
  }

  @Override
public void swim(){
    System.out.println("Собака умеет плавать");
  }
}
