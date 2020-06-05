package Lab6;


public class Wagon
{
    /**местимость */
    private int capacity;
    /**вес багажа*/
    private int weight;
    private String name;
    /**назва*/
    private Double commodity;
    /**
     *
     * @param name тип вагона
     * @param cozy назва амуніції
     * @param c ціна амуніції
     * @param w вага амуніції
     */

    public Wagon(String w_name, Double cozy, int c, int w)
    {
        commodity=cozy;
        capacity=c;
        weight=w;
        name = w_name;
    }
    /**
     *
     * @return ціну
     */
    public int getCapacity()
    {
        return capacity;
    }
    /**
     *
     * @return вагу
     */
    public int getWeight()
    {
        return weight;
    }
    /**
     *
     * @return назву амуніції
     */
    public Double getCozy()
    {
        return commodity;
    }
    /**
     *
     * @return інформацію про предмет амуніції
     */
    public String getInformation()
    {
        return "Name: "+name+" Cozy: " +commodity+" Capacity: "+String.valueOf(capacity)+" Weight: "+String.valueOf(weight);
    }

}

