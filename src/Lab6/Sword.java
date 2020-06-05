package Lab6;


public class Sword extends Wagon{
    /**
     *
     * @param n назва меча
     * @param p ціна меча
     * @param w вага меча
     */
    public Sword(String n, int p, double w) {
        super(n, p, w);
    }
    /**тип Меч*/
    private String name = "Меч";
    /**
     * @ return інформацю
     */
    public String getInformation(){
        return "Тип "+ name + " "+super.getInformation();
    }
}
