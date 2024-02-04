package Clinic;

import java.time.LocalDate;
import java.util.Map;
import java.util.Random;

import Patients.Animal;
import Patients.Illness;

public class Nurse extends Personal{
  protected int nurseId;

  public Nurse(String fullname, LocalDate birthday, String qualification, int nurseId) {
    super(fullname, birthday, qualification);
    this.nurseId = nurseId;
  }

  public Map<Integer, String>  injection = Map.of(1, "Укол от простуды", 2, "Укол от блох", 3, "Укол от глистов", 4, "В уколе не нуждается");

public String makeInjection(Animal animal) {
    Random rand = new Random();
    int random = rand.nextInt(injection.size());
    String inj = injection.get(random);
    animal.setIllness(new Illness(inj));
    return inj;
    }

  @Override
  public String toString() {
    return String.format(
      "ФИО = %s, дата рождения = %s, квалификация = %s, персональный id = %s\n",
      fullname,
      birthday,
      qualification,
      nurseId
    );
  }
}
