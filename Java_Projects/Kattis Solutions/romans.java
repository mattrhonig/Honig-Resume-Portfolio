/*
    Roaming Romans, 'https://open.kattis.com/problems/romans'
*/
import java.util.*;

class romans
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        double x = kbd.nextDouble();
        
        System.out.println(Math.round(x * 1000 * 5280/4854)); //Conversion

        kbd.close();
    } //end main
} //end class
