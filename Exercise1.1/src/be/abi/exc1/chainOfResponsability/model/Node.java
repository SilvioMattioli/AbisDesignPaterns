package be.abi.exc1.chainOfResponsability.model;

public class Node extends LanComponent{


    public Node(String address) {
        super(address);
    }

    @Override
    void send(Packet packet) {
        System.out.println("has arrived at " + this.getAddress());
       this.getNextComponent().receive(packet);
    }
    @Override
    void receive(Packet packet) {
        send(packet);
    }
}
