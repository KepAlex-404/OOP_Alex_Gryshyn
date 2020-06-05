package Lab6;

import java.util.ArrayList;


public class Train
{
    private ArrayList<Wagon> consist;
    /**
     *
     * @param con амуніція для одного лицаря
     */
    public Train(ArrayList<Wagon> con)
    {
        consist = con;

    }
    /**
     *
     * @return ціну всієї амуніції для лицаря
     */
    public Integer getCapacity()
    {
        int cp_ty=0;
        for (Wagon ammun : consist)
        {
            cp_ty += ammun.getCapacity();
        }
        return cp_ty;
    }

    public Integer getWeight()
    {
        int weight=0;
        for (Wagon ammun : consist)
        {
            weight += ammun.getWeight();
        }
        return weight;
    }

    /**
     *
     * @param arr масив амуніції
     * @param i позиція для заміни
     * @param j позиція для заміни
     */
    private void swap(ArrayList<Wagon> arr, int i, int j)
    {
        Wagon t = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, t);
    }
    /**
     * метод сортує амуніцію по вазі
     * @param arr масив амуніції
     *
     */
    public void sortTrain(ArrayList<Wagon> arr)
    {
        for(int i = arr.size()-1 ; i > 0 ; i--)
        {
            for(int j = 0 ; j < i ; j++)
            {
                if( arr.get(j).getCozy() > arr.get(j+1).getCozy())
                    swap(arr, j, j+1);
            }
        }
    }
    /**
     *
     * @return
     */
    public ArrayList<Wagon> getTrain()
    {
        return consist;
    }


}
