class outer{
    int a;
    int b;
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    class inner{
    int c;
    int d;
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getD() {
        return d;
    }
    public void setD(int d) {
        this.d = d;
    }
    public void printMessage(){
        System.out.println("Welcome");
    }
    }
}
public class innerclasses{
    public static void main(String []args){
        outer outer1 = new outer();
        outer.inner in = outer1.new inner();
        in.printMessage();
    }
}