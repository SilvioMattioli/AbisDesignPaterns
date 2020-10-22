package be.abi.exc1.chainOfResponsability.model;

public class WorkStation extends Node {


    public WorkStation(String address) {
        super(address);
    }

    public void originate(Packet packet){
        this.getNextComponent().receive(packet);
    }
}
