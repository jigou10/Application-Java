package Package1;



public class Personne {
	public String name;
	public String surname;
	public int age; 
	
	public Personne(String name, String surname, int age) {
		this.surname=surname;
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public int getAge() {
		return this.age;
	}
	
	void setAge(int age) {
		this.age=age;
	}
	
}	
