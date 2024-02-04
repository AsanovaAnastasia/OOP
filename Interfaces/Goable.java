package Interfaces;

public interface Goable {
    double run();

    default void defaultGo(double speed){
        System.out.println("Объект двигается со скоростью " + speed);
    }
}
