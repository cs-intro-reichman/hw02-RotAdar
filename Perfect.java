/**
 *  Gets a command-line argument (int), and checks if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
	int x= Integer.parseInt(args[0]);
	String perfect= x + " is a perfect number since " + x + " = 1";
	int div= 1;
	for (int i = 2; i < x; i++) // A loop that puts the divisors of the argument into string 'perfect' and addition them to int 'div'
		{
			if (x % i == 0) {
			perfect= perfect + " + " + i;
			div= div + i;
		}
	}
	if (div == x) { 
	    System.out.println(perfect);
	}
	else {
	    System.out.println (x + " is not a perfect number");
	}
}
}
