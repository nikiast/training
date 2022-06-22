package by.astakhnovich.patterns.generating.abstractFactory;

import by.astakhnovich.patterns.generating.abstractFactory.transport.TaxiType;
import by.astakhnovich.patterns.generating.abstractFactory.transport.Transport;
import by.astakhnovich.patterns.generating.abstractFactory.transport.TransportType;

public class Main {
    public static void main(String[] args) {
        TaxiStation taxiStation = new TaxiStation();
        Transport transport = taxiStation.orderTaxi(TransportType.CAR, TaxiType.BUSINESS);
        transport.move();
    }
}