package be.abis.exc1.strategyPattern.model;

public class WorkStation extends Node {


    public WorkStation(String address) {
        super(address);
    }

    public void originate(Packet packet){
        this.send(packet);
    }
}
