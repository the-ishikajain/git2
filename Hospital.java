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
   Hospital()
    {
       System.out.println("Enter payment of a patient : ");
        this.patientPayment=new Scanner(System.in).nextInt();
        System.out.println("Enter name of a patient : ");
        this.patientName= new Scanner(System.in).next();
        System.out.println("Enter age of a patient : ");
        this.patientAge=new Scanner(System.in).nextInt();
        System.out.println("Enter disease of a patient : ");
        this.disease = new Scanner(System.in).next();
        this.designation_p="Patient";
    } 
    Hospital(String name)
    {
      System.out.println("Enter payment of a doctor : ");
        this.doctorPayment=new Scanner(System.in).nextInt();
        System.out.println("Enter name of a doctor : ");
        this.doctorName= new Scanner(System.in).next();
        System.out.println("Enter speciality of a doctor : ");
        this.doctorSpeciality=new Scanner(System.in).next();
        System.out.println("Enter age of a doctor : ");
        this.doctorAge = new Scanner(System.in).nextInt();
        this.designation_d="Doctor";
    } 
  
   
   
}
