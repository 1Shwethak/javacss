public class MultipleCatchBlockExm {
    public static void main(String[] args){
        try {
            int arr[]= new int[5];
            arr[10]=30;     //if we give arr[10]=30/0;then it occurs arithmetic division by zero error; 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException divisible by zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException:array index out of bond");
        }finally{
            System.out.println("Exception:some other Exception Occured");
        }
        System.out.println("Rest of the code");
        }
    }

    

    

