package by.astakhnovich.patterns.generating.abstractFactory.factorys;

import by.astakhnovich.patterns.generating.abstractFactory.transport.TaxiType;
import by.astakhnovich.patterns.generating.abstractFactory.transport.*;

public class HelicopterFactory implements TransportFactory{

    public Transport createTransport (TaxiType type) {
        Transport helicopter = null;

        switch (type){
            case COMFORT -> helicopter = new HelicopterComfort();
            case BUSINESS -> helicopter = new HelicopterBusiness();
        }
        return helicopter;
    }
}