package be.templateMethod.model.printers;

import be.templateMethod.model.Packet;
import be.templateMethod.model.PrintStrategy;
public class ThreeDPrinter implements PrintStrategy {
    public ThreeDPrinter() {
    }

    @Override
    public void print(Packet packet) {
        System.out.println(packet.getContents() +" has arrived at "+ packet.getDestinationAddress() + " is printed and is originated from "+ this.getClass().getSimpleName());
    }
}
