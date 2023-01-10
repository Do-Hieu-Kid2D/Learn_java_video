
public class Animal {
	private String Name;

	public Animal(String name) {
		super();
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public void Eat() {
		System.out.println("toi dang an");
	}
	
	public void makeSound() {
		System.out.println("... ... ...");
	}
	public void slepp() {
		System.out.println("zzz zzz zzz ");
	}
}
