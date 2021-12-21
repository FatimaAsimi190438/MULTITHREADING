 package AP_ASS03;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class vocab extends Thread{

	public void run() {
		
		synchronized (this)
		{

			String [] vText = new String [1000000];
			int count = 0;
			try 
			 {
			      File fobj = new File("vocab.txt");
			      Scanner sc = new Scanner(fobj);
			      while (sc.hasNextLine()) 
			      {
			    	count++;
			        String data = sc.nextLine();
			        vText[count-1] = data;
			      }
			      sc.close();
			 } catch (FileNotFoundException e)
	         {
			      System.out.println("Error.");
			      e.printStackTrace();
			 }
			 vText[count] = "\0"; 
			 binary_search_tree BST = new binary_search_tree();
			 for (int i=0; vText[i] != "\0" ; i++)
			 {
				 BST.addWord(vText[i]);
			 }
			 
			 BST.preOrder_transversal();
		}
		}
	
} 