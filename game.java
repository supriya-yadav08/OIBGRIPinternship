//Random number game

import java.util.*;
class game
{
public static void main (String args[])
{
System.out.println("****************************************************");
System.out.println("\t WELCOME TO RANDOM NUMBER GAME!");
System.out.println("****************************************************");
System.out.println("****************************************************");
System.out.println("\t RULES and INSTRUCTIONS");
System.out.println("1. This game will consits of 7 attempt");
System.out.println("2. In this game you have guess a random number between 1 to 100, if that number is same as the generated number then you will get a point");
System.out.println("3. For guessing right number you will get +1 point");
System.out.println("4. For guessing wrong number you will get +0 point");
System.out.println("5. after guessing the right number you will get +2 ponts for each remaining attempts");
System.out.println("****************************************************");
int gnum;
char c;
Scanner sc = new Scanner(System.in);
Random r = new Random();
do
{
int apt = 7;
int p = 0;
int cnum = 1+r.nextInt(100);
for (int i=0; i<7; i++)
{
System.out.println("****************************************************");
System.out.println("Enter you guessed number: ");
gnum=sc.nextInt();
apt--;
if (cnum==gnum)
{
System.out.println("CONGRATS YOU GUESSED THE NUMBER!");
p++;
System.out.println("SCORE: "+ (p+2*apt));
break;

}
else
if (cnum>gnum)
{
System.out.println("Expected number is greater then entered number");
System.out.println("SCORE: "+p);
System.out.println("NUMBER OF ATTEMPTS REMAINING: "+apt);
}
else
if (cnum<gnum)
{
System.out.println("Expected number is less then entered number");
System.out.println("SCORE: "+p);
System.out.println("NUMBER OF ATTEMPTS REMAINING: "+apt);
}
}
System.out.println("****************************************************");
System.out.println("Do you want to play again(y/n)");
c=sc.next().charAt(0);
}
while(c=='y');
}
}