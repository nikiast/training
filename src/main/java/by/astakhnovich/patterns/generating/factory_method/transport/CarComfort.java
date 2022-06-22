package by.astakhnovich.patterns.generating.factory_method.transport;

public class CarComfort implements Transport {
    @Override
    public void move() {
        System.out.println("я наземное такси, везу по дороге за нормально денег");
    }
}