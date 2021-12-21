package AP_ASS03;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;  
//making thread by extending the class Thread rather than using runnable
public class file1 extends Thread{
	//array to store tokenized sentences of file
	private String [] file1txt;	
	//getter to get the private array in other classes

	public String [] GetInput1()
	{
		return file1txt;
	}
	public void run() 
	{
		//used synchorization conceot for relaible distrubution of resouces
		synchronized (this)
		{
			int count = 0;
			//file reading and tokenizing
			file1txt = new String [1000];
			StringTokenizer StrToken;
			//inbuilt file not found exception used 
			 try 
			 {
			      File fobj = new File("file1.txt");
			      Scanner sc = new Scanner(fobj);
			      while (sc.hasNextLine()) 
			      {
			    	  	String Data = sc.nextLine();
			    	  	StrToken = new StringTokenizer(Data);
			    	  	while (StrToken.hasMoreTokens())
			    	  	{
				    	count++;
				        file1txt[count-1] = StrToken.nextToken(" ");
			    	  	}
			      }
			      sc.close();
			 } 
			 catch (FileNotFoundException e)
	         {
			      System.out.println("Error.");
			      e.printStackTrace();
			 }
			 file1txt[count] = "\0";
			//loop to display the words in the file 
				 for(int i=0; i<count; i++)
				{
					System.out.println("WORD " + (i+1) + " : " + file1txt[i]);
				}
		}
		}
}
