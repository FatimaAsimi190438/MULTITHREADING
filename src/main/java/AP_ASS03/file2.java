package AP_ASS03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

//making thread by extending the class Thread rather than using runnable
public class file2 extends Thread{
	//array to store tokenized sentences of file
	private String [] file2;
	//getter to get the private array in other classes
	public String [] Getfile2()
	{
		return file2;
	}
	public void run() {
		//used synchorization conceot for relaible distrubution of resouces 
		synchronized (this)
		{
			int count = 0;
			file2 = new String [1000000];
			StringTokenizer tokenString;
			//inbuilt file not found exception used 
			 try 
			 {
				 //file reading and tokenizing
			      File fobj = new File("file2.txt");
			      Scanner sc = new Scanner(fobj);
			      while (sc.hasNextLine()) 
			      {
			    	  	String Data = sc.nextLine();
			    	  	tokenString = new StringTokenizer(Data);
			    	  	while (tokenString.hasMoreTokens())
			    	  	{
				    	count++;
				        file2[count-1] = tokenString.nextToken(" ");
			    	  	}
			      }
			      sc.close();
			 } catch (FileNotFoundException e)
	         {
			      System.out.println("ERROR.");
			      e.printStackTrace();
			 }
			 file2[count] = "\0";
			 //loop to display the words in the file 
			 			 for(int i=0; i<count; i++)
			 {
					System.out.println("Word" + (i+1) + " : " + file2[i]);
			 }
		}
	}
}
