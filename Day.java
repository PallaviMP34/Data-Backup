import java.util.Scanner;
class Day{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the day");
    int day=sc.nextInt();
    String message="";
    if(day==1){
        message="Monday";
        
    }
     else if(day==2){
        message="Tuesday";
         
    }
    else if(day==3){
        message="Wednesday";
         
    }
    else if(day==4){
        message="Thursday";
        
    }
    else if(day==5){
        message="Friday";
         
    }
    else if(day==6){
        message="Saturday";
         
    }
    else if(day==7){
        message="Sunday";

    }
    else{
        message="invalid day";
        
    }
    System.out.println(message);
	}
}