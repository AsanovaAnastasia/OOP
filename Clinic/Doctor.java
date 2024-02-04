package Clinic;

import java.time.LocalDate;
import java.util.Map;
import java.util.Random;

import Patients.Animal;
import Patients.Illness;
public class Doctor extends Personal {

  protected int docId;

  public Doctor(
    String fullname,
    LocalDate birthday,
    String qualification,
    int docId
  ) {
    super(fullname, birthday, qualification);
    this.docId = docId;
  }

  public int getDocId() {
    return docId;
  }

  public Map<Integer, String> diagnosis = Map.of(1, "Здоров", 2, "Лишай", 3, "Голодание", 4, "Простуда");

  
  public String makeDiagnosis(Animal animal) {
    Random rand = new Random();
    int random = rand.nextInt(diagnosis.size());
    String diagn = diagnosis.get(random);
    animal.setIllness(new Illness(diagn));
    return diagn;
  }

  @Override
  public String toString() {
    return String.format(
      "ФИО = %s, дата рождения = %s, квалификация = %s, персональный id = %s\n",
      fullname,
      birthday,
      qualification,
      docId
    );
  }

  
}
