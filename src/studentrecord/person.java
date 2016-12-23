package studentrecord;

public class person {
	String name;
	int age;

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print()
	{
		System.out.println(this.name+this.age);
	}
}