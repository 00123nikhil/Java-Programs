import java.util.StringTokenizer;
public class StringToken 
{
 public static void main(String[] args) {
 	StringTokenizer st=new StringTokenizer("my name is nikhil");
 	while(st.hasMoreTokens())
 	{
	System.out.println(st.nextToken());

	}
 	}
}