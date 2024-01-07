
import java.util.*;

class Mythread1 extends Thread
{
    public void run()
    {
        String name=Thread.currentThread().getName();
        System.out.println(name);
        if(name.equals("CAL"))
        {
            calc();
        }
        else
        {
            important();

        }

    }
    public void calc()
    {
        System.out.println("calculation start********");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int res=num1+num2;
        System.out.println(res);
        System.out.println("***********************");

    }
    public void important()
    {
        try
        {
            for(int i=0; i<4; i++)
            {
                System.out.println("keepgoing");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("somthing went wrong");
        }
    }
        
} 
public class Multithreading
{
    public static void main(String[] args)
    {
        Mythread1 t1=new Mythread1();
        Mythread1 t2=new Mythread1();
        String num=Thread.currentThread().getName();

        System.out.println(num);

        t1.setName("CAL");
        t2.setName("PRINT");

        t1.start();
        t2.start();
    }
}