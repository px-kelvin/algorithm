package sort;

import java.util.Arrays;

/**
 * Selection Sort is a simple and intuitive sorting algorithm
 * First , find the smallest element in the array.Then exchange it with the first element of the array(If the first
 * element is the smallest element , it exchanges with itself)
 * Then , find the smallest element of the remaining elements and swap it with the second element of the array
 * In the past , until the entire array is sorted
 *
 *
 */
public class SelectionSort implements AbstractSort {

    public static void main(String[] args) {
        int initArray []={2,4,6,1,3,0};
        AbstractSort abstractSort=new SelectionSort();
        abstractSort.sort(initArray);
        System.out.println(Arrays.toString(initArray));
    }


    @Override
    public void sort(int[] array) {
        for(int i=0;i<array.length;i++){
            //min is the smallest num index of this loop
            int min=i;
            for(int j=i;j<array.length;j++){
                if(array[min]>array[j]){
                    //find the smallest num index of the remaining array
                    min=j;
                }
            }
            if(min!=i){
                int temp=array[i];
                array[i]=array[min];
                array[min]=temp;
            }
        }
    }
}
