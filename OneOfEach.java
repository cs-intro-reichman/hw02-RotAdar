
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	String children= "";
	boolean gender= true;
	boolean secGender= true;
	int amount= 1;
	if (Math.random() < 0.5) { // Aloop that get a randon gender 
	   children= "g";
	   }
	else { gender= false;
	       secGender= false;
           children= "b";
         }
	   while (gender == secGender) {
	   	amount++;
	         if (Math.random() < 0.5) {
	            children= children + " g";
	            secGender= true;
	         }
	         else {
	         	children=children + " b";
	         	secGender=false;
	         }
	        }
	        System.out.println(children );
	        System.out.println("You made it... and you have " + amount + " children.");

	   }
    }
