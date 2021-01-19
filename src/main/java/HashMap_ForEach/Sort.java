package HashMap_ForEach;

import java.util.ArrayList;
import java.util.HashMap;

public class Sort {

    public void sortArray(ArrayList<Integer> toSort){

        for (int i=0; i<toSort.size()-1;i++){
            for(int j=0;j <toSort.size()-i-1;j++){  //so that it does not have to check the elements at last which are already sorted
                if(toSort.get(j) > toSort.get(j + 1)) {
                    int temp = toSort.get(j);
                    toSort.set(j, toSort.get(j + 1));
                    toSort.set(j+ 1, temp);
                    System.out.println(toSort);
                }
            }
        }
    }


    //based upon the value send from the parameter print the Value on console
    public void checkHashValue(int i) {
        HashMap<Integer, String> checkValue = new HashMap<>();
        checkValue.put(1, "One");
        checkValue.put(2, "Two");
        checkValue.put(3, "Three");
        checkValue.put(4, "Four");

        System.out.println("The value of " + i + " is " + checkValue.get(i));
    }




}
