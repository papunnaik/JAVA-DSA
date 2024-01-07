import java.util.*;

public class LIST
{
    public static void main(String[] args)
{
    LinkedList ll1=new LinkedList();
    ll1.add(20);
    ll1.add(300);
    ll1.add("pw");
    System.out.println(ll1);
    
    ll1.push(400);

    System.out.println(ll1);

    ll1.add(900);
    System.out.println(ll1);

    System.out.println(ll1.pop());


}

}
    