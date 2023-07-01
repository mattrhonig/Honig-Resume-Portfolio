public class TowerBuilder
{
    public static int SIZE = 2;
    // 2 = default minimum size

    public static void main(String[] args)
    {
        if(args.length > 0 && args[0] != null)
            SIZE = Integer.parseInt(args[0]);
        
        // UTILIZING WINDOWS .TXT FILES
        roof();      //method for roof piece
        floor();     //method for floors pieces
        ground();    //method for ground piece
        basement();  //method for basement piece
    } //end main
      
    public static void roofSpace()
    {
        int space = (SIZE * 4) + 1; //space for roof piece
        for (int i = 1; i <= space; i++)
        {
            System.out.print(" ");
        }
    } //end method roofSpace
    
    public static void printRoofPound()
    {
        //prints top and bottom row of '#'
        System.out.print(".");
        roofSpace();
        for (int i = 1; i <= (SIZE + (SIZE - 1)); i++)
        {
            System.out.print("#");
        }
        roofSpace();
        System.out.println(".");
    } //end method floorSpace

    public static void roof()
    {
        int roofHeight = SIZE + 1; //get height of "+..."
        //get width of '#' & '+' with (SIZE + (SIZE - 1))
      
        //print top line of '#'
        printRoofPound();
       
        for (int j = 1; j <= roofHeight; j++)
        {
            //print rows of '+'
            System.out.print(".");
            roofSpace();
            for (int k = 1; k <= (SIZE + (SIZE - 1)); k++)
            {
                System.out.print("+");
            }
            roofSpace();
            System.out.println(".");
        }
       
        //print bottom line of '#'
        printRoofPound();
    } //end method roof

    public static void floorSpace()
    {
        int space = (SIZE * 4) - 1; //space for floor piece
        for (int i = 1; i <= space; i++)
        {
            System.out.print(" ");
        }
    } //end method floorSpace
    
    public static void floorArrow()
    {
        int arrow = (SIZE * 2) + 3; //print '^...' for floor piece
        System.out.print(".");
        floorSpace();
        //gets width of '^'
        for (int i = 1; i <= arrow; i++)
        {
            System.out.print("^");
        }
        floorSpace();
        System.out.println(".");
    } //end method floorSpace
   
    public static void floor()
    {
        int floorHeight = (SIZE * SIZE) + 1; //get # of floors (floor height)
        int floorWidth = SIZE; //gets width of '+-' after initial '\-'
      
        //print top/first line of '^'
        floorArrow();
       
        for (int j = 1; j <= floorHeight; j++)
        {
            //print lines of '+-' after initial '\-'
            System.out.print(".");
            floorSpace();
            System.out.print("\\-");
            for (int k = 1; k <= floorWidth; k++)
            {
                System.out.print("+-");
            }  
            System.out.print("/");
            floorSpace();
            System.out.println(".");
          
            //print subsequent lines of '^'
            floorArrow();
        }
    } //end method floor
    
    public static void ground()
    {
        int line = SIZE / 2; //get num of lines to print
        for (int i = 0; i <= line; i++)
        {
            for (int dot = 1; dot <= (i * -3 + (3 * line)); dot++)
            {
                //print opening sequence of '...'
                System.out.print(".");
            }
            //start of pattern after number of '...'
            System.out.print("/=");
            for (int j = 1; j <= ((5 * SIZE) - (3 * line) + (3 * i)); j++)
            {
                //get num of '-=' segments after initial '/='
                System.out.print("-=");
            }
            //end of pattern before number of '...'
            System.out.print("\\");
            for (int dot = 1; dot <= (i * -3 + (3 * line)); dot++)
            {
                //print closing sequence of '...'
                System.out.print(".");
            }
            System.out.println(); //skip to next line
        }
    } //end method ground

    public static void basement()
    {
        int baseHeight = (SIZE * 2) - 2; //get height of basement
        int baseWidth = SIZE * 5; //get num of '%"' after initial '/"' (basement width)
        
        for (int i = 1; i <= baseHeight; i++)
        {
            System.out.print("/" + '"');
            for (int j = 1; j <= baseWidth; j++)
            {
                System.out.print("%" + '"');
            }
            System.out.println("\\");
        }

        System.out.println(""); //add extra empty line
    } //end method basement
} //end class A1
