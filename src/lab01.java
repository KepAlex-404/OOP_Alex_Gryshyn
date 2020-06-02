import java.util.Scanner;

/*
C2 = 1 -->  "-"
C3 = 2 -->  2
C5 = 2 -->  "%"
C7 = 0 -->  "byte"
 */


public class lab01
{

    public static String task(byte a, byte b, byte n, byte m)
    {

        float S = 0; //начальная сума
        int C = 2;


        try {
            for (byte i = (byte) a; i <= n; i++)
            {
                for (byte j = (byte) b; j <= m; j++)
                {
                    S += ((float) (i % j) / (i - C));
                    System.out.println("inside: " + S);
                }
                System.out.println("outside : " + S);
            }
            System.out.println("Answer : " + S);
        }catch (Throwable e)
        {
            System.out.println("Error");
        }

        return Float.toString(S);
    }
    public static void main(String[] args)
    {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("a(i) : ");
        byte a = scan1.nextByte();

        System.out.println("b(j) : ");
        byte b = scan1.nextByte();

        System.out.println("n : ");
        byte n = scan1.nextByte();

        System.out.println("m : ");
        byte m = scan1.nextByte();

        System.out.println(task(a,b,n,m));
    }
}