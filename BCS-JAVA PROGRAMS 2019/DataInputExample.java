import java.io.*;
public class DataInputExample{
public static void main(String args[])throws IOException
{
	FileInputStream input=new FileInputStream("D:\\test.txt");
	//DataInputStream inst = new DataInputStream(input);
	int count=input.available();
	byte[] ary=new byte[count];
	input.read(ary);
	for(byte bt:ary)
	{
	char k=(char) bt;
	System.out.println(k+"--");
	} 
}
}