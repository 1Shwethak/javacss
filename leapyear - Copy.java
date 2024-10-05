import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a year:");
        int year=scanner.nextInt();
        scanner.close();

        if(((year%4==0)&&(year%100!=0))||(year%400)==0){
            System.out.println(year+"it is a leap year");

        }
        else{
            System.out.println(year+"it is not a leap year");
        }

    }
    
}



