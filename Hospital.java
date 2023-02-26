import java.util.*;
class Hospital
{
   static String designation_p;
   static String designation_d;
   static String patientName;
   int patientAge;
   int patientPayment;
   static String disease;
   static String doctorName;
    static String doctorSpeciality;
    int doctorPayment;
    int doctorAge;
   int amount;
int id;
int patient_id
public void invoice(int patientPayment)
{
amount=patientPayement;
this.id=new Scanner(System.in).nextInt();
this.patient_id=new Scanner(System.in).nextInt();
}
   Hospital()
    {
      try
      {
       System.out.println("Enter payment of a patient : ");
        this.patientPayment=new Scanner(System.in).nextInt();
        System.out.println("Enter name of a patient : ");
        this.patientName= InvalidNameException.readName();;
        System.out.println("Enter age of a patient : ");
        this.patientAge=InvalidAgeException.readAge();
        System.out.println("Enter disease of a patient : ");
        this.disease = new Scanner(System.in).next();
        this.designation_p="Patient";
         invoice(patientPayment);
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
      
    } 
    Hospital(String name)
    {
       try
       {
      System.out.println("Enter payment of a doctor : ");
        this.doctorPayment=new Scanner(System.in).nextInt();
        System.out.println("Enter name of a doctor : ");
        this.doctorName= InvalidNameException.readName();;
        System.out.println("Enter speciality of a doctor : ");
        this.doctorSpeciality=new Scanner(System.in).next();
        System.out.println("Enter age of a doctor : ");
        this.doctorAge = InvalidAgeException.readAge();
        this.designation_d="Doctor";
       }
       catch
       {
           System.out.println(e);
       }
    } 
  
   
   
}
