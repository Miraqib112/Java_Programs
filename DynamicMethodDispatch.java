package mypackage;
class Vehicle{
    void feature(){
        System.out.println("Vehicles can travel");
    }
}
class Scooter extends Vehicle{
    void feature(){
        System.out.println("Scooter has 2 tyres and maximum speed 100");
    }
}
class Car extends Vehicle{
    void feature(){
        System.out.println("Car has 4 tyres and maximum speed 140-150 ");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Vehicle obj1=new Vehicle();
        obj1.feature();
        Vehicle obj2=new Scooter();
        obj2.feature();
        Vehicle obj3=new Car();
        obj3.feature();

    }
}
