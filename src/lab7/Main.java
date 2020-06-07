package lab7;




import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        MySet mySet = new MySet(new Wagon("Lux1", 10.0, 15, 30));

        Wagon plazkart = new Wagon("Plazkart1",3.5,50,120);

        mySet.add(new Wagon("Lux2", 10.0, 15, 30));
        mySet.add(new Wagon("Lux3", 10.0, 15, 30));

        ArrayList<Wagon> arrayList = new ArrayList<Wagon>();
        arrayList.add(new Wagon("Lux1", 10.0, 15, 30));
        arrayList.add(new Wagon("Lux5", 10.0, 15, 30));
        arrayList.add(plazkart);
        System.out.println(arrayList);
        MySet list2 = new MySet(arrayList);

        for (Object o: list2) {
            System.out.println(o);
        }


        System.out.println("++++++++++++");

        ListIterator listIterator = list2.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());

        System.out.println(list2.contains(plazkart));
    }
}
