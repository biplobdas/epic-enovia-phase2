
public class Payment {

	public static void main(String[] args) {
		
		// Create a Person Object
		Person person = new Person();
		person.setFirstName("Victor");
		person.setLastName("Smith");
		person.setHourlyRate(10);
		
		//Print the state of the person object
		System.out.println(person.toString());
		// Get and print the weekly payment
		System.out.println(person.getPayment(40));
		

	}

}
