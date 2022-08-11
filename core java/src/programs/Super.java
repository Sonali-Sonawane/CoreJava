package programs;

class Person{
	int id;
	String name;
	
	Person(int id,String name) //constructor
	{
		this.id = id;
		this.name = name;
	}
}

class Employee extends Person{
	float salary;
	Employee(int id,String name,float salary)
	{
		super(id,name);
		this.salary = salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}
public class Super{
	public static void main(String[]args)
	{
		Employee obj = new Employee(1,"Sonali_Sonawane",2000.50f);
		obj.display();
	}
}
