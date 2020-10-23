package be.templateMethod.model;

import java.util.ArrayList;
import java.util.List;

public class FileServer extends PacketHandler {
    private List<File> files = new ArrayList<>();

    public FileServer(String address) {
        super(address);
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    @Override
    void receive(Packet packet) {
        super.receive(packet);

    }

    @Override
    public void handlePacket(Packet p) {
        this.save(p);
    }


    void save(Packet packet) {
        files.forEach(file -> System.out.println(file.getPacket().getContents() +" is Already Added in FileServer"));
        this.files.add(new File(packet));
        System.out.println(packet.getContents() +" has been saved in FileServer");
    }
}
