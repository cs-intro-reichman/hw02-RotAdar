/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
	int x= Integer.parseInt(args[0]);
	for (int i= 0; i < x; i= i + 2) { // A loop that prints 2 rows of x *
	    System.out.println ();
	    for (int t= 0; t < x; t++) { // A loop that prints a row of x *
	        System.out.print ("* ");
	    }
	    System.out.println ();
	    for (int p= 0; p < x; p++) { // A loop that prints an opposite row of x *
	        System.out.print (" *");
	    }
	}
	}
}
