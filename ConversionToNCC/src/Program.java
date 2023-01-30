import java.sql.SQLOutput;
import java.util.Scanner;
public class Program {
    public static void main(String[] args)
    {
      //  int a=5;
      //  int b=2;
      //  float c=a/b;

        int power=1;
        int res=0;
        final char s1=13;
        final char s2=10;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для конвертации"+s1+s2);
        int x = in.nextInt();
        System.out.println("Введите новую СС\n");
        int N = in.nextInt();


        while(x>0)
        {
            int ost=x%N;
            x=x/N;
            res+=power*ost;
            power*=10;
        }
        System.out.println("Новое число\n");
        System.out.println(res);




    }

}
