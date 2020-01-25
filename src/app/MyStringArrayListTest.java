/*
* Name:
* Date Written:
* Purpose: Test the methods in ADT MyStringArrrayList
*/

package app;

import java.util.*;

public class MyStringArrayListTest{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		MyStringArrayList mylist = new MyStringArrayList();
		
		System.out.println("# of words in this list is " + mylist.getSize());
		System.out.println("Enter 12 arbitrary words one at a time. ");
		for (int i = 0; i < 12; i++){
			mylist.addLast(input.next());
		}//for
		
		// extra method as project instructions
		mylist.enterSentence();
		
		System.out.println("# of words in this list is " + mylist.getSize());
		System.out.println("The words in the list are " + mylist);
		
		System.out.println("Enter one more word. ");
		mylist.addFront(input.next());
		System.out.println("The words in the list are " + mylist);

		System.out.println("The word \"apple\" is in this list." + mylist.contains("apple"));
		
		System.out.println("The word at position 3 is "+ mylist.getElement(3));
		
		System.out.println("The word at position 15 is "+ mylist.getElement(15));
		
		System.out.println("Removing the word at index 8.");
		String deleted = mylist.removeElementAt(8);
		System.out.println("The removed word is " + deleted);
		
		System.out.println("# of words in this list is " + mylist.getSize());
		System.out.println("The words in the list are " + mylist);
		
		// i realize that the instructions say to not modify the code, however the Scanner input object is never closed and it will bug me to no end if i do not close it
		input.close();

	}//main
	
}//class
