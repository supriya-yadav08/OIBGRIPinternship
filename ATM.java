//ATM Interface

import java.util.*;
class ATM
{
public static void main (String args[])
{
String cid = "ne2002";
String cpass = "Neh0805";
Scanner sc = new Scanner(System.in);
System.out.println("ENTER LOGIN ID: ");
String id = sc.next();
System.out.println("ENTER PASSWORD: ");
String pass = sc.next();
System.out.println("***************************************");
if(cid.equals(id) && cpass.equals(pass))
{
System.out.println("\t WELCOME!");
System.out.println("***************************************");
System.out.println();
System.out.println("***************************************");
System.out.println("\t CUSTOMER INFORMATION");
System.out.println("ACCOUNT HOLDER NAME: NEHA PRASAD");
System.out.println("ACCOUNT NO.: 10000100001");
System.out.println("IFSC CODE: ASD0001");
System.out.println("BRANCH: CHINCWAD(PUNE)");
System.out.println("***************************************");
ArrayList<String> ar = new ArrayList<>();
int ch;
double bal=10000.00;
ar.add("credit: "+10000.00);
double wit, dep, tra;
char c;
do
{
System.out.println("1. Check Balance");
System.out.println("2. Withdraw");
System.out.println("3. Deposit");
System.out.println("4. Transfer");
System.out.println("5. Transaction History");
System.out.println("6. Quit");
System.out.println("Enter your choice: ");
ch = sc.nextInt();
switch (ch)
{
case 1: 
{
System.out.println("***************************************");
System.out.println("\t Check Balance");
System.out.println("Current Balance:" +bal);

System.out.println("***************************************");
}
break;
case 2:
{
System.out.println("***************************************");
System.out.println("\t Widthdraw");
System.out.println("Enter widthdraw amount: ");
wit = sc.nextDouble();
if(wit > bal)
System.out.println("Withdrawl not possible, insufficient funds");
else
{
bal = bal-wit;
System.out.println(+wit +"amount has been withdrawn");
ar.add("debit: "+wit);
}
System.out.println("Current balance: "+bal);
System.out.println("***************************************");
}
break;
case 3:
{
System.out.println("***************************************");
System.out.println("\t Deposit");
System.out.println("Enter deposit amount: ");
dep = sc.nextDouble();
bal = bal+dep;
System.out.println(+dep +"amount has been deposited");
System.out.println("Current balance: "+bal);
ar.add("credit: "+dep);
System.out.println("***************************************");
}
break;
case 4:
{
System.out.println("***************************************");
System.out.println("\t Transfer");
System.out.println("Transfer amount: ");
tra = sc.nextDouble();
if (bal < tra)
System.out.println("Tranfer not possible!");
else
{
bal = bal-tra;
System.out.println("Nominee first and last Name: ");
String fnom = sc.next();
String lnom = sc.next();
System.out.println("Nominee Account Number: ");
int acnom = sc.nextInt();
System.out.println("nominee IFSC code: ");
String nomifsc = sc.next();
System.out.println(+tra+" amount has been transfered to "+fnom+" "+lnom+" holding account number "+acnom+" with IFSC code "+nomifsc );
System.out.println("Current balance: "+bal);
ar.add("debit: "+tra);
}
System.out.println("***************************************");
}
break;
case 5:
{
System.out.println("***************************************");
System.out.println("\t TRANSACTION HISTORY");
if(ar.size()==0)
System.out.println("No History Available"); 
else
for(int i=ar.size()-1;i>=0;i--)
System.out.println(ar.get(i));
System.out.println("***************************************");
}
break;
case 6:
{
System.out.println("***************************************");
System.out.println("\t QUIT");
System.out.println("THANK YOU FOR USING ASD ATM");
System.out.println("click n to logout");
System.out.println("***************************************");
}
break;

default :
{
System.out.println("***************************************");
System.out.println("INVALID CHOICE");
System.out.println("***************************************");
}

}
System.out.println ("Do You want to continue(y/n): ");
c= sc.next().charAt (0);
}
while (c == 'y');
}
else
System.out.println("PLEASE CHECK YOUR ID OR PASSWORD");
System.out.println("***************************************");
}
}

