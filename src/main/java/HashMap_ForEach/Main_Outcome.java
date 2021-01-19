package HashMap_ForEach;

import java.util.ArrayList;

public class Main_Outcome {

    public static void main(String[] args) {

        ArrayList<Integer> toSort = new ArrayList<>();
        toSort.add(1);
        toSort.add(5);
        toSort.add(3);
        toSort.add(8);
        toSort.add(12);
        toSort.add(4);
        toSort.add(10);

        Sort s1 = new Sort();
        s1.sortArray(toSort);

        System.out.println();

        s1.checkHashValue(1);

        System.out.println();

        System.out.println();

//        HashMap<Integer,String> checkValue = new HashMap<>();
//        checkValue.put(1, "One");
//        checkValue.put(2, "Two");
//        checkValue.put(3, "Three");
//        checkValue.put(4, "Four");
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number from (1-4): ");
//        int i = sc.nextInt();
//        System.out.println("The value of "+i+" is "+checkValue.get(i));


//        String check = "";
//        do{
//
//
//            System.out.print("Enter Again (y/n): ");
//            check = sc.nextLine();
//
//        }while(check.equals("y")||check.equals("Y"));


        ArrayList<Country> countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Nepal", "Asia", 977));
        countryArrayList.add(new Country("India", "Asia", 91));
        countryArrayList.add(new Country("Australia", "Australia", 87));
        countryArrayList.add(new Country("UK", "Europe", 54));
        countryArrayList.add(new Country("Benin", "Africa", 73));

        for (Country c : countryArrayList) {
            System.out.println(c.getName() + "--" + c.getCode());
        }
    }


}
