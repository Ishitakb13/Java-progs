package stackperson;

public class Person {
	   String name;
	   int age;
	   Gender gen;
	   
 Person(String name, int age, Gender gen) {
		   this.name=name;
		   this.age=age;
		   this.gen=gen;
 }
 void displayPerson() {
	 System.out.println("Name: " + name);
	 System.out.println("Age: " + age);
	 System.out.println("Gender: " + gen);
	 }
}
