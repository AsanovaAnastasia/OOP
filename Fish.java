import java.time.LocalDate;

public class Fish extends Animal{

    private String scaleColour;

    public Fish(String name, LocalDate birthday, Illness illness, String scaleColour) {
    super(name, birthday, illness);
    this.scaleColour = scaleColour;
}

@Override
public String toString() {
    return name;
}

@Override
  public void toGo() {
    System.out.println("Рыба не умеет ходить");
  }

  @Override
  public void fly(){
    System.out.println("Рыба не умеет летать");
  }

  @Override
public void swim(){
    System.out.println("Рыба умеет плавать");
  }

//   @Override
//   public void skills(){
//     fish.skills()
//   }
}
