
public class Dog extends Animal {
	public Dog() {
		super("Dog");
	}

	@Override   //override daay! 
	public void Eat() {
		super.Eat();
		//System.out.println("Cho an xuong");
	}

	@Override
	public void makeSound() {
		//super.makeSound();
		System.out.println("Cho sua gau gau");
	}
	
	
	
}
