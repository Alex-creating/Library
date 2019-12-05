package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

		static List<Person> people = new ArrayList<>();
	//	static List<Items> itemList = new ArrayList<>();

	
	
	public static boolean registerPerson(Person p) {
		return people.add(p);
		}
	
	public static boolean removePerson(Person p) {
		return people.remove(p);
		}
	
	public static void printPerson() {
		for (Person p : people) {
			System.out.println(p);
		}
	}

	}
