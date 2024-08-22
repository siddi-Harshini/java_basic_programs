package programmes;
class inheri{
	public  void display() {
		System.out.println("parent");
	}
}
class engi extends inheri{
	public  void display() {
		System.out.println("child");
	}
}

public class overriding {

	public static void main(String[] args) {
		engi e1=new engi();
		e1.display();
		// TODO Auto-generated method stub

	}

}
