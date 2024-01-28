import java.time.LocalDate;

public class Snake extends Animal {

  public Snake(
    String name,
    LocalDate birthday,
    Illness illness,
    String scaleColour
  ) {
    super(name, birthday, illness);
  }

  @Override
  public void toGo() {
    System.out.println("Змея не умеет ходить, но умеет ползать");
  }

  @Override
  public void fly(){
    System.out.println("Змея не умеет летать");
  }

  @Override
  public void swim(){
    System.out.println("Змея умеет плавать");
  }
}
