package be.abi.exc1.chainOfResponsability.model;

public class PrintServer extends Node {

    public PrintServer(String address) {
        super(address);
    }

    @Override
    void receive(Packet packet) {
        if(packet.getDestinationAddress().equals(this.getAddress())){
           print(packet);
        }
        else{
            this.getNextComponent().receive(packet);
        }
    }

    public void print(Packet packet){
        System.out.println(packet.getContents());
    }
}
