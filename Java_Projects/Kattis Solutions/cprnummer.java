/*
    CPR Number, 'https://open.kattis.com/problems/cprnummer'
    Iteration 2; uses method
*/
import java.util.*;
//import java.util.Arrays;

class cprnummer2
{
    public static void main(String[] args)
    {
	    Scanner kbd = new Scanner(System.in);
        //System.out.print("Enter ID: ");
        String id = kbd.nextLine();
        kbd.close();        

	    //Sample input IDs
        //String id1 = "070761-4285"; //1 ✓
        //String id2 = "051002-4321"; //0 X
        //String id3 = "310111-0469"; //1 ✓
        
	    Kontoret(id);
        //Kontoret(id1);
        //Kontoret(id2);
        //Kontoret(id3);
    } //end main
    
    public static void Kontoret(String id)
    {
        // Strip '-' to make the ID a numbered character string
        String cpr = id.replaceAll("-", "");
        //System.out.println(cpr + "\n");
        
	    // Converting string ID to int array
        int[] cVal = new int[cpr.length()];
        for (int i = 0; i < cpr.length(); i++)
        {
            cVal[i] = Integer.parseInt(Character.toString(cpr.charAt(i)));
            //System.out.print(cpr.charAt(i) + " ");
        } //end for loop i
        
        // Corresponding rule
        int[] cRule = new int[]{4, 3, 2, 7, 6, 5, 4, 3, 2, 1};
	
        int yield;
        int sum = 0;
        
        // Validating a number with check digit, then adding to sum
        for (int j = 0; j < cVal.length; j++)
        {
            yield = cVal[j] * cRule[j];
	    // Given sample values:    {0, 7, 0, 7, 6, 1, 4, 2, 8, 5}
	    // Multiplied by            x  x  x  x  x  x  x  x  x  x
	    // Corresponding ID rule:  {4, 3, 2, 7, 6, 5, 4, 3, 2, 1}
            sum += yield;
        } //end for loop j
        
        // Use Modulo 11 rule to check sum; valid sum MUST equal 0
	    // Return '1' for no remainder and '0' for any remainder
	    // '1' denotes valid CPR number, '0' denotes invalid
        if (sum % 11 == 0)
            System.out.println("1\n");
        else if (sum % 11 != 0)
            System.out.println("0\n");
    } //end method Kontoret
} //end class
