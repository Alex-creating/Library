package library;

public class App {

	public static void main(String[] args) {

		Person p = new Person(1, "James");
		Person j = new Person(2, "Jake");
		
		Library.registerPerson(p);
		Library.registerPerson(j);
		Library.printPerson();
		Library.removePerson(p);
		Library.printPerson();
		

	}

}
