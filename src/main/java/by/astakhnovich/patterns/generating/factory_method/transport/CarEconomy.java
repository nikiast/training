package by.astakhnovich.patterns.generating.factory_method.transport;

public class CarEconomy implements Transport {
    @Override
    public void move() {
        System.out.println("я наземное такси, везу по дороге за мало денег");
    }
}