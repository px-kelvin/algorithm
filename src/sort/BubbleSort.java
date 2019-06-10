package sort;

import java.util.Arrays;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
 * if they are in wrong order
 */
public class BubbleSort implements AbstractSort {


    public static void main(String[] args) {
        int initArray []={2,4,6,1,3,0};
        AbstractSort abstractSort=new BubbleSort();
        abstractSort.sort(initArray);
        System.out.println(Arrays.toString(initArray));
    }

    @Override
    public void sort(int[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[i]){
                    int temp=array[j];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
