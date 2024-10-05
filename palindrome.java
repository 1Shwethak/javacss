import java.util.*; 

 public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int rev=0;
        int n=sc.nextInt();

        while(n!=0){
            rev=rev*10;
            rev=rev+n%10;
            n=n/10;
        }
        if(n==rev)
            {
                System.out.println("it is a palindrome"+rev);
            
            }
            else{
                System.out.println("not a palindrome");
            }
            

        }
    }
