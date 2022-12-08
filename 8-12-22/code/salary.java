//Employee salary
import java.util.Scanner;
class salary
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("select your department");
System.out.println("1.Quality");
System.out.println("2.Production");
System.out.println("3.Maintanance");
System.out.println("4.IT");
System.out.println("5.Store");
int SelectedDepartment= sc.nextInt();
switch(SelectedDepartment)
{

case 1->System.out.println("Your salary is 20000");
case 2->System.out.println("Your salary is 18000");
case 3->System.out.println("Your salary is 16000");
case 4->System.out.println("Your salary is 14000");
case 5->System.out.println("Your salary is 12000");
default->System.out.println("invalid Department");
}
}
}