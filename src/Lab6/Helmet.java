package Lab6;


public class Helmet extends Wagon {
    /**
     *
     * @param n назва шолома
     * @param p ціна шолома
     * @param w вага шолома
     */
    public Helmet(String n, int p, double w) {
        super(n, p, w);
    }
    /**Тип шолом */
    private String name = "Шолом";
    /**
     * @ return інформацю
     */
    public String getInformation(){
        return "Тип "+ name + " "+super.getInformation();
    }
}
