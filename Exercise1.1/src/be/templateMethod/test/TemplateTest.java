package be.templateMethod.test;


import be.templateMethod.model.*;
import be.templateMethod.model.printers.InkJetPrinter;
import be.templateMethod.model.printers.LaserPrinter;

public class TemplateTest {

    public static void main(String[] args) {
        Packet packet = new Packet("p1", "this message 1");
        Packet packet2 = new Packet("p1", "this message  2");
        Packet packet3 = new Packet("p2", "this message  3");

        WorkStation w1 = new WorkStation("w1");
        InkJetPrinter inkJetPrinter = new InkJetPrinter();
        PrintServer p1 = new PrintServer("p1", inkJetPrinter);
        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        LaserPrinter laserPrinter = new LaserPrinter();
        PrintServer p2 = new PrintServer("p2", laserPrinter);
        Node n3 = new Node("n3");
        FileServer f1 = new FileServer("f1");
        MQServer mq1 = new MQServer("mq1");


        //structure
        w1.setNextComponent(f1);
        f1.setNextComponent(p1);
        p1.setNextComponent(n1);
        n1.setNextComponent(mq1);
        mq1.setNextComponent(n2);
        n2.setNextComponent(p2);
        p2.setNextComponent(n3);
        n3.setNextComponent(w1);




        w1.originate(packet);
        w1.originate(packet2);
        w1.originate(packet3);





    }
}
