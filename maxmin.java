import java.util.*;
public class maxmin{

    //creating functions
    public static void MaxMin(int arr1[],int n){
        int min;
        int max;

        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[0]>min)
            {
                min=arr1[0];
            }

            if(arr1[0]<max)
            {
                max=arr1[0];
            }
            System.out.print(min+"  "+max);
        }
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int n;
        System.out.print(MaxMin(arr1,n));

    }
}