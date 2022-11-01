package secondprogram;

public class children extends trainer {

	children(String name1, String dep1, String email1, int id1) {
		super(name1, dep1, email1, id1);
		
			
		}
	public static void main (String []args) {
		
		children child1=new children("Mukesh", "DevOps", "mukesh@gmail.com", 1);
		children child2=new children("hitsh", "Dev", "hitesh@gmail.com", 2);
		children child3=new children("Mukesh", "DevOps", "mukesh@gmail.com", 3);
		
		child1.getname();
		child2.getname();
		child3.getname();
		
		
		
		
	}
	

}
