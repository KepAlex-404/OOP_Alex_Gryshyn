import java.util.Random;
import java.util.Scanner;

//
//        C5 (9107 mod 5) = 2 (C = A+B);
//        C7 (9107 mod 7) = 0 (double);
//        C11 (9107 mod 11) = 10 (знайти середнє значення елементів матриці)
//
//


public class lab002 {

    public static String task(int m, int n)
    {
        Random rand = new Random();

        double[][] A = new double[m][n];      //обьявляем наши масивы
        double[][] B = new double[m][n];
        double[][] C = new double[m][n];
        double S = 0, avrg; //чтобі потом забахать среднее

        for (int i = 0; i < A.length; i++) //рандомим матрицы
        {
            for (int j = 0; j < A[i].length; j++)
            {
                A[i][j] = rand.nextDouble()*30;
                B[i][j] = rand.nextDouble()*30;
            }
        }

        for (int i = 0; i < A.length; i++)  //сумируем матрицы
        {
            for (int j = 0; j < A[i].length; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        //вывод всей инфы
        System.out.println("A: ");
        printMatrix(A);
        System.out.println("B: ");
        printMatrix(B);
        System.out.println("C: ");
        printMatrix(C);
        System.out.println("Average: ");
        for (int i = 0; i < A.length; i++)  //сумируем матрицы
        {
            for (int j = 0; j < A[i].length; j++)
            {
                S += C[i][j];
            }
        }
        avrg = S/(m*n);
        return Double.toString(avrg);

    }

    public static void main(String[] args)  //основной код
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input m: ");
        int m = sc.nextInt();
        System.out.print("Input n: ");
        int n = sc.nextInt();

        System.out.println(task(m,n));

    }

    public static void printMatrix(double[][] A)
    {
        for (double[] doubles : A) {
            for (double aDouble : doubles) {
                System.out.format("%.2f ", aDouble);

            }
            System.out.println();
        }
        System.out.println();

    }
}