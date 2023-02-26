package emp1;
import java.util.*;
class Invoice extends Hopital
{
int id;
int patient_id;
int amount;
Invoice(int patientPayment)
{
amount=patientPayement;
this.id=new Scanner(System.in).nextInt();
this.patient_id=new Scanner(System.in).nextInt();
}
public String toString()
{
return "id : " + id + " patient_id :"  patient_id + "amount : " + amount;
}
}
