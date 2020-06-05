/*  9107 % 13 = 7  => Визначити ієрархію рухомого складу залізничного транспорту.
Створити пасажирський потяг. Порахувати загальну чисельність пасажирів і багажу в потязі.
Провести сортування вагонів потягу за рівнем комфортності. Знайти вагон в потязі,
що відповідає заданому діапазону кількості пасажирів.*/

package Lab6;

import java.util.ArrayList;

public class Lab6
{
    public static void main(String[] args)
    {

        Luxury lux1 = new Luxury("Lux1", 10.0, 15, 30);
        Luxury lux2 = new Luxury("Lux2", 9.8, 14, 28);
        Plazkart plazkart = new Plazkart("Plazkart1",3.5,50,120);
        Kupe kupe1 = new Kupe("Kupe1",6.0,30,90);
        Kupe kupe2 = new Kupe("Kupe2",6.4,24,78);


        ArrayList<Wagon> am = new ArrayList<Wagon>();
        am.add(lux1);
        am.add(lux2);
        am.add(plazkart);
        am.add(kupe1);
        am.add(kupe2);

        for (Wagon sostav : am)
        {
            System.out.println(sostav.getInformation());
        }

        Train train = new Train(am);
        System.out.print("Кол-во пассажиров и багажа:\n");


        /*кол-во пассажиров*/
        System.out.println(train.getCapacity());
        /*кол-во багажа*/
        System.out.println(train.getWeight());


        /*сортируем по кофморту*/
        train.sortTrain(am);
        System.out.println("\nОтсортированые вагончики:");

        for (int i = 0; i < am.size(); i++)
        {
            System.out.println(( train.getTrain().get(i)).getInformation());
        }


        /*поиск вагончика в диапазоне*/
        int minCapacity = 15; int maxCapacity = 25;
        System.out.println("\nВагоны к кол-вом пассажиров в таком диапазоне: " + minCapacity + "-" + maxCapacity);

        for (Wagon wagon : am) {
            if ((wagon.getCapacity() >= minCapacity) && (wagon.getCapacity() <= maxCapacity)) {
                System.out.println(wagon.getInformation());
            }
        }
//        for (int i = 0; i < am.size(); i++)
//        {
//            if ((am.get(i).getCapacity() >= minCapacity) && (am.get(i).getCapacity() <= maxCapacity))
//            {
//                System.out.println(am.get(i).getInformation());
//            }
//        }


    }
}

