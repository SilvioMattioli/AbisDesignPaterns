package be.abi.exc1.chainOfResponsability.model;

abstract class LanComponent {
    private String address;
    private LanComponent nextComponent;

    public LanComponent(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LanComponent getNextComponent() {
        return nextComponent;
    }

    public void setNextComponent(LanComponent nextComponent) {
        this.nextComponent = nextComponent;
    }
    abstract void send(Packet packet);
    abstract void receive(Packet packet);
}
