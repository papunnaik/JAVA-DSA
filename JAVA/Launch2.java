class Launch2
{
    public static void main(String[] args)
    {
        String s1="Papun naik";
        String s2=" ";

        for(int i=s1.length()-1; i>=0; i--)
        {
          s2=s2 + s1.charAt(i);
         
        }
        System.out.println(s2);   //kian nupap


        //2ND CASE OF REVERSING

        String s4="jayant naik";
        String s5=" ";

        String s6[]=s4.split(" ");

        for(int i=s6.length-1; i>=0; i--)
        {
            s5=s5 + s6[i] + " ";
        }
        System.out.println(s5);   // naik jayant

        //3RD CASE OF REVERSING

        String s7=" Papun Naik";
        String s10=" ";
        String s8[]=s7.split(" ");

        for(String s9 : s8)
        {
            for(int i=s9.length()-1; i>=0; i--)
            {
                s10 = s10 + s9.charAt(i);
            }
            s10=s10 +" ";
        }
        System.out.println(s10);   // nupaP kiaN
    }
}