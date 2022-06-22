package by.astakhnovich.patterns.generating.abstractFactory;

import by.astakhnovich.patterns.generating.abstractFactory.factorys.CarFactory;
import by.astakhnovich.patterns.generating.abstractFactory.factorys.HelicopterFactory;
import by.astakhnovich.patterns.generating.abstractFactory.factorys.ShipFactory;
import by.astakhnovich.patterns.generating.abstractFactory.transport.*;

public class TaxiStation {
    private Transport transport;
    private final CarFactory carFactory = new CarFactory();
    private final HelicopterFactory helicopterFactory = new HelicopterFactory();
    private final ShipFactory shipFactory = new ShipFactory();

    public Transport orderTaxi(TransportType transportType, TaxiType taxiType){

        switch (transportType){
            case CAR -> transport = carFactory.createTransport(taxiType);

            case HELICOPTER -> transport = helicopterFactory.createTransport(taxiType);

            case SHIP -> transport = shipFactory.createTransport(taxiType);
        }
        return transport;
    }
}