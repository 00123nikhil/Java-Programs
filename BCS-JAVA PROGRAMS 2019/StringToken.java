import java.util.*;
public class NewClass 
{
 public static void main(String args[]) {
 	System.out.println("Using Constructor -1");
 	StringTokenizer st1=new StringTokenizer("Happy to learn Java!"," ");
 	while(st1.hasMoreTokens())
 	{
	System.out.println(st.nextToken());
	}
	System.out.println("Using constructor -2");
	StringTokenizer st2=new StringTokenizer("Java : Code : String"," :");
	while(st2.hasMoreTokens())
	{
		System.out.println(st2.nextToken());
	}
	System.out.println("Using Constructor -3");
	StringTokenizer  st3=new StringTokenizer("Java : Code : String"," :",true);
	while(st3.hasMoreTokens())
	{
		System.out.println(st3.nextToken());
	}
 	}
}