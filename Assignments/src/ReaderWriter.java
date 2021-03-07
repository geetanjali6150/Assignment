import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter{

	public static void main(String[] args) throws IOException
	{
		String str=" ";
		try {
		FileReader fr=new FileReader("D:\\Java programs\\File.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			str=str+((char)i)+" ";
			System.out.print((char)i);
		}
		fr.close();
//Write file using FileWriter
		
			
		FileWriter fw=new FileWriter("D:\\Java programs\\File1.txt",true);
		fw.write(str);
		System.out.print(str);
		fw.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}