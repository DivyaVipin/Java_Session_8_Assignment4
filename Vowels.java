import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author DivyaVipin
 *
 */
public class Vowels  {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		java.io.File file = new java.io.File("C:\\TextFile\\file1.txt");
		Scanner sc=new Scanner(file);
		
	
		String fileContent = "";
		while(sc.hasNext())
		{
			fileContent+=sc.next()+" ";
		}
		sc.close();
		char[] strArray=fileContent.toCharArray();
		int counter=0;
		for(char c:strArray)
		{
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')
				counter++;
		}
		System.out.println("No of vowels:"+counter);
		
		
		
		

	}

}
