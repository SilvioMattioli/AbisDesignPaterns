package be.abis.exc1.strategyPattern.model;

public class InkJetPrinter implements PrintStrategy {
    public InkJetPrinter() {
    }

    @Override
    public void print(Packet packet) {
        System.out.println(packet.getContents() +" at "+ packet.getDestinationAddress() + " and is originated from "+ this.getClass().getSimpleName());
    }
}
