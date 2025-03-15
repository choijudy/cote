import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        String strToday = sdf.format(c.getTime());

        System.out.println(strToday);
    }
}