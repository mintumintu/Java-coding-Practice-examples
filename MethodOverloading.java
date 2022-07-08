class arithmetic{
	int sum(int a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
	int sum(int a,int b,int c, int d) {
		return a+b+c+d;
	}
}
public class MethodOverloading {
	public static void main(String []args) {
		arithmetic a = new arithmetic();
		System.out.println(a.sum(5,10));
		System.out.println(a.sum(5, 10,20));
		System.out.println(a.sum(5, 10,20,25));
	}
}
