package emp;
import java.util.*;
public class InvalidAgeException extends Exception
{
   public InvalidAgeException()
   {
   }
   public InvalidAgeException(String msg)
   {
      //calling the constructor of parent Exception
      super(msg);
   }
   // Sir's solution
   public static int readAge()
   {
      while(true)
      {
         try
         {
            System.out.print("Enter Age: ");
            int age = new Scanner(System.in).nextInt();
            if(age<21 || age>60)
               throw new InvalidAgeException();
            else
               return age;
         }
         catch(InputMismatchException e)
         {
            System.out.println("Please enter number only");
         }
         catch(InvalidAgeException e)
         {
            System.out.println("Please enter age between 21-60");
         }
      }
   }
}
