class Demo
{
    public static int add(int num[])
    {
        int result=0;
        for(int n:num)
        {
            result=result+n;
        }
        return result;
    }
    
}

class Arrayadd
{
    public static void main(String[ ] args)
    {
        Demo obj=new Demo();
        int result=obj.add(new int[]{1,2,3,4,5,6,7,8,9});
        System.out.print(result);
    }
}
