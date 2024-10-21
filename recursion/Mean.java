class Mean{
    static int findSum(int[] arr, int i){
        if(arr.length==i){
            return 0;
        }
        return arr[i]+findSum(arr, i+1);
    }

    static void findMean(int[] arr,int i){
       //sum off all the number / total elemnt is mean
       int sum=findSum(arr, i);
       int mean=sum/arr.length;
       System.out.println(mean);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        findMean(arr,0);
    }
}