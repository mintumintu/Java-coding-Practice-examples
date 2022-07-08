class toStringOverrideTest{
    @Override
    public String toString() {
        System.out.println("To String");
        return super.toString();
    }
}
public class toStringoverride {
    public static void main(String []args){
        toStringOverrideTest test = new toStringOverrideTest();
        System.out.println(test.toString());
    }
}