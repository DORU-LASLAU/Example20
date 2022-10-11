import java.util.Scanner;
public class Example20 {
    public static void main(String[] argv) {
        int year;
        boolean leap=false;
        Scanner inputValue=new Scanner(System.in);
        System.out.println("Enter a year:");
        year= inputValue.nextInt();
        if (year %4==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        }else {
                leap = false;
            }

        if (leap)
            System.out.println(year+" is a leap year.");
        else
            System.out.println(year+" is not a leap year.");
    }
}

