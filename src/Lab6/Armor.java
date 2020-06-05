package Lab6;


public class Armor extends Wagon {
    /**
     *
     * @param n назва кольчуги
     * @param p	ціна кольчуги
     * @param w вага кольчуги
     */
    public Armor(String n, int p, double w) {
        super(n, p, w);
    }

    /**
     * @ return інформацю
     */
    public String getInformation(){
        /**тип кольчуга*/
        String name = "Кольчуга";
        return "Тип "+ name + " "+super.getInformation();
    }
}
