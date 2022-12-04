import java.io.*;
class ReadTest
{
	public static void main(String[] args)throws Exception
	 {
		FileReader fr=new FileReader("d:\\test.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
{
	System.out.println(str);
}
	fr.close();
	
}
}