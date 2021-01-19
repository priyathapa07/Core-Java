package Inheritance;


public class MainInheritance {

        public static void main(String[]args){
            Dell d1 = new Dell();
            d1.hasCPU();
            System.out.println();

//            User u1 = new User();
//            u1.setFullName("priya");
//            u1.setAddress("NY");
//            u1.setEmailAddress("PT@gmail.com");
//            u1.setGender("F");
//            u1.setPhoneNumber(4345);

//            System.out.println(u1.getFullName());
//            System.out.println(u1.getAddress());
//            System.out.println(u1.getEmailAddress());

            //inherits attributes from parent Users
            SoftwareEnginner se = new SoftwareEnginner("Priya", "F","PT@gmail.com" , 1234, "NY", "Associate", "Developer", "Adon", "adon.com", "TX");
            System.out.println(se.getFullName());
            System.out.println(se.getAddress());
            System.out.println(se.getGender());
            System.out.println(se.getEmailAddress());
            System.out.println(se.getPhoneNumber());

            //Individual additional attributes
            System.out.println(se.getDepartment());
            System.out.println(se.getRole());




        }
    }


