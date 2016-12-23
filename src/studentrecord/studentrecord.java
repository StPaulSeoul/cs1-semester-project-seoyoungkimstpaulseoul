package studentrecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentrecord {

	private static final List<person> record = new ArrayList<person>();

	public static void main(String[] args) {
		
		teacher myTeacher = new teacher("Mr. Franco", 40, "English");
		record.add(myTeacher);
		
		
	System.out.println("Welcome to the student record system!");
	
	System.out.println("You are now ready to search.");
	System.out.println("1.insert 2.print 3.search 4.exit");
	
	
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	
	while(i!=4)
	{
	if(i==1)
	{
		insert();
	}
	
	if(i==2)
	{
		print(record);
	}
	
	if(i==3)
	{
		search(record);
	}
	System.out.println("You are now ready to search.");
	System.out.println("What are you lookng for?");
	System.out.println("1.insert 2.print 3.search 4.exit");
	sc = new Scanner(System.in);
	i = sc.nextInt();
	}
	
	
	System.out.println();
	}


public static void insert()
{
	System.out.println("1. student 2. teacher");
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	if(i==1)
	{
		insertStduent();
	}
	if(i==2)
	{
		insertTeacher();
	}
}

public static void insertStduent()
{
	System.out.println("enter name :");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	System.out.println("enter age :");
	int age = sc.nextInt();
	System.out.println("enter grade :");
	char grade = sc.next().charAt(0);
	
	student temp = new student(name,age,grade);
	
	record.add(temp);
}
public static void insertTeacher()
{
	System.out.println("enter name : ");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	System.out.println("enter age :");
	int age = sc.nextInt();
	System.out.println("enter subject :");
	String subject = sc.next();
	
	teacher temp = new teacher(name,age,subject);
	
	record.add(temp);
	
}

public static void print(List<person> record)
{
	System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s","Type","name","age","grade","subject"));
	System.out.println("-------------------------------------------------------------------");
	for(int i = 0; i < record.size(); i++)
	{
		if(record.get(i).getClass().getName().equals("studentrecord.teacher"))
		{
			teacher temp = (teacher)record.get(i);
			temp.print();
		}
		else
		{
			student temp = (student)record.get(i);
			temp.print();
		}
	}
}

public static void search(List<person> record)
{
	System.out.println("Search whom?");
	System.out.println("1. student 2. teacher");
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	System.out.println("Search by what?");

	if(i==1)
	{
		System.out.println("1. name 2. age 3. grade");
		int j = sc.nextInt();
		if(j==1)
		{
			System.out.println("Enter name : ");
			String a = sc.next();
			int found = 0;
			for(int k = 0; k < record.size(); k++)
			{
				if(record.get(k).getClass().getName().equals("studentrecord.student"))
				{
					student temp = (student)record.get(k);
					
					if(a.equals(temp.name))
					{temp.print();
					found++;
					}
				}
			}
			if(found ==0)
			{
				System.out.println("No results are found.");
			}
		}
		if(j==2)
		{
			System.out.println("Enter age : ");

			int a = sc.nextInt();
			int found = 0;
			for(int k = 0; k < record.size(); k++)
			{
				if(record.get(k).getClass().getName().equals("studentrecord.student"))
				{
					student temp = (student)record.get(k);
					
					if(a == temp.age)
					{temp.print();
					found++;
					}
				}
			}
			if(found ==0)
			{
				System.out.println("No results are found.");
			}
		}
		if(j==3)
		{
			System.out.println("Enter grade : ");

			char a = sc.next().charAt(0);
			int found = 0;
			for(int k = 0; k < record.size(); k++)
			{
				if(record.get(k).getClass().getName().equals("studentrecord.student"))
				{
					student temp = (student)record.get(k);
					
					if(a == temp.grade)
					{temp.print();
					found++;
					}
				}
			}
			if(found ==0)
			{
				System.out.println("No results are found.");
			}
		}
	}
	if(i==2)
	{
		System.out.println("1. name 2. age 3. subject");
		int j = sc.nextInt();

		if(j==1)
		{
			System.out.println("Enter name : ");
			String a = sc.next();
			int found = 0;
			for(int k = 0; k < record.size(); k++)
			{
				if(record.get(k).getClass().getName().equals("studentrecord.teacher"))
				{
					teacher temp = (teacher)record.get(k);
					
					if(a.equals(temp.name))
					{temp.print();
					found++;
					}
				}
			}
			if(found ==0)
			{
				System.out.println("No results are found.");
			}
		}
		if(j==2)
		{
			System.out.println("Enter age : ");

			int a = sc.nextInt();
			int found = 0;
			for(int k = 0; k < record.size(); k++)
			{
				if(record.get(k).getClass().getName().equals("studentrecord.teacher"))
				{
					teacher temp = (teacher)record.get(k);
					
					if(a == temp.age)
					{temp.print();
					found++;
					}
				}
			}
			if(found ==0)
			{
				System.out.println("No results are found.");
			}
		}
		if(j==3)
		{
			System.out.println("Enter subject : ");

			String a = sc.next();
			int found = 0;
			for(int k = 0; k < record.size(); k++)
			{
				if(record.get(k).getClass().getName().equals("studentrecord.teacher"))
				{
					teacher temp = (teacher)record.get(k);
					
					if(a.equals(temp.subject))
					{temp.print();
					found++;
					}
				}
			}
			if(found ==0)
			{
				System.out.println("No results are found.");
			}
		}
	}

}

}