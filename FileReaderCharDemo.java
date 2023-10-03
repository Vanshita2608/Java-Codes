import java.io.*;

class FileReaderCharDemo 
{
	public static void main(String args[]) throws Exception 
	{
		FileReader fr = new FileReader("file2.txt");
		int ch;
		while((ch = fr.read()) != -1) 
		{
			System.out.print((char)ch);
		}
		fr.close();
	}
}

