class Animal{
    public void sound(){
        System.out.println("animal make sound");
    }
}
class Dog extends Animal{
    //subclass method override the super clas method
    public void sound(){
        System.out.println("the dog can barks");
    }
}    
class Cat extends Animal{
    public void sound(){
        System.out.println("the cat moves");
    }
}
public class override{
    public static void main(String[] args) {
        Animal myAnimal=new Animal();
        Animal myDog=new Dog();
        Animal myCat = new Cat();

        myAnimal.sound();
        myDog.sound();
        myCat.sound();


    }
}
//here animal is same class 
//and sound is same method
// in overriding their is same class amd same method or same name and same method.
    

