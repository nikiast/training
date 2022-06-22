package by.astakhnovich.patterns.generating.abstractFactory;

import by.astakhnovich.patterns.generating.abstractFactory.factorys.CarFactory;
import by.astakhnovich.patterns.generating.abstractFactory.factorys.HelicopterFactory;
import by.astakhnovich.patterns.generating.abstractFactory.factorys.ShipFactory;
import by.astakhnovich.patterns.generating.abstractFactory.transport.*;

public class TaxiStation {
    Transport transport;

    public Transport orderTaxi(TransportType transportType, TaxiType taxiType){

        switch (transportType){
            case CAR -> transport = new CarFactory().createTransport(taxiType);

            case HELICOPTER -> transport = new HelicopterFactory().createTransport(taxiType);

            case SHIP -> transport = new ShipFactory().createTransport(taxiType);
        }
        return transport;
    }
}