import java.util.Scanner;
class employee
{   static int counter =0;
    Scanner sc = new Scanner(System.in);
    double bp;
    double da;
    double hra;
    double pf;
    double gp;
    
    employee()
    { 
        counter++;
       System.out.println("Enter your Basic Pay : ");
       bp = sc.nextDouble();
        da=bp*0.5;
        hra=bp*0.2;
        pf=bp*0.14;
       gp=bp+da+hra-pf;
    
    }
    void Payslip()
    {   
        System.out.println("PaySlip of Employee "+counter);
        System.out.println("Basic Pay : "+bp);
        System.out.println("Dearness Allowance (DA) : "+da);
        System.out.println("House Rent Allowance (HRA) : "+hra);
        System.out.println("Provident Fund (PF) : "+pf);
        System.out.println("Gross Pay : "+gp);
    }
    
}
public class Payslip {
    public static void main(String[] args) {
      employee e1 = new employee();
      e1.Payslip();
       employee e2 = new employee();
      e2.Payslip();
       employee e3 = new employee();
      e3.Payslip();
       
        
    }
}
