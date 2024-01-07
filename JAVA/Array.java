class Array
{
    public static void main(String[] args)
    {
    
    // jagged array(no of coloumns are different)
   int [][]a={
           {2,4,6,3},
           {3,4},
           {4,5,8,7},
           {0,9,8}
         };
    // fetching the elements of the array
    for (int i=0; i<=2; i++)
     {
        for(int j=0; j<a[i].length; j++)
        {
            System.out.print(a[i][j] + " ");
        }
        System.out.print(a[i].length);
        System.out.println();
     }
     String num="papunnaik";
     System.out.println(num.length());
    }
   

}