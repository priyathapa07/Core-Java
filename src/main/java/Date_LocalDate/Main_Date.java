package Date_LocalDate;

import java.text.ParseException;

public class Main_Date {

    public static void main(String []args) throws ParseException {
        Sample s1 = new Sample();
//       System.out.println(s1.convertToString(new Date()));
        System.out.println(s1.convertToDate("30-Apr-2020"));
  //      s1.convertToLocalDate("2020-06-25");
        s1.stringToLocalDateTime("Mar-06-2020 13:12");
        s1.LocalDateTimeToString();

    }

}
