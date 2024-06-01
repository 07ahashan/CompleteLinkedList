public class LinearSearch {
    static int Search(int[] arr,int size,int key)
    {
        return help(arr,size,0,key);
    }

    static int help( int[] arr,int size,int idx,int key) {
        //base Cases
        if (idx == size) {
            return -1;//element not found
        }
        if (arr[idx] == key)
        {
            return idx;
        }

        return help(arr,size,idx+1,key);
    }
    public static void main(String[] args) {
        int []arr={4,7,5,2,8,6};
        int ans=Search(arr,6,10);

        if(ans==-1)
        {
            System.out.println("Element Not Found" );
        }else
        {
            System.out.println("Element Found");
        }
    }
}
