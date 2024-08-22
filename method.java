package programmes;

public class method {
	public int sum(int a) {
		System.out.println("Hello this is a method with one parameter");
		return a;
	}
	public int sum(int a,int b) {
		System.out.println("Hello this is a method with two parameters");
		return a+b;
	}
	public float sum(float b,float c) {
		System.out.println("Hello this is a method with parameters of different datatypes");
		return (b+c);
	}

	public static void main(String[] args) {
		method s=new method();
		System.out.println(s.sum(5));
		System.out.println(s.sum(5,10));
		System.out.println(s.sum(2,3));	// TODO Auto-generated method stub

	}

}
