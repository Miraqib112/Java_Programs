// Program using Interface and Abstract Class

package mypackage;


interface A{
    void show();
}
abstract class B{
    abstract void display();
}
public class Demo extends B implements A{
    @Override
    public void show(){
        System.out.println("Demo class implements interface A");
    }
    @Override
    public void display(){
        System.out.println("Demo Class inherits class B");
    }
    public static void main(String[] args) {
        A obj1=new Demo();
        obj1.show();
        B obj2=new Demo();
        obj2.display();
    }
}
