package programs;

class sonali
{
	int a =1234567890;
	double d = 8.7;					//these all are instance variable. 
	float f = 8.7f;
	long l = 88775544;
	static byte b = 25;
	char c = 'j'; 					//character always in single coat 
	boolean k = true;
	static int s = 11;				//these is a static variable.
}
public class Variables {

	public static void main(String[] args) {
		boolean z = false;			//local variable.

		sonali p = new sonali ();
		System.out.println(p.l);
		System.out.println(sonali.s);
		System.out.println(sonali.b);
		System.out.println(z);

	}

}
