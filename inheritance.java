package programmes;
class inhe {
			int salary=50000;
}
		class engineer extends inhe{
			int salary=60000;
		}
public class inheritance{
	public static void main(String[] args) {
		//inheritance e=new inheritance();
		inhe e2=new inhe();
		engineer e1=new engineer();
		///System.out.println("salary"+e.salary);
		System.out.println("salary"+e2.salary);
		System.out.println("salary"+e1.salary);
	}
}		
