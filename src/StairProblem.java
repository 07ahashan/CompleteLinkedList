public class StairProblem {
    static  int stairr(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        int ans=stairr(n-1)+stairr(n-2);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println( stairr(6));
    }
}
