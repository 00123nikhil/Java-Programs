import java.io.*;
import java.util.*;
public class DataInputStream{
public static void main(String args[])throws IOException
{
	InputStream input=new FileInputStream("D:\\test.txt");
	DataInputStream inst = new DataInputStream(input);
	int count=input.available();
	byte[] ary=new byte[count];
	inst.read(ary);
	for(byte bt:ary)
	{
	char k=(char) bt;
	System.out.println(k+"--");
	} 
}
}