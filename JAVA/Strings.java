

public class Strings

{
    public static void main(String[] args)
    {
        String s1="pw";
        String s2=new String("skills");
        String s3="pw";
        String s4=new String("skills");
        
        // COMPARISION OF STRING
       
        System.out.println(s1==s2);    //FALSE
        System.out.println(s1==s3);    //TRUE
        System.out.println(s2==s4);    //FALSE
        System.out.println(s1.equals(s3));  //TRUE
        System.out.println(s2.equals(s4));  //TRUE
        
        // CONCATINATION
        
        s1=s1.concat("skill"); //S1=pwskills
        s2=s2.concat("pw");    //s2=skillspw
        System.out.println(s1);
        System.out.println(s2);
    }

}