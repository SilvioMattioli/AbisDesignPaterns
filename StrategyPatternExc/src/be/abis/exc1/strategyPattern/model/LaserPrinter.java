package be.abis.exc1.strategyPattern.model;

public class LaserPrinter implements PrintStrategy {

    @Override
    public void print(Packet packet) {
        System.out.println(packet.getContents() +" at "+ packet.getDestinationAddress() + " and is originated from "+ this.getClass().getSimpleName());
    }
}
