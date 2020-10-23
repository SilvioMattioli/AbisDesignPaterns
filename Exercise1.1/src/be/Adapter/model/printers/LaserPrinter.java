package be.Adapter.model.printers;

import be.Adapter.model.Packet;
import be.Adapter.model.PrintStrategy;

public class LaserPrinter implements PrintStrategy {
    public LaserPrinter() {
    }

    @Override
    public void print(Packet packet) {
        System.out.println(packet.getContents() +" has arrived at "+ packet.getDestinationAddress() + " is printed and is originated from "+ this.getClass().getSimpleName());
    }
}
