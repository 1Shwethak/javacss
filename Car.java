public class Car {
    String brand;
    int year;
    }

    public car(){
        this.brand=brand;
        this.year=year;

    }
    public void DisplayCarInfo(){
        System.out.println("car brand:" +brand);
        System.out.println("Manufacture:" +year);

    }
    public static void main(String[] args) {
        Car myCar=new Car("BMW",1995);
        myCar.DisplayCarInfo();
    }

    
}
