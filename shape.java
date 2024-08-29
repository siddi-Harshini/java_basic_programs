package programmes;

//import java.util.scanner;

class Shapes{
	int length=10;
	int breadth=20;
	int area;
	
	public void getArea() {
		//area=length*breadth;
		System.out.println(area);
	}
}
class rectangle extends Shapes{
	public void getArea() {
		area=length*breadth;
		System.out.println(area);
	}
}
public class shape {
	public static void main(String[] args) {
		//Shapes s=new Shapes();
		//s.getArea();
		rectangle ob=new rectangle();
		ob.getArea();
	}
}

