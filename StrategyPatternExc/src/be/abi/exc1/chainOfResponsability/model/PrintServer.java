package be.abi.exc1.chainOfResponsability.model;

public class PrintServer extends Node {

    public PrintServer(String address) {
        super(address);
    }

    @Override
    void receive(Packet packet) {
        System.out.println("has arrived at " + this.getAddress());
        if(packet.getDestinationAddress().equals(this.getAddress())){
           print(packet);
        }
        else{
            super.send(packet);
        }
    }

    public void print(Packet packet){
        System.out.println(packet.getContents() +" at "+ this.getAddress() + " and is originated from "+ this.getClass().getSimpleName());
    }
}
