package by.astakhnovich.patterns.generating.abstractFactory.factorys;

import by.astakhnovich.patterns.generating.abstractFactory.transport.TaxiType;
import by.astakhnovich.patterns.generating.abstractFactory.transport.*;

public class CarFactory implements TransportFactory{

    public Transport createTransport (TaxiType type) {
        Transport car = null;

        switch (type){
            case ECONOMY -> car = new CarEconomy();
            case COMFORT -> car = new CarComfort();
            case BUSINESS -> car = new CarBusiness();
        }
        return car;
    }
}