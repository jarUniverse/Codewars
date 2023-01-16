import java.util.ArrayList;
import java.util.Scanner;

public class KataLikes {
    public static String whoLikesIt(String... names){

        ArrayList<String> listA = new ArrayList<String>();

        for (int i = 0; i<names.length; i++){
//            System.out.println(names[i]);
            listA.add(names[i]);
            listA.get(i);
        }

        String nameList = String.join(", ", listA); //Convert ArrayList to Seperate String
//        int index0 = Integer.parseInt(listA.get(0));
//        int index1 = Integer.parseInt(listA.get(1));
//        int index2 = Integer.parseInt(listA.get(2));
//        System.out.println(nameList);
        if (listA.size() > 3) {
            System.out.println(listA.get(0) + ", " + listA.get(1) + ", " + listA.get(2) + ", and 2 Others Like This");
        } else if (listA.size() > 1 && listA.size() <= 3 ) {
            System.out.println(listA.get(0) + "and " + listA.get(1) + " Like This! ");
            System.out.println(listA.get(0));
        }else {
            System.out.println(listA.get(0) +" Like This!");
        }


        return String.format(listA.toString());
    }
}
