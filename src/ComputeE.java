import java.text.DecimalFormat;
import java.util.*;

public class ComputeE {
	
	public static void main (String args [])
	{
		int input;
		Scanner in = new Scanner(System.in);
		System.out.println("Note: this program computes e to the user input and displays that many numbers after the decimal.");
		System.out.println("Enter a number between 0 and 11 to compute e to:");
		input = in.nextInt();
		
		computeE(input);
		
	}
	
	public static void computeE(int input)
	{
		String zeros = "";
		String exp;
		
		for(int x=0; x<input; x++)
		{
			zeros += "0";
		}
		DecimalFormat df = new DecimalFormat("#." + zeros);
		exp = df.format(Math.exp(input));
		
		//System.out.println(Math.exp(input));
		System.out.println(exp);
	
	}

}
