package be.templateMethod.model;

public class PrintServer extends PacketHandler {

    private PrintStrategy printStrategy;


    public PrintServer(String address, PrintStrategy printStrategy) {
        super(address);
        this.printStrategy = printStrategy;
    }

    @Override
    void receive(Packet packet) {
        super.receive(packet);
    }

    @Override
    public void handlePacket(Packet p) {
        print(p);

    }

    void print(Packet packet) {
        this.printStrategy.print(packet);
    }

}
