package library;

import java.util.ArrayList;
import java.util.List;

public class Person {

	int personID;
	String personName;
	

	public Person(int id, String name) {
		personID = id;
		personName = name;
		
	}
	
	@Override
	public String toString() {
		return "ID = " + personID + ", Name: " + personName;
	}



}
