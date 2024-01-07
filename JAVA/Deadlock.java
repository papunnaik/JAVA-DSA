class Library implements Runnable
{
    String res1=new String("JAVA");
    String res2=new String("DSA");
    String res3=new String("SQL");

    public void run()
    {
        String name=Thread.currentThread().getName();
        if(name.equals("STUDENT1"))
        {
            try
            {
                Thread.sleep(2000);
                synchronized(res1)
                {
                    System.out.println("STUDENT1" + res1);
                    Thread.sleep(2000);
                    synchronized(res2)
                    {
                        System.out.println("STUDENT1" + res2);
                        Thread.sleep(2000);
                        synchronized(res3)
                        {
                            System.out.println("STUDENT1" + res3);
                            Thread.sleep(2000);
                        }

                    }
                }

            }
            catch(Exception e)
            {
                System.out.println("SOMETHING WENT WRONG");

            }
        }
        else
        {
            try
            {
                Thread.sleep(2000);
                synchronized(res3)
                {
                    System.out.println("STUDENT2" + res3);
                    Thread.sleep(2000);
                    synchronized(res2)
                    {
                        System.out.println("STUDENT2" + res2);
                        Thread.sleep(2000);
                        synchronized(res1)
                        {
                            System.out.println("STUDENT2" + res1);
                            Thread.sleep(2000);
                        }

                    }
                }

            }
            catch(Exception e)
            {
                System.out.println("SOMETHING WENT WRONG");

            }

        }

    }
}
public class Deadlock
{
    public static void main(String[] args)
    {
        Library li=new Library();

        Thread t1=new Thread(li);
        Thread t2=new Thread(li);

        t1.setName("STUDENT1");
        t2.setName("STUDEENT2");

        t1.start();
        t2.start();
    }
}