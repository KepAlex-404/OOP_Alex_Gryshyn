package lab5;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input your text");
        String sr = scan.nextLine();

        System.out.println("Input letter for sort by");
        char a = scan.nextLine().charAt(0);

        Text text = new Text(sr);

        Client client = new Client(text, a);
        client.startLiveInTheSystem();

        System.out.println("Done! :)");
    }
}