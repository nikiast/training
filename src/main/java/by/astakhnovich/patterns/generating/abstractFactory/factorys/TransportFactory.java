package by.astakhnovich.patterns.generating.abstractFactory.factorys;

import by.astakhnovich.patterns.generating.abstractFactory.transport.TaxiType;
import by.astakhnovich.patterns.generating.abstractFactory.transport.Transport;

public interface TransportFactory {
    Transport createTransport (TaxiType type);
}