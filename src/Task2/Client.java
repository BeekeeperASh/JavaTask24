package Task2;

// Client.java
public class Client {

    Chair chair;
    public void sit() {
        System.out.println("Client is sitting on " + chair.getClass());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public static void main(String[] args) {

        Client client = new Client();
        ChairFactory chairFactory = new ChairFactory();
        client.setChair(chairFactory.createMagicChair());
        client.sit();
    }
}

