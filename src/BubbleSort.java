import java.util.Arrays;

public class BubbleSort
{
    // A function to implement bubble sort
    static void sorter(int[] myArray, int length)
    {
        // Base case
        if (length == 1)
            return;

        int count = 0;
        // One pass of sort. After
        // this pass, the largest element
        // is bubbled to end.
        for (int i=0; i<length-1; i++)
            if (myArray[i] > myArray[i+1])
            {
                // swap
                int temp = myArray[i];
                myArray[i] = myArray[i+1];
                myArray[i] = temp;
                count = count+1;
            }

        // Check if any recursion happens or not
        // If any recursion is not happen then return
        if (count == 0)
            return;

        // Largest element is fixed,
        // recur for remaining array
        sorter(myArray, length-1);
    }

    // Driver Method
    public static void main(String[] args)
    {
        int unsorted[] = {64, 34, 25, 12, 22, 11, 90};

        sorter(unsorted, unsorted.length);

        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(unsorted));
    }
}