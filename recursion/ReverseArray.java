

public class ReverseArray {

    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverseArrayPrint(int[] array,int i){
        if(array.length==i)return;
        System.out.print(array[array.length-1-i]+" ");
        reverseArrayPrint(array, i+1);
    }

    static void reverseArray(int[] arr, int i,int j){
        if(i>=j)return;
        swap(arr,i,j);
        reverseArray(arr, i+1, j-1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int i=0, j=array.length-1;
        // reverseArrayPrint(array,i);
        reverseArray(array,i,j);
        for(int x:array){
            System.out.println(x);
        }
    }
    
}
