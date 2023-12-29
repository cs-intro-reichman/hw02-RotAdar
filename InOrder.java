/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
	int x= 0;
	int y= -1;
	do {
	x= (int)(10 * (Math.random()));
	if (x >= y) {
	System.out.print(x + " ");
	y= x;
	}
}
	while (x >= y);
	}
}
