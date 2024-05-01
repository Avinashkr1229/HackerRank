package dsa.arrays;

/*
* Given an array of elements of length N, ranging from 0 to N-1, your task is to write a program that rearranges the elements of the array. All elements may not be present in the array, if the element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.

Example 1:

Input : A[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
Output : -1 1 2 3 4 -1 6 -1 -1 9
Explanation:
Here We can see there are 10 elements. So, the sorted array
will look like {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} but in our
array we are not having 0, 5, 7 and 8. So, at there places
we will be printing -1 and otherplaces will be having elements.*/
public class Reaarange2 {
    public static int[] rearrange(int arr[], int n) {
        boolean[] array = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                array[arr[i]] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            if (array[i]) {
                arr[i] = i;
            } else {
                arr[i] = -1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        rearrange(arr, arr.length);
    }
}
