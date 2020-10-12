//Day 2 - Assignment
class Main {
  public static void main(String[] args) {
    Employee e1 = new Employee(); 
    Employee e2 = new Employee();
    System.out.println("<--Employees Details-->\n");
    e1.name = "Sucharita"; e1.age = 20; e1.city = "Nandyal"; e1.display();
    e2.name = "Rakul Preet Singh"; e2.age = 30; e2.city="Hyderabad"; e2.display();
  }
}

class Employee{
  int age;
  String name, city;
  void display(){
    System.out.println("Employee Name : "+name);
    System.out.println("Employee Age : "+age);
    System.out.println("Employee City : "+city+"\n");
  }
}