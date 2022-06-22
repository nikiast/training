package by.astakhnovich.patterns.generating.factory_method;

import by.astakhnovich.patterns.generating.factory_method.transport.*;

public class CarFactory {
    public Transport createTransport (CarType type) {
        Transport car = null;

        switch (type){
            case ECONOMY -> car = new CarEconomy();
            case COMFORT -> car = new CarComfort();
            case BUSINESS -> car = new CarBusiness();
        }
        return car;
    }
}
