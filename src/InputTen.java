// Java Program to Remove Duplicate Elements
// From the Array using Set

import java.util.*;

public class InputTen {

    // Function to remove duplicate from array
    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++){
            set.add(a[i]);
//            if (set.equals(a[i])){
//                set.remove(a[i]);
//            }
        }

        set.removeAll(new HashSet<>());
        // Print the elements of LinkedHashSet
        System.out.print(set);
    }

    // Driver code
    public static void main()
    {
        int a[] = {5,2,6,8,6,7,5,2,8,8,8};

        for (int i=0; i < a.length; i++){

        }

        // Function call
//        removeDuplicates(a);
    }
}
