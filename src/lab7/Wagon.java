package lab7;


public class Wagon
{
    private int capacity;
    private int weight;
    private String name;
    private Double commodity;

    public Wagon(String w_name, Double cozy, int c, int w)
    {
        commodity=cozy;
        capacity=c;
        weight=w;
        name = w_name;
    }

    public String toString() {
        return "Вагон {" +
                "class=" + /*this.*/getClass().getSimpleName() +
                ", название=" + name +
                '}';
    }

    public int getCapacity()
    {
        return capacity;
    }

    public int getWeight()
    {
        return weight;
    }

    public Double getCozy()
    {
        return commodity;
    }

    //@todo smth

    public String getInformation()
    {
        return "Name: "+name+" Cozy: " +commodity+" Capacity: "+String.valueOf(capacity)+" Weight: "+String.valueOf(weight);
    }

}

