package be.templateMethod.model;

public abstract class PacketHandler extends Node {

    public PacketHandler(String address) {
        super(address);
    }


    public final void handlePacket(Packet packet){
        receive(packet);
    }
    @Override
    void send(Packet packet) {
        super.send(packet);
    }

    @Override
    void receive(Packet packet) {
        super.receive(packet);
    }
}
