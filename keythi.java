package programmes;

public class keythi {
	void display() {
		this.show();
		int age=18;
		System.out.println("inside display function "+"age:"+age);
	}
	void show() {
		String s="harshini";
		System.out.println("inside show  name:"+s);
	}

	public static void main(String[] args) {
		keythi s=new keythi();
		s.display();
		// TODO Auto-generated method stub

	}

}
