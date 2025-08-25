package showroom;

public class Showroom {

	public static void main(String[] args) {
		Carshowroom c1 = new Carshowroom ("Toyota", "Corolla", 15000, 18.5);
        Carshowroom  c2 = new Carshowroom ("Honda", "Civic", 20000, 16.0);
        Carshowroom  c3 = new Carshowroom ("Hyundai", "i20", 12000, 20.0);
        
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
        
        c1.setOwnerName("Ishita");
        c1.updatePrice(18000);
        
        System.out.println("After Updates:");
        c1.displayDetails();

        Carshowroom .showShowroomName();
        Carshowroom .showTotalCars();

	}

}
