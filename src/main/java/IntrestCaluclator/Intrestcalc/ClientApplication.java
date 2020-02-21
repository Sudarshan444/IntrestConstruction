package IntrestCaluclator.Intrestcalc;

import java.util.Scanner;
public class ClientApplication
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int choice,principal,time;
        float rate_interest;
        System.out.format("%s","Choose one\n1.Simple Interest\n2.Compound interest");
        choice=s.nextInt();
        BusinessIntrest b=new BusinessIntrest();
        System.out.format("%s","Enter PrincipalAmount:");
        principal=s.nextInt();
        System.out.format("%s","Enter Time period:");
        time=s.nextInt();
        System.out.format("%s","Enter Rate Of Interest:");
        rate_interest=s.nextFloat();
        if(choice==1) {
            System.out.format("%s","---------SIMPLE INTEREST---------");
            System.out.format("\nSimple Interest is %f Rupees",b.simple_interest(principal,time,rate_interest));
        }
        if(choice==2) {
            System.out.format("%s","---------COMPOUND INTEREST---------");
            System.out.format("\nCompound Interest is %f Rupees",b.compound_interest(principal,time,rate_interest));
        }

        BussinesHome h=new BussinesHome();
        int area;
        System.out.format("\nHOUSE CONSTRUCTION COST");
        System.out.format("%s","\nEnter area in square feet:");
        area=s.nextInt();
        System.out.format("%s","\nSelect a Material Standard:");
        System.out.format("%s","\n1.1200 INR--- Standard Materials\n2.1500 INR--- Above Standard Materials\n3.1800 INR---	High Standard Material\n4.2500 INR--- High Standard Material+Fully Automated Home");
        int c=s.nextInt();
        if(c==1){
            System.out.format("\nTotal Construction cost of the house with Standard Materials is %d rupees",h.construction_cost(1200,area));
        }
        else if(c==2){
            System.out.format("\nTotal Construction cost of the house with Above Standard Materials is %d rupees",h.construction_cost(1500,area));
        }
        else if(c==3){
            System.out.format("\nTotal Construction cost of the house with High Standard Materials is %d rupees",h.construction_cost(1800,area));
        }
        else if(c==4){
            System.out.format("\nTotal Construction cost of the house with High Standard Materials along with fully Automated home is %d rupees",h.construction_cost(2500,area));
        }
        else {
            System.out.format("Invalid Choice");
        }
    }
}