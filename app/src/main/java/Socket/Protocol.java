package Socket;

class Protocol {
    public String name;

    public Protocol(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Protocol{" +
                "name='" + name + '\'' +
                '}';
    }
}
