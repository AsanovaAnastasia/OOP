package Interfaces;

public interface Swimable {
    double swim();

    default void defaultSwim(double speed){
        System.out.println("Объект плавает со скоростью " + speed);
}
}
