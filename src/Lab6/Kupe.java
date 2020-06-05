package Lab6;


public class Kupe extends Wagon
{

    public Kupe(String name, Double cozy, int c, int w)
    {
        super(name, cozy, c, w);
    }


    public String getInformation()
    {
        String name = "Купе";
        return "Тип "+ name + " "+super.getInformation();
    }
}
