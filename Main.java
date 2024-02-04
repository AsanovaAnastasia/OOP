import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Clinic.Doctor;
import Clinic.Nurse;
import Patients.*;

public class Main {

  public static void main(String[] args) {

    
    Animal cat = new Cat("Барсик", LocalDate.now());
    Animal dog = new Dog("Персик", LocalDate.now());
    Animal penguin = new Penguin("Клювастик", LocalDate.now());
    Animal snake = new Snake("Тросик", LocalDate.now(), "Черный");
    Animal fish = new Fish("Лупатик", LocalDate.now(), "Золотой");
    Animal duck = new Duck("Пернатик", LocalDate.now(),2);

    List<Animal> animals = new ArrayList<>();
    animals.add(cat);
    animals.add(dog);
    animals.add(penguin);
    animals.add(snake);
    animals.add(fish);
    animals.add(duck);
    // System.out.println(animals);
    



    Doctor doc1 = new Doctor("Ковалев Иван Игоревич", LocalDate.of(1985, 5, 15), "first", 1);
    Doctor doc2 = new Doctor("Иванов Петр Васльевич", LocalDate.of(1967, 2, 24), "highest", 2);
    Doctor doc3 = new Doctor("Карпенко Татьяна Леонидовна", LocalDate.of(1978, 6, 5), "second", 3);
    // System.out.print(doc1);
    List<Doctor> doctors = new ArrayList<>();
    doctors.add(doc1);
    doctors.add(doc2);
    doctors.add(doc3);

    // System.out.println(doctors);

    Nurse nurse1 = new Nurse("Ковалева Валентина Игоревна", LocalDate.of(1967, 3, 19), "first", 1);
    Nurse nurse2 = new Nurse("Иванова Полина Васльевна", LocalDate.of(1997, 7, 2), "highest", 2);
    Nurse nurse3 = new Nurse("Карпенко Анатолий Леонидович", LocalDate.of(1978, 7, 3), "second", 3);

    List<Nurse> nurses = new ArrayList<>();
    nurses.add(nurse1);
    nurses.add(nurse2);
    nurses.add(nurse3);

    // System.out.println(nurses);
    System.out.println("Пациент: " + dog + "Доктор: " + doc1 + "Диагноз: " + doc1.makeDiagnosis(dog));
    System.out.println();
    System.out.println("Пациент: " + cat + "Медсестра: " + nurse1 + "Процедура: " + nurse1.makeInjection(cat));

    };  
  }

