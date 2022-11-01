package secondprogram;

public class trainer {
	String name;
	String department;
	String email;
	String myname;
	int id;
	
	trainer(String name1,String dep1,String email1,int id1){
		name=name1;
		department=dep1;
		email=email1;
		id=id1;
		
	}
	
	public void getname() {
		System.out.println("name:"+name);
		System.out.println("department:"+department);
		System.out.println("email:"+email);
		System.out.println("id:"+id);
		System.out.println("      ");
	}
	

	

}

