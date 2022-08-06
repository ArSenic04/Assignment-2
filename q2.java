import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class Account{
    private int id;
    private static double balance;
    private static double annualInterestRate=7;
    private static String dateCreated;
    Account()
    {
        id=0;
        balance=500;
        
        dateCreated="04.11.2003";
    }
    Account(int i,double b)
    {
        id=i;
        balance=b;
    }
    void accessor()
    {
        System.out.println(id);
        System.out.println(balance);
        System.out.println(annualInterestRate);
        System.out.println(dateCreated);
    }
    void accessord()
    {
        System.out.println(dateCreated);
    }
    
    void mutator()
    {
        
        Scanner o=new Scanner(System.in);
        System.out.println("Enter ID for Mutator");
        int k=o.nextInt();
        System.out.println("Enter Balance for Mutator");
        double bal=o.nextDouble();
        System.out.println("Enter annualInterestRate for Mutator");
        double ann=o.nextDouble();
        
    }
    static double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }
    static double getMonthlyInterest()
    {
        return (annualInterestRate/12)*balance;
    }
    static void withdraw()
    {
        System.out.println("Enter the Amount to withdraw");
        Scanner o=new Scanner(System.in);
        double with=o.nextDouble();
        System.out.println("Your Balance is :- "+(balance-with));
        
    }
    static void deposite()
    {
        System.out.println("Enter the Amount to Deposit");
        Scanner o=new Scanner(System.in);
        double dep=o.nextDouble();
        System.out.println("Your Balance is :- "+(balance+dep));
    }

}
