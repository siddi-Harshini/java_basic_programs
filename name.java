package programmes;
class person{
	int a=5,b=6,c;
	public void getFirstName(){
		System.out.println("firstname in parent");
	}
    public void getLastName(){
    	System.out.println("lastname in parent");
	}
	
}
class Employee extends person{
	public void getEmployeeId(){
		System.out.println("id in child");
		
	}
	public void getLastName() {
		c=a+b;
		System.out.println(c);
		System.out.println("software engineer");
	}
	
}

public class name {

	public static void main(String[] args) {
		Employee s=new Employee();
		s.getLastName();
		// TODO Auto-generated method stub

	}

}
