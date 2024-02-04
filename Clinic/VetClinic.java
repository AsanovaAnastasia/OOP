package Clinic;

import java.util.ArrayList;
import java.util.List;

import Interfaces.Flyable;
import Interfaces.Goable;
import Interfaces.Swimable;
import Patients.Animal;

public class VetClinic {
    private List<Personal> personal;
    private List<Animal> animals;
    private List<Doctor> doctors;
    private List<Nurse> nurses;

    public VetClinic(){
        this.personal = new ArrayList<>();
        this.animals = new ArrayList<>();
    }

    public List<Personal> getPersonal(){
        return personal;
    }

    public List<Animal> getAnimals(){
        return animals;
    }

    public List<Doctor> getDoctors(){
        return doctors;
    }

    public List<Nurse> getNurses(){
        return nurses;
    }

    public List<Animal> getGoables(){
        List<Animal> goableList = new ArrayList<>();
        for (Animal animal: animals){
            if (animal instanceof Goable){
                goableList.add(animal);
            }
        }
        return goableList;
    }

    public List<Animal> getSwimables(){
        List<Animal> swimableList = new ArrayList<>();
        for (Animal animal: animals){
            if (animal instanceof Swimable){
                swimableList.add(animal);
            }
        }
        return swimableList;
    }

    public List<Animal> getFlyables(){
        List<Animal> flyableList = new ArrayList<>();
        for (Animal animal: animals){
            if (animal instanceof Flyable){
                flyableList.add(animal);
            }
        }
        return flyableList;
}
}
