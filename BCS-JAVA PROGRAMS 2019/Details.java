import java.util.Scanner;
class Details
{
public static void main(String x[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Name:");
	String name = sc.nextLine();
	System.out.println("Gender:");
	char gender = sc.next().charAt(0);
	System.out.println("Age:");
	int age = sc.nextInt();
	System.out.println("Mobile Number:");
	long mobileNo = sc.nextLong();
	System.out.println("CGPA:");
	double cgpa = sc.nextDouble();
	System.out.println("Name:"+name);
	System.out.println("Gender:"+gender);
	System.out.println("Age:"+age);
	System.out.println("Mobile Number:"+mobileNo);
	System.out.println("CGPA:"+cgpa);

}
}