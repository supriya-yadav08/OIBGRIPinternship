 import java.util.*;
class timer1 extends Thread
{
Scanner sc = new Scanner (System.in);
int id;
public void run()
{
if(id==1)
for (int i=30; i>=0; i--)
{
System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t REMAINING TIME: "+i+"sec");
try
{
Thread.sleep(1000);
}
catch (Exception e)
{
System.out.println("INVALID TIME");
}
}
else
if(id==2)
{
int score=0;
System.out.println("**********************************************");
System.out.println("i. What is the capital of india?");
System.out.println("1.Maharastra  2.Uttar Pradesh  3.New delhi 4.Rajasthan");
System.out.println("Enter your answers's option number");
int a1=sc.nextInt();
if(a1==3)
score++;

System.out.println("**********************************************");
System.out.println("ii. SI unit of capacitance?");
System.out.println("1.volt/meter  2.Farad  3.Henry 4.ohm");
System.out.println("Enter your answers's option number");
int a2=sc.nextInt();
if(a2==2)
score++;
System.out.println("**********************************************");
System.out.println("iii. Java are complied or Intepreted?");
System.out.println("1.Only Complied  2.Only Interpreted  3.None 4.Both 1&2");
System.out.println("Enter your answers's option number");
int a3=sc.nextInt();
if(a3==4)
score++;
System.out.println("**********************************************");
System.out.println("iv. Java taskes input from user using");
System.out.println("1.Command line arguments  2.Buffered Reader class  3.Scanner class 4.All of the above");
System.out.println("Enter your answers's option number");
int a4=sc.nextInt();
if(a4==4)
score++;
System.out.println("**********************************************");
System.out.println("v.State with Largest population?");
System.out.println("1.Maharastra  2.Uttar Pradesh  3.New delhi 4.Rajasthan");
System.out.println("Enter your answers's option number");
int a5=sc.nextInt();
if(a5==2)
score++;
System.out.println("**********************************************");
System.out.println("Do you want to submit the exam click y");
char sub = sc.next().charAt(0);
System.out.println("**********************************************");
if(sub=='y' || sub=='Y')
{
System.out.println("**********************************************");
System.out.println("SCORE: " + (score*5));
System.out.println("**********************************************");
System.out.println("TO LOGOUT ENTER l");
char l = sc.next().charAt(0);
System.out.println("**********************************************");
System.out.println("YOU HAVE BEEN LOGGED OUT!");
System.out.println("**********************************************");
}

}
}
}


class olex
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("**********************************************");
System.out.println("\t WELCOME TO ONLINE PORTAL");
System.out.println("**********************************************");
System.out.println("\t enter your credentials to login");
System.out.println("Enter your user id: ");
String eid = sc.next();
System.out.println("Enter your password: ");
String epass = sc.next();
String cid = "oasis123";
String cpass = "OASIS098";
System.out.println("**********************************************");
if (eid.equals(cid) && epass.equals(cpass))
{
System.out.println("\t WELCOME, succesfully login!");
System.out.println("**********************************************");
String fname = "NEHA ";
String lname = "PRASAD";
String college = "POIU";
String roll = "101";
String stream = "ENTC";
System.out.println("NAME: "+ fname+" "+lname);
System.out.println("COLLEGE: "+ college);
System.out.println("ROLL NO.: "+ roll);
System.out.println("STREAM: "+stream);

System.out.println("**********************************************");
System.out.println("\t choice list:");
System.out.println();
System.out.println("1. update profile and password");
System.out.println("2. Start exam");
System.out.println("3. logout");

System.out.println("Enter your choice: ");
int choice = sc.nextInt();
switch (choice)
{
case 1:
{
System.out.println("**********************************************");
System.out.println("\t PROFILE UPDATE");
System.out.println("**********************************************");
char o;
do
{
System.out.println("you want to update");
System.out.println("1. NAME");
System.out.println("2. COLLEGE NAME");
System.out.println("3. ROLL NO");
System.out.println("4. STREAM");
System.out.println("5. PASSWORD");
System.out.println("Enter your choice: ");
int uchoice = sc.nextInt();
switch(uchoice)
{
case 1 :
System.out.println("enter first and last name:");
fname = sc.next();
lname = sc.next();
System.out.println("NAME: "+fname +" "+ lname);
break;
case 2:
System.out.println("ENTER COLLEGE NAME : ");
college = sc.next();
System.out.println("COLLEGE: "+college);
break;
case 3:
System.out.println("ENTER ROLL NO.: ");
roll = sc.next();
System.out.println("ROLL NO.: "+roll);
break;
case 4:
System.out.println(" ENTER STREAM: ");
stream = sc.next();
System.out.println("STREAM: "+stream);
break;
case 5:
System.out.println("ENTER PASSWORD: ");
cpass = sc.next();
System.out.println("PASSWORD: "+cpass);
break;
}//switch
System.out.println("DO YOU WANT TO CONTINUE (y/n)");
o = sc.next().charAt(0);
}//do
while(o=='y' || o=='Y');
System.out.println("**********************************************");
System.out.println("Enter your user id: ");
String eid1 = sc.next();
System.out.println("Enter your password: ");
String epass1 = sc.next();
if (eid1.equals(cid) && epass1.equals(cpass))
System.out.println("\t WELCOME, succesfully login!");
else
System.out.println("\t Please enter right credentials to login");
System.out.println("**********************************************");
}
case 2:
{
System.out.println("**********************************************");
System.out.println("\t RULES AND INSTRUCTIONS");
System.out.println();
System.out.println("1. this examition will contain 5 MCQ");
System.out.println("2. for each ques 4 options are there");
System.out.println("3. total 1 min of time is alloted for this examination");
System.out.println("4. After 2 min the examition will be terminated");
System.out.println("4. Each ques is of 5 marks");
System.out.println("**********************************************");
System.out.println("Enter y to continue");
char con = sc.next().charAt(0);
System.out.println("**********************************************");
if(con=='y' || con=='Y')
{

timer1 t1 = new timer1();
timer1 t2 = new timer1();
t1.id=1;
t2.id=2;
t1.start();
t2.start();


}
}
break;
case 3: 
{
System.out.println("**********************************************");
System.out.println("YOU HAVE BEEN LOGGED OUT!");
System.out.println("**********************************************");
}
break;

}//switch
}//if
else
{
System.out.println("\t Please enter right credentials to login");
System.out.println("**********************************************");
}
}
}
