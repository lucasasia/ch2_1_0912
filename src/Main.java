import java.util.Scanner;

public class Main {

    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int i;
            System.out.print("Input i=");
            i=sc.nextInt();
            System.out.println("i="+i);
            System.out.println("This project is OK!");
            for(i=1;i<=10;i++)
            {
                //System.out.println(i);
                System.out.printf("%d",i);
            }


    }
}
