class Eforloop
{
    public static void main(String[] args)
    {
        int []nums={1,2,3,4};
        for(int a:nums)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        int [][]hums={
                      {1,2,3,2},
                      {4,5,6},
                      {7,8,9}
        };
        for(int []b:hums)
        {
            for(int c:b)
            {
                System.out.print(c+ " ");
                
            }
            System.out.println();
        }
    }
}