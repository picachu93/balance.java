/* -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
* File Name : Decimal2Ternary.java

* Purpose : Educational

* Creation Date : 29-05-2016

* Last Modified : Sun 29 May 2016 11:09:23 PM EEST

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
                 int n=15, rem;
    while (n>0) {
       rem = n%3;
       n = n/3;
       if (rem == 2) {
           rem = -1;
           n++;
       }
       output = (rem==0?'0':(rem==1)?'+':'-') + output;
    }

    System.out.println(output);
        }
}

