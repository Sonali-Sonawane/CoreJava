package programs;

interface square{
	
	int cal(int a,int b);
}
public class Lambda{
	public static void main(String[] args)
	{
		square c = (int a, int b) -> a*b;
		int res = c.cal(2, 4);
		System.out.println(res);
	}
}