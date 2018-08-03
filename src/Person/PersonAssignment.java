package Person;

public class PersonAssignment {

	public static void main(String[] args) {
		Person person1 = new Person("Ram", 5, 6, 1980);//Instatiating Person Class 
		Person person2 = new Person("Shayam", 2, 3, 1987);//Instatiating Person Class
		person1.display(); //Invoking Display method 
		person2.display(); //Invoking Display method 
		person1.olderOne(person1, person2); //Invoking olderOne method 
	}

}
