package be.templateMethod.model;

public class PrintServer extends PacketHandler {

    private PrintStrategy printStrategy;


    public PrintServer(String address, PrintStrategy printStrategy) {
        super(address);
        this.printStrategy = printStrategy;
    }

    @Override
    void receive(Packet packet) {
        System.out.println("has arrived at " + this.getAddress());
        if (packet.getDestinationAddress().equals(this.getAddress())) {
            this.printStrategy.print(packet);
        } else {
            this.send(packet);
        }
    }
}
