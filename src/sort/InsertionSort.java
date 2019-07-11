package sort;

import java.util.Arrays;

/**
 * Insertion Sort : Thy array elements are compare with each other sequentially and they
 * arranged simultaneously in some particular order
 */
public class InsertionSort implements AbstractSort {
    @Override
    public void sort(int[] array) {
        for(int i=1;i<array.length;i++){
            int temp=array[i];
            int leftIndex=i-1;
            while (leftIndex>=0 && array[leftIndex]>temp){
                array[leftIndex+1]=array[leftIndex];
                leftIndex--;
            }
            array[leftIndex+1]=temp;
        }
    }


    public static void main(String[] args) {
        int initArray []={4,2,6,1,3,0};
        AbstractSort abstractSort=new InsertionSort();
        abstractSort.sort(initArray);
        System.out.println(Arrays.toString(initArray));
    }
}
