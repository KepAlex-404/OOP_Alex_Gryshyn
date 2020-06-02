package lab5;

public class Main {

    public static void main(String[] args) {
        Text text = new Text("Hello, world. Hello, Oleksii!");
        System.out.println(text);
        Client client = new Client(text);
        client.startLiveInTheSystem();


        System.out.println("Done! :)");
    }
}