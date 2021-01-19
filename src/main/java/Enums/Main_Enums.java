package Enums;

public class Main_Enums {

    public static void main(String []args){
        WorkingDay workingDay = new WorkingDay("Axl Rose","January", 10,Week.FIRST );
        System.out.println("The employee " + workingDay.getEmployeeName().toUpperCase() + " can work " + " from "
                + workingDay.getMonth().toUpperCase() + " at " + workingDay.getTime());
    }
}
