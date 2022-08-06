import  java.util.Scanner;

public class q3 {
static  double  acb  =  300;
private  static  final  Scanner  in  =  new  Scanner(System.in); public  static  void  main(String[]  args)  {
Account[]  accounts  =  new  Account[10];
for  (int  i  =  1;  i  <  11;  i++)  {
    accounts[i  -  1]  =  new  Account(i,  300.0);
}
System.out.print("Enter  an  id  (1  -  10):  "); int  id  =  in.nextInt();
if (id < 1 || id > 10) {
System.out.println("enter  a  correct  id,written  id is incorrect");
}

while (true) { menuDisplay();
System.out.print("Enter  a  choice:  "); int  choice  =  in.nextInt();
Account  a=new  Account(); switch(choice)
{
case  1:
//  a.balanceinquiry(); break;
case  2: a.withdraw(); break;
case  3: a.deposit(); break;
case  4:
//  a.transfer(); break;
case  5:
//  a.create_account(); break;
case  6:
//  a.Deactivate_Account(); break;
case  7: break; default: break;

}
}
}
public  static  void  menuDisplay()  {

    System.out.println("****Main  menu****"); 
    System.out.println("1:  Balance  Inqury"); 
    System.out.println("2:  Withdraw  money");
    System.out.println("3:  Deposit  money"); 
    System.out.println("4:  Transfer"); 
    System.out.println("5:  Create  account"); 
    System.out.println("6:  deactivate  Account"); 
    System.out.println("7:  Exit");

}
}

 

