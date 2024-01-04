import java.util.Scanner;
class DayWithSwitch{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the day");
    int day=sc.nextInt();
    String message="";
    switch(day){
       case 1 : message="Monday";
        break;
       case 2 :   message="Tuesday";
        break;
       case 3 :  message="Wednesday";
        break;
       case 4 :  message="Thursday";
        break;
       case 5 :  message="Friday";
        break;
       case 6 : message="Saturday";
        break;
       case 7 :  message="Sunday";
        break;
       default : message="invalid day";
        break;
    }
    System.out.println(message);
	}
}