package lab5;

public class Client
{
    private Text text;
    private Character a;


    public Client(Text text, Character a)
    {
        this.text = text;
        this.a = a;
    }

    public void startLiveInTheSystem()
    {
        System.out.println("Word in order: " + text.sortAll(a));
    }

}