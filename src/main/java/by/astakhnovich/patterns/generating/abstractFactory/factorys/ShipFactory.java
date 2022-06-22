package by.astakhnovich.patterns.generating.abstractFactory.factorys;

import by.astakhnovich.patterns.generating.abstractFactory.transport.TaxiType;
import by.astakhnovich.patterns.generating.abstractFactory.transport.*;

public class ShipFactory implements TransportFactory{

    public Transport createTransport (TaxiType type) {
        Transport ship = null;

        switch (type){
            case COMFORT -> ship = new ShipComfort();
            case BUSINESS -> ship = new ShipBusiness();
        }
        return ship;
    }
}