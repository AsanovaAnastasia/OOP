package Interfaces;

public interface Flyable {
    double fly();

    default void defaultFly(double speed){
        System.out.println("Объект летает со скоростью " + speed);
}
}
