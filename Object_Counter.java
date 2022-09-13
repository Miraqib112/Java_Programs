class Object_Counter{
    static int count=0;
    public Object_Counter(){
        count++;
    }
    public static void main(String[] args) {
        Object_Counter obj1=new Object_Counter();
        Object_Counter obj2=new Object_Counter();
        Object_Counter obj3=new Object_Counter();
        Object_Counter obj4=new Object_Counter();
        Object_Counter obj5=new Object_Counter();
        System.out.println("number of instances = "+ count);
    }
}