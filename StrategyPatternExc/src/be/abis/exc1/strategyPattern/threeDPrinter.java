package be.abis.exc1.strategyPattern;

import be.abis.exc1.strategyPattern.model.Packet;
import be.abis.exc1.strategyPattern.model.PrintStrategy;

public class threeDPrinter extends PrintStrategy {

    @Override
    public void print(Packet packet) {
        System.out.println(packet.getContents() +" at "+ packet.getDestinationAddress() + " and is originated from "+ this.getClass().getSimpleName());
    }
}
