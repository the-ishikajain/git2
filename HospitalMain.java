import java.util.*;
import emp.Doctor;
import emp.Patient;
import emp.Invoice;
import emp.Hospital;
public class HospitalMain1
{
  public static void main (String args[])
  {
     String Hospital1="Raymond Hospital";
     String Hospital2="Diamond Hospital";
    int c;
     System.out.println("Enter Hospital Name : 1 : Raymond Hospital or 2 : Diamond Hospital ");
                              s=cin.nextInt();
                              if(c==1 || c==2)
                              {
    int cur=0;
    int count1=0,count2=0;
     Scanner cin = new Scanner (System.in);
      //Hospital h1[]= new Hospital[50];
      ArrayList<Hospital> h1=new ArrayList<Hospital>();
      ArrayList<Hospital> h2=new ArrayList<Hospital>();
      Iterator itr=h1.iterator();
      Iterator itr1=h2.iterator();
     
    
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
                             
                            h1.add(p1);
                           new Invoice();
                            count1++;
              
                            break;               
            case 2:      
                          Doctor d1=new Doctor();
                          h2.add(d1);
                          count2++;
                          
                          break; 
                         
            case 3:        
                            System.out.println("All Patients List : ");
                              itr=h1.iterator();
                              while(itr.hasNext())
                              { 
                                Hospital ho=(Hospital)itr.next();
                                  System.out.println(ho);
                              }
                              System.out.println("All Doctors List : ");
                              itr1=h2.iterator();
                              while(itr1.hasNext())
                              { 
                                Hospital ho=(Hospital)itr1.next();
                                  System.out.println(ho);
                              }
                          break;
      
        
            case 4:    
                       itr1=h2.iterator();
                                while(itr1.hasNext())
                                { 
                                  System.out.println(((Hospital)itr1.next()).doctorName + " ->  ");
                                  itr=h1.iterator();
                                  while(itr.hasNext())
                                  {
                                  if((((Hospital)itr1.next()).doctorSpeciality).equals(((Hospital)itr.next()).disease));
                                  {
                                    System.out.println(((Hospital)itr.next()).patientName + " " );
                                  }
                                  }
                                }
                      /*for(int i=0;i<count2;i++)
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
                       */
                       break;
            case 5:    System.out.println("You are Exiting");
                        break;
        }
    }while(choice!=5);
                                 }
                                 else
                                 {
                                    System.out.println("Hospital doesnt exist");
                                 }
      }
}
