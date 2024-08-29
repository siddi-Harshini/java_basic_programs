package programmes;
class Animal{
	public void move() {
		System.out.println("this is move method in parent");
	}
}
class Cheetah extends Animal{
	public void move() {
		System.out.println("This is move method in child");
	}
}
public class ani {

	public static void main(String[] args) {
		Cheetah obj=new Cheetah();
		obj.move();
		// TODO Auto-generated method stub
	}

}
