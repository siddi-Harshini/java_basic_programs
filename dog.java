package programmes;

public class dog {
	String name,colour;
	public dog(String a,String b) {
		name=a;
		colour=b;
	}

	public static void main(String[] args) {
		dog obj=new dog("bunny","brown");
		System.out.println("dog name is :"+obj.name);
		System.out.println("dog colour is :"+obj.colour);
		// TODO Auto-generated method stub

	}

}
