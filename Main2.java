//DAY 3 - ASSIGNMENT_2
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
		System.out.println("<--Enter Employeers Details-->");
		System.out.print("Enter Employeer name : ");
		String name = s.next();
		System.out.print("Enter Birth Date : ");
		int d = s.nextInt();
		System.out.print("Enter Birth Month : ");
		int m = s.nextInt();
		System.out.print("Enter Birth Year : ");
		int y = s.nextInt();
		System.out.print("Enter Monthly Salary : ");
		int sal = s.nextInt();
		
		int asal = sal*12, l = 100000, age = 2020 - y, tax;
		
		System.out.println("\n<--Employeer Details-->");
        System.out.println("\nEmployeer Name : "+name);
        System.out.println("Employeer Age : "+age);
        System.out.println("Employeer Date of birth : "+d+"-"+m+"-"+y);
		System.out.println("Annual Salary : "+asal);
		
		if(asal > 5*l) {
			tax = asal*20/100;
			System.out.println("You have to pay tax  : "+tax);
		} else if(asal > 4*l) {
			tax = asal*15/100;
			System.out.println("You have to pay tax  : "+tax);
		} else if(asal > 3*l) {
			tax = asal*10/100;
			System.out.println("You have to pay tax  : "+tax);
		} else if(asal > 2*l) {
			tax = asal*5/100;
			System.out.println("You have to pay tax  : "+tax);
		}
	}

    }
    

