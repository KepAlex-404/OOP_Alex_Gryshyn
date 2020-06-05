package Lab6;

import java.util.ArrayList;


public class Train
{
    private ArrayList<Wagon> consist;
    public Train(ArrayList<Wagon> con)
    {
        consist = con;

    }

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

    private void swap(ArrayList<Wagon> arr, int i, int j)
    {
        Wagon t = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, t);
    }

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

    public ArrayList<Wagon> getTrain()
    {
        return consist;
    }


}
