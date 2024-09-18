import java.util.Scanner;
import java.util.Random;
public class AssignmentOne
{
   public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

//*****************************************************************************************************************//
//THIS PART OF THE PROGRAM PRINTS MY INITIALS IN BIG LETTERS,WHERE EACH LETTER IS 10 LINES TALL.
//****************************************************************************************************************//
        System.out.println();
        System.out.println(   "NNNNN              NNN      RRRRRRRRRRR");
        System.out.println(   "NN NNNN            NNN      RRR   RRRRRRR");
        System.out.println(   "NNN  NNNN          NNN      RRR   RRRRRRR");
        System.out.println(   "NNN   NNNN         NNN      RRR  RRRR ");
        System.out.println(   "NNN    NNNN        NNN      RRR   RRRRR");
        System.out.println(   "NNN     NNNN       NNN      RRR     RRRRR");
        System.out.println(   "NNN       NNNN     NNN      RRR        RRRRR");
        System.out.println(   "NNN        NNNNNNNNNNN      RRR          RRRRRR");
        System.out.println(   "NNN         NNNNNNNNNN      RRR            RRRRR");
        System.out.println();
        System.out.println();
    
//************************************************************************************************************************************//
//THIS VERSION CREATES THE TEMPERATURE CONVERTATOR APPLICATION TO COVERT FROM FAHERENHEIT TO CELCIUS.READS THE FAHRENHEIT FROM THE USER.
//*************************************************************************************************************************************//

    System.out.println("ENTER A TEMPERATURE IN FAHRENHEIT : ");
    //Scanner scan = new Scanner(System.in);
    double fahrenheit = scan.nextDouble();
    double celsius = (( 5 * (fahrenheit-3.0))/9.0);
    System.out.println( fahrenheit + "\t\"DEGREE FAHRENHEIT TEMPERATURE IS EQUIVALENT TO :\"\t" + celsius + "\t\"DEGREE CELCIUS TEMPERATURE\"");
    System.out.println();
    System.out.println();

 //**********************************************************************************************************************************************//
 //THIS PART OF THE PROGRAM PROMPTS FOR AND READS THE 5 CHARACTER STRING FROM THE USER ,THEN SAVES THE STRING IN REVERSE
 //WITHOUT THE FIRST AND LAST CHARACTER.
 //***********************************************************************************************************************************************//

    String str = " ";
    String str1 = " ";

   System.out.println( "ENTER FIVE CHARACTER STRING :");
   str = scan.next();
   int b = str.length();
    for(int i=0;i<b;i++)
    {
        //Loop for switching between the characters of the entered string
        str1 = str.substring(1,b-1);
    }
    System.out.println(str1);
    int c = str1.length();

        for (int i=c-1;i>=0;i--)
        {
        System.out.print(str1.charAt(i) + " ");
        }
        System.out.println();
        System.out.println();

//*******************************************************************************************************************************************************//
//THIS PART OF THE PROGRAM GENERATES AND SAVES A RANDOM NUMBER BETWEEN 32 - 16,384,INCLUSIVE.
//********************************************************************************************************************************************************//
   int num;
    Random generator = new Random();
    System.out.println( "A RANDOM NUMBER GENERATED BETWEEN 16384 to 32 : ");
    num = generator.nextInt(16352)+32;
    System.out.println(num);
    System.out.println();


//*****************************************************************************************************************************************************//
//AND FINALLY,THE PROGRAM COMBINES THE RESULT OF STEPS 2 TO 4 AND PRINT IT TO THE SCREEN.    
//******************************************************************************************************************************************************//
    System.out.println("MY NEW STRING IS :" + celsius + "web" + num); 
}
}

