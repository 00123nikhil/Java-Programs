import java.io.Console;
class ReadPasswordTest
{
public static void main(String x[]){
Console c=System.console();
String userName,pass;
System.out.println("enter your Username:");
userName=c.readLine();
System.out.println("Enter Password:");
char[] ch=c.readPassword();
pass=String.valueOf(ch);
System.out.println("Username is:"+userName);
System.out.println("Password is:"+pass);
if(userName.equals("Kamraj") && pass.equals("1234"))
{
System.out.println("Congratulations! Login Success");
}
else
{
System.out.println("Wrong Password");
}
}
}