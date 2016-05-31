/* -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
 * File Name : Decimal2Ternary.java

 * Purpose : Educational

 * Creation Date : 29-05-2016

 * Last Modified : Tue 31 May 2016 03:05:13 PM EEST

 * Created By :  Stamatios Anoustis, Artemis Zografou

 _._._._._._._._._._._._._._._._._._._._._.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Decimal2Ternary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String output="";
		int N = 0, rem;

		if (args.length > 0){
			try {
				N = Integer.parseInt(args[0]);
			}
			catch (NumberFormatException e) {
				System.err.println("N is not an ineger.");
				System.exit(1);
			}

			while (N>0) {
				rem = N%3;
				N = N/3;
				if (rem == 2) {
					rem = -1;
					N++;
				}
				output = (rem==0?'0':(rem==1)?'+':'-') + output;
			}

			System.out.println(output);
		}
	}
}
