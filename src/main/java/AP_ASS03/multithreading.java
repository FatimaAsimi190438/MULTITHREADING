package AP_ASS03;

import java.util.Scanner;
import java.util.*;
public class multithreading {
	public static void main(String[] args) throws InterruptedException {
		char opt;
		//Scanner sc ;
		Scanner sc= new Scanner(System.in);
		int total_files = 3;
		String [] nfile = new String[3];
		//total files taken as three because said in asssisgnment
		System.out.println("Total Files = " + total_files);
		// assigning indexes to the files
		nfile[0] = "vocab.txt";
		nfile[1] = "file1.txt";
		nfile[2] = "file2.txt";
		//loop to check number of files that are entered by the user 
		//they must be three
		for(int i=0;i<3;i++) 
		{
			System.out.println(nfile[i]);
		}
		//MENU 
		do {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Welcome to Assignment 3");
		System.out.println("Name: Fatima Asim");
		System.out.println("Roll Number: 19i-0438");
		System.out.println("Section: E");
		System.out.println("Submission Date: 23/11/2021");
		System.out.println("Select from the following menu");
		System.out.println("1. Display BST build from Vocabulary File");
		System.out.println("2. View Match words and its frequency");
		System.out.println("3. Display Vectors build from Input files");
		System.out.println("4. Quit");
		System.out.println("---------------------------------------------------------------------");
		opt= sc.next().charAt(0);
		try {
    		if(opt >= '5' ) 
    			throw new inputException("Wrong option selected");
    		}
    		catch(inputException e) {
    			System.err.println(e);
    		}
				if (opt == '1') {
					System.out.println("---------------------------------------------------------------------");
					System.out.println("1. Displaying BST build from Vocabulary File");
					vocab vt = new vocab();
					vt.start();
					vt.join();
					System.out.println("---------------------------------------------------------------------");
				 }
				 if (opt == '3') {
						System.out.println("---------------------------------------------------------------------");
					 System.out.println("----Displaying Vectors build from Input Files----");
					 System.out.println("-----------------FROM FILE 1----------------------");
					 file1 f1thread = new file1();
					 f1thread.start();
					 f1thread.join();
						System.out.println("---------------------------------------------------------------------");
					 System.out.println("-----------------FROM FILE 2----------------------");
					 file2 f2thread = new file2();
					 f2thread.start();
					 f2thread.join();
						System.out.println("---------------------------------------------------------------------");
	}
		}while(opt!='4');
			}
}
