package studentrecord;

public class teacher extends person {
	String subject;
	student student;

	public teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	public void print(){
		System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s","teacher",this.name,this.age,"-",this.subject));
	}

	public void advisory(student a) {
		if (a.name.equals(student.getName())) {
			System.out.println(a.name + " is in my advisory.");
		} else {
			System.out.println(a.name + " is not in my advisory.");
		}
	}

	public static void main(String[] args) {
		student myStudent = new student("Dave", 17, 'A');
		student myStudent2 = new student("Cole", 17, 'B');
		teacher myTeacher = new teacher("Mr. Franco", 40, "English");
		teacher myTeacher2 = new teacher("Ms. Sprouse", 34, "Math");

		myStudent.teacher = myTeacher;
		myStudent2.teacher = myTeacher2;
		myStudent.isGood();
		myStudent2.isGood();

		myTeacher.advisory(myStudent);
		myTeacher.advisory(myStudent2);

		myStudent.getName();

	}
} 
