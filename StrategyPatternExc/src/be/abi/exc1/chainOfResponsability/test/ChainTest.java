package be.abi.exc1.chainOfResponsability.test;

import be.abi.exc1.chainOfResponsability.model.Node;
import be.abi.exc1.chainOfResponsability.model.Packet;
import be.abi.exc1.chainOfResponsability.model.PrintServer;
import be.abi.exc1.chainOfResponsability.model.WorkStation;

public class ChainTest {

    public static void main(String[] args) {
        Packet packet = new Packet("p2", "this message has arrived");

        WorkStation w1 = new WorkStation("w1");
        PrintServer p1 = new PrintServer("p1");
        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        PrintServer p2 = new PrintServer("p2");
        Node n3 = new Node("n3");



        //structure
        w1.setNextComponent(p1);
        p1.setNextComponent(n1);
        n1.setNextComponent(n2);
        n2.setNextComponent(p2);
        p2.setNextComponent(n3);




        w1.originate(packet);





    }
}
