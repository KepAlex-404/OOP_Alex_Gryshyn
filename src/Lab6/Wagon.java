package Lab6;


public class Wagon {
    /**ціна */
    private int price;
    /**вага*/
    private double weight;
    /**назва*/
    private String name_am;
    /**
     *
     * @param name назва амуніції
     * @param p ціна амуніції
     * @param w вага амуніції
     */

    public Wagon (String name, int p , double w){
        name_am=name;
        price=p;
        weight=w;
    }
    /**
     *
     * @return ціну
     */
    public int getPrice(){
        return price;
    }
    /**
     *
     * @return вагу
     */
    public double getWeight(){
        return weight;
    }
    /**
     *
     * @return назву амуніції
     */
    public String getName() {
        return name_am;
    }
    /**
     *
     * @return інформацію про предмет амуніції
     */
    public String getInformation(){
        return "Name:" +name_am+" Price:"+String.valueOf(price)+" Weight:"+String.valueOf(weight);
    }

}
