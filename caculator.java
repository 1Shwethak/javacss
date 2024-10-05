import java.util.Scanner;

public class caculator {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter your choice:");
            int choice=scanner.nextInt();
            System.out.println("enter a value num1:");
            double num1=scanner.nextDouble();
            System.out.println("enter a value num2:");
            double num2=scanner.nextDouble();
            scanner.close();
            

    switch(choice){
        case 1:
        System.out.println(num1+"+"+num2+"="+(num1+num2));
        break;
        case 2:
        System.out.println(num1+"*"+num2+"="+(num1*num2));
        break;
        case 3:
        System.out.println(num1+"%"+num2+"="+(num1%num2));
        break;
        case 4:
        System.out.println(num1+"/"+num2+"="+(num1/num2));
        break;

    }
}}

        
