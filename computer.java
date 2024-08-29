package programmes;
class Computers{
	String brand="HP";
	int speed=6;
	class processor{
		public void displaydetails() {
			System.out.println(brand);
			System.out.println(speed);
		}
	}
}

public class computer {

	public static void main(String[] args) {
		Computers obj=new Computers();
		Computers.processor ob=obj.new processor();
		ob.displaydetails();
		// TODO Auto-generated method stub

	}

}
