class hello{
   void print(){
        System.out.println("hello");
    }
}
class hi extends hello{
        void print(){
            System.out.println("hi");
            super.print();
        }
}
public class inheritence {
    public static void main(String []args){
        hi a = new hi();
        a.print();
    }
}