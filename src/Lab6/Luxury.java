package Lab6;


public class Luxury extends Wagon{

    public Luxury(String name, Double cozy, int c, int w)
    {
        super(name, cozy, c, w);
    }


    public String getInformation()
    {

        String name = "Люкс";
        return "Тип "+ name + " "+super.getInformation();
    }
}
