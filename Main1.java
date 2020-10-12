//DAY 3 - ASSIGNMENT_1
import java.util.Scanner;
class Main1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
		int math, scien, soc, hin, eng;
		
		System.out.println("<--Enter Student Details-->");
		System.out.print("\nEnter Student Name : ");
		String name = s.next();
		System.out.print("Enter Maths marks out of 100 marks: ");
		math = s.nextInt();
		System.out.print("Enter Science marks out of 100 marks : ");
		scien  = s.nextInt();
		System.out.print("Enter Social marks out of 100 marks : ");
		soc = s. nextInt();
		System.out.print("Enter Hindi marks out of 100 marks : ");
		hin = s.nextInt();
		System.out.print("Enter English marks out of 100 marks : ");
		eng = s.nextInt();
		
		int total = math + scien + soc + hin + eng;
		int per = (total*100)/500;
		
		System.out.println("\n<--Student marks details-->");
		System.out.println("\nStudent Name  : "+name);
		System.out.println("Total marks : "+total);
		System.out.println("Percentage  : "+per+"%");
		
		if(per>=90) {
			System.out.println("Hey, You got 'A' grade");
		} else if(per>=75) {
			System.out.println("You got 'B' grade");
		} else if(per>=45) {
			System.out.println("You got 'C' grade");
		} else if(per>=25) {
			System.out.println("You got 'D' grade");
		} else {
			System.out.println("You failed plz Study well");
		}
    }
}