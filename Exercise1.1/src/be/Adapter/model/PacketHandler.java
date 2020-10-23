package be.Adapter.model;

public abstract class PacketHandler extends Node {

    public PacketHandler(String address) {
        super(address);
    }


    @Override
    void send(Packet packet) {
        super.send(packet);
    }
    @Override
    void receive(Packet packet) {
        if (packet.getDestinationAddress().equals(this.getAddress())) {
            handlePacket(packet);
        }
        else{
            handlePacket(packet);
            this.send(packet);
        }
    }
    public abstract void handlePacket(Packet p);
}
