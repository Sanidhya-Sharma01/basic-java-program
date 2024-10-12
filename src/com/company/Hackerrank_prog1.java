

package com.company;
import java.util.*;


class Hackerrank_prog1 {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int numofinput = scan.nextInt();
        int[] input;
        input = new int[numofinput];
        int i =0;

        for(i = 0; i < numofinput && scan.hasNext(); i++)
        {

            try
            {
                int x =scan.nextInt();
                System.out.println(x+" can be fitted in:");

                if(x >=-127 && x <=127){
                    // System.out.println(x+" can be fitted in:");
                    System.out.println("* byte");
                }
                else {
                    // Number is not byte
                }

                if((x >=-32768) && (x<=32767)){
                    //System.out.println(x+" can be fitted in:");
                    System.out.println("* short");
                }
                if((x >=-2147483648) && (x<=2147483647)){
                    System.out.println("* int");
                }
                if((input[i] >=-10000000000000001L) && (input[i] <=9223372036854775807L) && input[i]== -100000000000000L){
                    System.out.println("* long");
                }//Complete the code
            }
            catch(Exception e)
            {
                System.out.println(scan.next()+" can't be fitted anywhere.");
            }

        }
    }
}

