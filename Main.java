import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Animal cat = new Animal(
      "Барсик",
      LocalDate.of(2024, 03, 13),
      new Illness("Лишай")
    );
    // cat.setIllness(new Illness("Healthy"));
    System.out.println(
      cat.getName() + " " + cat.getBirthday() + " " + cat.getIllness()
    );
    Animal animal = new Animal();
    Animal dog = new Dog("Персик", LocalDate.now(), new Illness("Healthy"));
    System.out.println(dog.getType());
    List<Animal> list = new ArrayList<>();
    list.add(dog);
    list.add(cat);
    list.add(new Duck("Кеша", LocalDate.now(), new Illness("Лишай"), 2));
    System.out.println(list);

    //
    Animal snake = new Snake(
      "Тросик",
      LocalDate.now(),
      new Illness("Отравление"),
      "Черный"
    );
    System.out.println(snake.getType());

    Animal fish = new Fish("Лупатик", LocalDate.now(),new Illness("Голодание"), "Золотой");
    System.out.println((fish.getType()));

    Animal duck = new Duck("Пернатик", LocalDate.now(), new Illness("Helthy"),2);

    dog.lifeCycle();
    System.out.println();

    dog.skills();
    System.out.println();

    duck.skills();

    snake.skills();
    System.out.println();

    fish.skills();
    System.out.println();
  }
}
