public class recursion_1 {
    static int fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        int ans=fibonacci(n-1)+fibonacci(n-2);
        return  ans;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
}
