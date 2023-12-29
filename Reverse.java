/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
	String a = args[0];
	int length = a.length(); 
	String bwd = "";
	char middle = 0;
	for (int i = 0; i < (length); i++)
	{
	if (i == (length / 2) && (length % 2) == 0) middle = a.charAt(i-1);
	if (i == (length / 2) && (length % 2) == 1) middle = a.charAt(i);
	bwd= a.charAt(i) + bwd;
	}
	System.out.println(bwd);
	System.out.println(middle);
	}
}
