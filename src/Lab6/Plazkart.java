package Lab6;


public class Plazkart extends Wagon
{

    public Plazkart(String name, Double cozy, int c, int w)
    {
        super(name, cozy, c, w);
    }


    public String getInformation()
    {
        String name = "Плацкарт";
        return "Тип "+ name + " "+super.getInformation();
    }
}
