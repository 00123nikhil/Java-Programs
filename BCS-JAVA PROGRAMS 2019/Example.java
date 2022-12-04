import java.io.*;
class Example
{
public static void main(String[] args)throws IOException
{
 	DataInputStream dis=new DataInputStream(new FileInputStream("D:\\test.txt"));
	String name=null;
	do{
	   name=dis.read();
	   System.out.println(name);
	  }while(!name.equals(null));
	dis.close();
}
}