package Lab6;

import java.util.ArrayList;

public class Lab6
{
    public static void main(String[] args)
    {
        /**
         * створюємо різну амуніцію
         */
        Armor armor = new Armor("armor1", 100, 20.5);
        Sword sword = new Sword("sword1", 120, 10.8);
        Helmet helmet = new Helmet("helmet1", 60, 3.8);
        /**
         * ствоорюємо масив амуніції для екіпіровки
         * одного лицаря
         */
        ArrayList<Wagon> am = new ArrayList<Wagon>();
        am.add(helmet);
        am.add(sword);
        am.add(armor);

        for (Wagon ammunition : am)
        {
            System.out.println(ammunition.getInformation());
        }

        Train chevalier = new Train(am);
        System.out.print("Вартість амуніції лицаря: ");


        /**рахуємо вартість амуніції лицаря*/
        System.out.println(chevalier.getPriceAmmunition());
        /**сортуємо за вагою*/
        chevalier.sortAmmunition(am);
        System.out.println("\nВідсортована амуніція");

        for (int i = 0; i < am.size(); i++)
        {
            System.out.println(( chevalier.getAmmunition().get(i)).getInformation());
        }

        /**діапазон цін для амуніції*/
        int minPrice = 15; int maxPrice = 100;
        System.out.println("\nAмуніція із вибраного діапазону цін: " + minPrice + "-" + maxPrice);


        /**пошук амуніції по заданому діапазоні*/
        for (int i = 0; i < am.size(); i++)
        {
            if ((am.get(i).getPrice() >= minPrice) && (am.get(i).getPrice() <= maxPrice))
            {
                System.out.println(am.get(i).getInformation());
            }
        }

    }
}

