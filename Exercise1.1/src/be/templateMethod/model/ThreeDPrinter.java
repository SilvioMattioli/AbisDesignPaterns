package be.templateMethod.model;

public class ThreeDPrinter implements PrintStrategy {
    public ThreeDPrinter() {
    }

    @Override
    public void print(Packet packet) {
        System.out.println(packet.getContents() +" at "+ packet.getDestinationAddress() + " and is originated from "+ this.getClass().getSimpleName());
    }
}
