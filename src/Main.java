import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter A Year");
        int year = myScanner.nextInt();

    if (year % 4 ==0){
    System.out.println(year+ "is a leap year.");}
    else {
    System.out.println(year + "is not a leap year.");
    }
}
    }
