/**
 * 
 */
package sEdwardsCaeser;
import java.util.Scanner;

/**
 * @author Shane Edwards 
 *
 */
public class SEdwardsCaeser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String message;
		String newMessage;
		char more;
		int offset;
		
		do
		{	
		System.out.print("Enter the message to encrypt: ");
		message = input.nextLine();
		
		System.out.print("Enter the offset to encrypt: ");
		offset = input.nextInt();
	    input.nextLine();
		
		newMessage = "";
		for(int i=0; i<message.length(); i++)
		{
			char newChar = (char) ((int) message.charAt(i) + offset);
			newMessage = newMessage + newChar;
		}
		
		System.out.println(newMessage);
		
		System.out.print("Do you have anymore messages to encrypt? [y/n]: ");
		more = input.nextLine().charAt(0);
		}while (more == 'y');
		
		System.out.println("End of program...");
		input.close();
		
	

	}

}
