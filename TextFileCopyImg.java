import java.io.*;

class TextFileCopyImg
{
	public static void main(String args[]) throws Exception 
	{
		FileReader fr = new FileReader("C:\\Users\\SBMPC.Student\\Documents\\Vanshita T007 JAVA\\image.jpg");
		FileWriter fw = new FileWriter("C:\\Users\\SBMPC.Student\\Documents\\Vanshita T007 JAVA\\MyPack\\image.jpg");
		int ch;
		while((ch = fr.read()) != -1) 
		{
			fw.write((char)ch);
		}
		fr.close();
		fw.close();
	}
}