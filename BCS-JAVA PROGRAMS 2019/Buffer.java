import java.io.*;
class Buffer
{
	public static void main(String args[])throws Exception
	{
		FileReader fr = new FileReader("D:\\JAVA\\filename.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1){
		System.out.println((char)i);
		}
		br.close();
		fr.close();
	}
}
