package programs;

public class ParameterizedConstructor
{
	ParameterizedConstructor()
{
	System.out.println("this is a parametrized constructor");
}
	ParameterizedConstructor(int a,int b)
{
	System.out.println("constructor with two parameterised");
}
	ParameterizedConstructor(int c,int d,int e)
{
	System.out.println("constructor with three parameters");
}
	ParameterizedConstructor(int i,String name)
{
	System.out.println("constructor with int and string parameter");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor ob1=new ParameterizedConstructor();
		ParameterizedConstructor ob2=new ParameterizedConstructor(1,2);
		ParameterizedConstructor ob3=new ParameterizedConstructor(1,2,3);
		ParameterizedConstructor ob4=new ParameterizedConstructor(5,"Jayesh");
		

	}

}
