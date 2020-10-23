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
        this.files.add(new File(packet));
        files.forEach(file -> System.out.println(file.getPacket().getContents() +" has been saved in FileServer"));
    }
}
