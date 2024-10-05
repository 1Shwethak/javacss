package demo.Loop;

public class DemoLoop {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("hello world");
        } 
        for (int i = 1; i < 10; i++) {
            for(int j = 1;j <= 3; j++){
            System.out.println(i+" "+j);
            }
        }
        for (int z = 156; z <=160; z++) {
            System.out.println("z=" +z);
            
        }
        for (int i = 5; i > 0; i--) {
            System.out.println("i=" +i);
        }
    }
    

    
}
