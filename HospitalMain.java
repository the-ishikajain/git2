import java.util.*;
public class HospitalMain1
{
  public static void main (String args[])
  {
    int cur=0;
    int count1=0,count2=0;
     Scanner cin = new Scanner (System.in);
      Hospital h1[]= new Hospital[50];
      int choice=0;
       do
       {
        System.out.println("Enter 1 to add patient : ");
        System.out.println("Enter 2 to add Doctor : ");
        System.out.println("Enter 3 to display");
        System.out.println("Enter 4 to display patient - doctor");
        System.out.println("Enter 5 to Exit");
        choice = cin.nextInt();
        switch (choice)
        {
            case 1:        Patient p1=new Patient();
                            h1[cur++]=p1;
                            count1++;
                            break;               
            case 2:      
                          Doctor d1=new Doctor();
                          h1[cur++]=d1;
                          count2++;
                          
                          break;
            case 3:        for(int i=0;i<cur;i++)
                              { 
                                  System.out.println(h1[i]);
                              }
                          break;
      
        
            case 4:    for(int i=0;i<count2;i++)
                       {
                        String name1=h1[i].designation_d;
                       
                        if(name1.equals("Doctor"))
                        {
                          System.out.println(h1[i].doctorName + " ->  ");
                         for(int j=0;j<count1;j++)
                         {
                          if((h1[j].designation_p.equals("Patient")) && (h1[j].disease.equals(h1[i].doctorSpeciality)))
                          {
                            System.out.println(h1[j].patientName + " " );
                          }
                         }
                         System.out.println();
                        }
                       }
                       break;
            case 5:    System.out.println("You are Exiting");
                        break;
        }
    }while(choice!=5);
      }
}
