import java.util.*;



class Employee
{
    private String name;
    private int empid;

    public Employee( String name, int empid)
    {
        this.name=name;
        this.empid=empid;
    }
    public String tostring()
    {
        return empid+" ";
    }


    public void finalize()
    {
        System.out.println("clear and clean");
    }
    

    
}
public class Map1
{
    public static void main(String[] args)
    {
        Employee emp=new Employee("papun",123);
         
        WeakHashMap hm= new WeakHashMap();

        hm.put(emp,"papun");


        emp=null;
        System.gc();

        System.out.println("********************");
    }
}