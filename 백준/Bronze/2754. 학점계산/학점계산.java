import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rank = br.readLine();
        double grade;

        switch(rank){
            case "A+" : grade = 4.3;
                System.out.println(grade);
                break;
            case "A0" : grade = 4.0;
                System.out.println(grade);
                break;
            case "A-" : grade = 3.7;
                System.out.println(grade);
                break;
            case "B+" : grade = 3.3;
                System.out.println(grade);
                break;
            case "B0" : grade = 3.0;
                System.out.println(grade);
                break;
            case "B-" : grade = 2.7;
                System.out.println(grade);
                break;
            case "C+" : grade = 2.3;
                System.out.println(grade);
                break;
            case "C0" : grade = 2.0;
                System.out.println(grade);
                break;
            case "C-" : grade = 1.7;
                System.out.println(grade);
                break;
            case "D+" : grade = 1.3;
                System.out.println(grade);
                break;
            case "D0" : grade = 1.0;
                System.out.println(grade);
                break;
            case "D-" : grade = 0.7;
                System.out.println(grade);
                break;
            case "F" : grade = 0.0;
                System.out.println(grade);
                break;
        }
    }
}
