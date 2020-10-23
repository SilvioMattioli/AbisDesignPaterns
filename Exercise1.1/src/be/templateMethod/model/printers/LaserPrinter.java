package be.templateMethod.model.printers;

import be.templateMethod.model.Packet;
import be.templateMethod.model.PrintStrategy;
public class LaserPrinter implements PrintStrategy {
    public LaserPrinter() {
    }

    @Override
    public void print(Packet packet) {
        System.out.println(packet.getContents() +" at "+ packet.getDestinationAddress() + " and is originated from "+ this.getClass().getSimpleName());
    }
}