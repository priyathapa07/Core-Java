package Date_LocalDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Sample {

    //convert 'Date' to String
    public String convertToString(Date d) {
        SimpleDateFormat format = new SimpleDateFormat("MMM-dd-YYYY");
        String str = format.format(d);
        return str;

    }

    //convert 'String Date' to Date
    public Date convertToDate(String dString)  {

        Date date = null;
        DateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
        try {
            date = formatter.parse(dString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;

    }



//    public void convertToLocalDate(String t1) {
//        //   LocalDate date = LocalDate.now();  //for local date
//        //   LocalDateTime time = LocalDateTime.now();
//       LocalDate ld = LocalDate.parse(t1);
//       System.out.println(ld);
////        System.out.println(time);
//    }



   //convert 'StringDate' to LocalDateTime
    public void stringToLocalDateTime(String t2){
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("MMM-dd-yyyy HH:mm");
        LocalDateTime localDate = LocalDateTime.parse(t2, formatter);
        System.out.println(localDate);
    }


    //convert 'LocalDateTime' to String
    public void LocalDateTimeToString() {
        LocalDateTime time = LocalDateTime.now();
        String stringDate = time.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
        System.out.println(stringDate);
    }
}



