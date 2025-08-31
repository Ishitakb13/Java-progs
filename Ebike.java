package transport;

public class Ebike extends Bicycle {
	private int battery;
	public Ebike(String id,int battery) {
		super(id);
		this.battery = battery;
		System.out.println("EBike() constructor called");
	}
	public void deliver (String item, String place) {
        System.out.println("Checking battery: " + battery + "%");
        super.deliver(item,place);
    }

}