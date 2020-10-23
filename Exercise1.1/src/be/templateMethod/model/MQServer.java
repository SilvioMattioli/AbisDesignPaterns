package be.templateMethod.model;

import java.util.PriorityQueue;
import java.util.Queue;

public class MQServer extends PacketHandler {
    Queue<String> messages = new PriorityQueue<>();

    public MQServer(String address) {
        super(address);
    }

    public Queue<String> getMessages() {
        return messages;
    }

    public void setMessages(Queue<String> messages) {
        this.messages = messages;
    }

    @Override
    void receive(Packet packet) {
        super.receive(packet);
        this.messages.add(packet.getContents());
        messages.forEach(file -> System.out.println(file +" has been saved in MQServer"));
    }
}
