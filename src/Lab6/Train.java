package Lab6;

import java.util.ArrayList;


public class Train {
    private ArrayList<Wagon> ammunition;
    /**
     *
     * @param am амуніція для одного лицаря
     */
    public Train(ArrayList<Wagon> am) {
        ammunition = am;

    }
    /**
     *
     * @return ціну всієї амуніції для лицаря
     */
    public int getPriceAmmunition(){
        int price=0;
        for (Wagon ammun : ammunition) {
            price += ammun.getPrice();
        }
        return price;
    }
    /**
     *
     * @param arr масив амуніції
     * @param i позиція для заміни
     * @param j позиція для заміни
     */
    private void swap(ArrayList<Wagon> arr, int i, int j) {
        Wagon t = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, t);
    }
    /**
     * метод сортує амуніцію по вазі
     * @param arr масив амуніції
     *
     */
    public void sortAmmunition(ArrayList<Wagon> arr){
        for(int i = arr.size()-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr.get(j).getWeight() > arr.get(j+1).getWeight())
                    swap(arr, j, j+1);
            }
        }
    }
    /**
     *
     * @return
     */
    public ArrayList<Wagon> getAmmunition(){
        return ammunition;
    }


}
