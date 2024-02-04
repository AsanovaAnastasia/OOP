package Clinic;

import java.time.LocalDate;

public class Personal {

  protected String fullname;
  protected LocalDate birthday;
  protected String qualification;

  public Personal(String fullname, LocalDate birthday, String qualification) {
    this.fullname = fullname;
    this.birthday = birthday;
    this.qualification = qualification;
  }

  public String getFullname() {
    return fullname;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public String getQualification() {
    return qualification;
  }

  public String getType() {
    return getClass().getSimpleName();
  }

  @Override
  public String toString() {
      return String.format("fullname = %s, birthday = %s, qualification = %s\n", fullname, birthday, qualification);
  }
}
