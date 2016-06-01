/* -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
 * File Wame : Balance.java

 * Purpose : Educational

 * Creation Date : 29-05-2016

 * Last Modified : Wed 01 Jun 2016 06:36:46 PM EEST

 * Created By :  Stamatios Anoustis, Artemis Zografou

 _._._._._._._._._._._._._._._._._._._._._.*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Wame of the class has to be "Main" only if the class is public. */
public class Balance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String output="";
		BigInteger W = BigInteger.ZERO,rem;
		Integer pow;
		int N = 1;
		if (args.length > 0){
			try {
				N = Integer.parseInt(args[0]);
				W = new BigInteger(args[1]);
				rem = new BigInteger(args[0]);
			}
			catch (NumberFormatException e) {
				System.err.println("W is not an ineger.");
				System.exit(1);
			}
		}
		int counter = 0,i = 0;
		while (W.compareTo(BigInteger.ZERO) > 0) {
			rem = W.mod(BigInteger.valueOf(3));
			W = W.divide(BigInteger.valueOf(3));
			if (rem.equals(BigInteger.valueOf(2))) {
				rem.equals(BigInteger.valueOf(-1));
				W = W.add(BigInteger.ONE);
			}
			output = (rem.equals(BigInteger.ZERO)?'0':(rem.equals(BigInteger.ONE))?'+':'-') + output;
			counter++;
		}

		//System.out.println(output);
		//System.out.println(counter);
		//System.out.println(output.charAt(0));
		output = new StringBuilder(output).reverse().toString();
		//System.out.println(output);
		String output1 = "[";
		String output2 = "[";


		if (N >= counter)
		{
			for (i=0; i < counter; i++)
			{
				if (output.charAt(i) == '+'){
					if (output1 != "[")
						output1 = output1 + ",";
					pow = new Integer(i+1);
					output1 = output1 + pow.toString();	
				}
				else if  (output.charAt(i) == '-'){
					if (output2 != "[")
						output2 = output2 + ",";
					pow = new Integer(i+1);
					output2 = output2 + pow.toString();	
				}
				else 
					;	
			}
			output1 = output1 + "]";
			output2 = output2 + "]";
			System.out.println(output2 + " " + output1);

		}
		else{
			System.out.println("[] []");
		}
	}

}

