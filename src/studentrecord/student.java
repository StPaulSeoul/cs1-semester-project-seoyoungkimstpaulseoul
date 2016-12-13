package studentrecord;

public class student {
	String name = "name";
	int age = 0;
	char grade = 'A';
	
	public student(String name, int age, char grade){
		this.name = name;
		this.age = age;
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

}
