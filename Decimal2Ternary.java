/* -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
 * File Name : Decimal2Ternary.java

 * Purpose : Educational

 * Creation Date : 29-05-2016

 * Last Modified : Tue 31 May 2016 03:50:48 PM EEST

 * Created By :  Stamatios Anoustis, Artemis Zografou

 _._._._._._._._._._._._._._._._._._._._._.*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
/* Name of the class has to be "Main" only if the class is public. */
public class Decimal2Ternary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String output="";
		BigInteger N = BigInteger.ZERO,rem;

		if (args.length > 0){
			try {
				N = new BigInteger(args[0]);
				rem = new BigInteger(args[0]);
			}
			catch (NumberFormatException e) {
				System.err.println("N is not an ineger.");
				System.exit(1);
			}

			while (N.compareTo(BigInteger.ZERO) > 0) {
				rem = N.mod(BigInteger.valueOf(3));
				N = N.divide(BigInteger.valueOf(3));
				if (rem.equals(BigInteger.valueOf(2))) {
					rem.equals(BigInteger.valueOf(-1));
					N = N.add(BigInteger.ONE);
				}
				output = (rem.equals(BigInteger.ZERO)?'0':(rem.equals(BigInteger.ONE))?'+':'-') + output;
			}

			System.out.println(output);
		}
	}
}
