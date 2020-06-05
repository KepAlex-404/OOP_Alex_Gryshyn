package Lab6;

import java.util.ArrayList;

public class Lab6
{
    public static void main(String[] args)
    {
        /**
         * дабавляем разные вагоны
         */
        Luxury lux1 = new Luxury("Lux1", 10.0, 15, 30);
        Luxury lux2 = new Luxury("Lux2", 9.8, 150, 30);

        /**
         * создаем масив вагонов одного поезда
         */
        ArrayList<Wagon> am = new ArrayList<Wagon>();
//        am.add(helmet);
        am.add(lux1);
        am.add(lux2);

//        am.add(armor);

        for (Wagon ammunition : am)
        {
            System.out.println(ammunition.getInformation());
        }

        Train train = new Train(am);
        System.out.print("Кол-во пассажиров и багажа:\n");


        /**кол-во пассажиров*/
        System.out.println(train.getCapacity());
        /**кол-во багажа*/
        System.out.println(train.getWeight());


        /**сортируем по кофморту*/
        train.sortTrain(am);
        System.out.println("\nОтсортированые вагончики:");

        for (int i = 0; i < am.size(); i++)
        {
            System.out.println(( train.getTrain().get(i)).getInformation());
        }


        /**поиск вагончика в диапазоне*/
        int minCapacity = 15; int maxCapacity = 100;
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

