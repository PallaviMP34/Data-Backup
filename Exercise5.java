import java.util.Scanner;
class Exercise5{
	public static void main(String [] args){
        int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        num1= sc.nextInt();
        num2= sc.nextInt();
        if(num1==num2){
            System.out.println("num1 and num2 are equal: " +num1);
        }
        else if(num1>num2){
            System.out.println(num1+" is the highest number");
        }
        else{
          System.out.println(num2+" is the highest number");  
        }
	
	}
}