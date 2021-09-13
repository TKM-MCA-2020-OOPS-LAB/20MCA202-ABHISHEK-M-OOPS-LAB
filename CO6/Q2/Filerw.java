package co5;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
public class Filerw {

	public static void main(String[] args)
	{
		try 
		{
			File file = new File("C:\\Users\\User\\Desktop\\MY FILES/nwfile.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("Hello!");
		
			fw.close();
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			System.out.println("content: "); 
            String line;
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
			fr.close();	
		}
		catch (IOException e)
		{
			System.out.println(" Try again");
		}
	}
}