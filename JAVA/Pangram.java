

import java.util.Arrays;

public class Pangram
{
    public static void main(String[] args)
   {
    String s1="the quick brown fox junp over lazy dogs";
    s1=s1.replace(" ","");
    s1=s1.toUpperCase();

    System.out.println(s1);

    char []arr1=s1.toCharArray();

    System.out.println(arr1);

    int []arr2=new int[26];

    System.out.println(arr2);

    for(int i=0; i<arr1.length; i++)
    {
        arr2[arr1[i]-65]++;
    }

    System.out.println(arr2);
    
    for(int i=0; i<arr2.length; i++);
    {
        if(arr2[i]==0)
        {
            System.out.println("Not a Panagram");
        }

    }

    System.out.println("Panagram");

  }  
   

    


}