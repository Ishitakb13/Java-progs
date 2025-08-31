package main;
import transport.*;
public class Main {
	 public static void main(String[] args) {
	      
	        Ebike e = new Ebike( "EB-101", 60 );
	        e.deliver("Sandwich", "Library");
	        Drone d = new Drone( "DR-1");
	        d.deliver( "Notes", "ExamCell");  
	        d.deliver( "USB", "ISE Block");
	        double bill = d.cost( 5 );
	        System.out.println("Drone delivery cost: Rs." +  bill);
}
}
