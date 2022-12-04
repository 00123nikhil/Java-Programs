import java.io.*;
import java.util.*;
class CombineTest{
public static void main(String x[]){
try
{
File f1=new File("D:\\JAVA\\filename.txt");
BufferedReader br1=new BufferedReader(new FileReader(f1));
File f2=new File("D:\\JAVA\\test.txt");
BufferedReader br2=new BufferedReader(new FileReader(f2));
String str;
String str1;
while((str=br1.readLine())!=null)
{
System.out.println(str);
br1.close();
while((str1=br2.readLine())!=null)
{
System.out.println(str1);
br2.close();
}
}
}
catch(IOException e)
{
e.printStackTrace();
}
}
}