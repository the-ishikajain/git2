package emp;
import java.util.*;
class Doctor extends Hospital
{
    
    Doctor()
    {
        super("hello");
    }   
   
    public String toString()
    {
    System.out.println("Doctor Name : " + super.doctorName);
    System.out.println("Doctor Speciality : " + super.doctorSpeciality);
    System.out.println("Doctor Payment : " + super.doctorPayment);
    System.out.println("Doctor Age : " + super.doctorAge);
    return "\n";
    }
    

}
