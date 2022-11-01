package secondprogram;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter number of students:");
		int n1=sc.nextInt();
		
		System.out.println("Please enter name:");
		String n2=sc.next();
		
		System.out.println("Please mail:");
		String n3=sc.next();
		
		System.out.println("Please enter name:");
		String n4=sc.next();
		
		System.out.println("Please enter number of students:");
		String n5=sc.next();
		
		System.out.println("Please enter number of students:");
		String n6=sc.next();
		
		System.out.println("Please enter which student detail you looking for:");
		int id=sc.nextInt();
		
		if (id == 1) {
			System.out.println("Hitsh");
			System.out.println("hites@gmail.com");
		}
		else {
			System.out.println("not match,enter vail number");
		}

	}

}
