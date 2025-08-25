package employee;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1=new Employee("Ishita",1,10000);
       Employee e2=new Employee("Ishani",2,20000);
       
       System.out.println("Initial Employee Details:");
       e1.displayDetails();
       e1.increaseSalary(10);
       e2.displayDetails();
       e2.increaseSalary(5);
       System.out.println("Updated Employee Details:");
       e1.displayDetails();
       e2.displayDetails();
	}

}
