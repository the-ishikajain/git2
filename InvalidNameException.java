package hos;
import java.util.*;
import java.util.InputMismatchException;
import java.util.regex.Pattern;
public class InvalidNameException extends Exception
{
   public InvalidNameException()
   {
   }
   public InvalidNameException(String msg)
   {
      //calling the constructor of parent Exception
      super(msg);
   }
   public static String readName()
   {
      while(true)
      {
         try
         {
            System.out.print("Enter Name: ");
            String name = new Scanner(System.in).next();
            if (!(Pattern.matches("[a-zA-Z]+",name)))
               throw new InvalidNameException();
            else
               return name;
         }
         catch(InvalidNameException e)
         {
            System.out.println("Please enter Characters only");
         }
      }
   }
}
