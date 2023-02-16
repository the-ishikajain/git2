import java.util.*;
class Patient extends Hospital
{
    
    Patient()
    {
    }   
    public String toString()
    {
    System.out.println("Patient Name : " + super.patientName);
    System.out.println("Patient Age : " + super.patientAge);
    System.out.println("Patient Payment : " + super.patientPayment);
    System.out.println("Patient Disease : " + super.disease);
    return "\n";
    }
}
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
