
import java.util.*;

public class Kata {
//    public static void kata(){
////        arrayDiff(new int[]{1, 2, 3, 20, 100}, new int[]{3, 4, 20, 50, 100});
////    }
    public static int[] arrayDiff(int[] a, int[] b) {

//        a = new int[];
//        b = new int[];

//        ArrayList<Integer> listA = new ArrayList<Integer>();
//        ArrayList<Integer> listB = new ArrayList<Integer>();
//
        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//            listA.add(a[i]);
//            listA.get(i);
        }
//
        for (int j = 0; j < b.length; j++) {
//            System.out.println(b[j]);
//            listB.add(b[j]);
//            listB.get(j);
        }
//
//        int[] newA = convertToInt(listA); //convert ArrayList to Int[]
//        int[] newB = convertToInt(listB); //convert ArrayList to Int[]
        //Merge Arrays
        int al = a.length;
        int bl = b.length;
        int[] res = new int[al + bl];
        System.arraycopy(a, 0, res, 0, al);
        System.arraycopy(b, 0, res, al, bl);

//        System.out.println(Arrays.toString(res));
        // End of Merging

        Arrays.sort(res);

        a = removeDups(res);

        return a;
    }

    private static int[] convertToInt(ArrayList<Integer> listA) {
        Object[] obj_arr = listA.toArray();
        int[] arr = new int[listA.size()];
        for (int i = 0; i < obj_arr.length; i++) {
            arr[i] = (int) obj_arr[i];
        }

        return arr;
    }

    public static int[] removeDups(int[] a){
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);


        // Print the elements of LinkedHashSet
        System.out.println(set);
        return a;
    }
}