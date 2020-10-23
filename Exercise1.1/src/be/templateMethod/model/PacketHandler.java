package be.templateMethod.model;

public abstract class PacketHandler extends Node {

    public PacketHandler(String address) {
        super(address);
    }


    public final void handlePacket(Packet packet){
        save(packet);
        print(packet);
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

    abstract void print (Packet packet);
    abstract void save (Packet packet);
}
