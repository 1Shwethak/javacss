class Bird{
    void fly(){
        System.out.println("bird can fly");
    }
}
    class Parrot extends Bird{
        void color(){
            System.out.println("i am green");
        }
    }
    class singleParrot extends Parrot {
        void sing(){
            System.out.println("i can sing");
        }
    }
    class cow extends Bird {
        void whatcoloriam(){
            System.out.println("i am black");
        
        }
    }
public class main {
    public static void main(String[] args){
        Parrot p=new Parrot();
        cow s=new cow();

        //object method for Parrot class
        s.whatcoloriam();
        p.fly();

        p.color();
        s.fly();
            
            
        
    }
}
    
    

        
    



    

