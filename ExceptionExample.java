public class ExceptionExample {
    public static void main(String[] args) {
        try {
            //risk code that may handle cause an exceptions
            int a=10/0; //this will throw arithmeticException
        System.out.println("result:"+a);

        }catch(ArithmeticException e){
            //handle the exception
            System.out.println("error Division by zero");

        }finally{
            //code that always executes
            System.out.println("this is finally block");
        }
        System.out.println("rest of the code...!");
    }
    
}
