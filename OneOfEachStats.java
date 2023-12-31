import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
    public class OneOfEachStats {
    public static void main (String[] args) {
		int t= Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		Random generator = new Random(seed);
		double avg= 0.0;
		int two= 0;
		int three= 0;
		int four= 0;

		for (int i= 0; i < t; i++) {
	boolean gender= true; //OneOfEach program starts (without printing)
	boolean secGender= true;
	int amount= 1;
    double rnd= generator.nextDouble();
	if (rnd > 0.5) { // A loop that get a randon gender 
	    gender= false;
	    secGender= false;
        }
	while (gender == secGender) {
		rnd= generator.nextDouble();
	   	amount++;
	    if (rnd < 0.5) {
	       secGender= true;
	       }
        else {
	    	secGender= false;
           }
	    }
	        if (amount == 2) two++;
	        if (amount == 3) three++;
	        if (amount >= 4) four++;
	        avg= avg + ((double)(amount));
	}
	avg= (avg / ((double)(t)));
	int common= 0;
	if (two >= three && two >= four) {
       common= 2; 
       }
    if (three >= four && three >= two) {
       		common= 3;
       }
   if (four >= three && four >= two) {
   	common= 4;
   }
	System.out.println("Average: " + avg + " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: " + two);
	System.out.println("Number of families with 3 children: " + three);
	System.out.println("Number of families with 4 or more children: " + four); 
	System.out.println("The most common number of children is " + common+ ".");
	}
}
