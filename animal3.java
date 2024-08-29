package programmes;
class Animals{
	public void eat() {
		System.out.println("animal is eating");
	}
	public void sound() {
		System.out.println("sound of an animal");
	}	
}
class Lion extends Animals{
	public void eat() {
		System.out.println("lion is eating");
	}
	public void sound() {
		//System.out.println(c);
		System.out.println("hhyj");
	}
}
class Tiger extends Animals{
	public void eat() {
		System.out.println("tiger is eating");
	}
	public void sound() {
		System.out.println("brubru");
	}
}
class Panther extends Animals{
	public void eat() {
		System.out.println("panther is eating");
	}
	public void sound() {
		System.out.println("kkdkh");
	}
}

public class animal3 {

	public static void main(String[] args) {
		Lion s=new Lion();
		s.eat();
		s.sound();
		Tiger s2=new Tiger();
		s2.eat();
		s2.sound();
		Panther s3=new Panther();
		s3.eat();
		s3.sound();
		// TODO Auto-generated method stub

	}

}
