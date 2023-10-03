//wap to copy a text file from one loaction to another using character strings

import java.io.*;

class TextFileCopy 
{
	public static void main(String args[]) throws Exception 
	{
		FileReader fr = new FileReader("C:\\Users\\SBMPC.Student\\Documents\\Vanshita T007 JAVA\\file3.txt");
		FileWriter fw = new FileWriter("C:\\Users\\SBMPC.Student\\Documents\\Vanshita T007 JAVA\\MyPack\\file3copy.txt");
		int ch;
		while((ch = fr.read()) != -1) 
		{
			fw.write((char)ch);
		}
		fr.close();
		fw.close();
	}
}