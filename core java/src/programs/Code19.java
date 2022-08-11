package programs;

import java.util.Scanner;
public class Code19
{
	int acc_num,days;
	String Title, Author;

	void input()
	{
		Code19 a = new Code19();
		System.out.println("Enter Accession Number:");

		System.out.println("Enter Author Name");

		System.out.println("Enter Book Title");
	}
	void compute()
	{
		Code19 a = new Code19();
		System.out.println("Number of days late:");
		int fine = days*5;
		System.out.println("fine = Rs." + fine);

	}
	void display()
	{
		System.out.println("Accession Number\t Title \t Author\t Fine\t");
		System.out.println("Acc_num\t\t\t Title\t Author\t Fine\t");
	}

	public static void main(String[] args)
	{
		Code19 a = new Code19();
		a.input();
		a.compute();
		a.display();

	}

}