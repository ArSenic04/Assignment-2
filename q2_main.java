import java.util.*;
public class q2_main {
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        System.out.println("Enter ID");
        int i=u.nextInt();
        System.out.println("Enter Balance");
        double ba=u.nextDouble();
        System.out.println("Default");
        Account j=new Account();
        
        Account a=new Account(i,ba);
        Account m=new Account();
        j.accessor();
        a.accessord();
        System.out.println("getMonthlyInterestRate");
        double d1=a.getMonthlyInterestRate();
        
        System.out.println(d1);
        System.out.println("getMonthlyInterest");
        double d2=a.getMonthlyInterest();
        System.out.println(d2);
        a.withdraw();
        a.deposite();
        System.out.println("For mutator");
        
        
        
    }
}
