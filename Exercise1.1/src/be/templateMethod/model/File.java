package be.templateMethod.model;

import be.templateMethod.model.Packet;

public class File {

    private Packet packet;

    public File(Packet packet) {
        this.packet = packet;
    }

    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
    }
}
