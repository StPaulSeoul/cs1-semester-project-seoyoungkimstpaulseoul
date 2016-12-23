package studentrecord;

public class student extends person {
	char grade;
	teacher teacher;
	
	public student(String name, int age, char grade){
		super(name, age);
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	
	}
	public int getAge() {
		return age;
	}
	public char getGrade() {
		return grade;
	}

	void isGood()
	{
		if (grade == 'A') {
			System.out.println(this.name + " is a good student.");
		}
		else
			System.out.println(this.name + " is not a great student.");
	}
	
	public void print()
	{
		System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s","student",this.name,this.age,this.grade,"-"));
	}
}
