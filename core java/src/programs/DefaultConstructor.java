package programs;

class student
{
 String name;
 String adress;
 int sales_amount;
 int phone;	

student()
   {
	name="Sonali";
	adress="Sonawane";
	sales_amount=1000;
	phone=837828282;
	System.out.println("student object is created");
   }
}

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj=new student();

	}

}