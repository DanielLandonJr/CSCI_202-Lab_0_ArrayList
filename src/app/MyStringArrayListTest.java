/*
* Name:
* Date Written:
* Purpose: Test the methods in ADT MyStringArrrayList
*  
* <p><strong>author: </strong><em>Daniel C. Landon Jr.</em></p>
* <p><strong>instructor: </strong><em>Dr. Bob Walsh</em></p>
* <p><strong>class: </strong><em>CSCI 202 - Introduction to Software Systems</em></p>
* <p><strong>date: </strong><em>01.23.2020</em></p>
* <p><strong>NOTE: </strong><em>Class supplied as part of course, modified per instructions for assignment.</em></p>
*
*/

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
		
		System.out.println("# of words in this list is " + mylist.getSize());
		System.out.println("The words in the list are " + mylist);
		/*
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
		*/
	}//main
	
}//class
