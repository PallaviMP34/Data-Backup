import java.util.Scanner;
class Operation{
	public static void main(String []args){
        int result=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
    int num1=sc.nextInt();
    System.out.println("Enter the second number");
    int num2=sc.nextInt();
    System.out.println("Enter number beside the operation to perform :");
    System.out.println("\n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide \n");
    int operation=sc.nextInt();
    

    switch(operation){
       case 1 : result=num1+num2;
       System.out.println(num1+"+"+num2+"="+result);
        break;
       case 2 : result=num1-num2;
       System.out.println(num1+"-"+num2+"="+result);
        break;
       case 3 : result=num1*num2;
       System.out.println(num1+"*"+num2+"="+result);
        break;
       case 4 : result=num1/num2;
       System.out.println(num1+"/"+num2+"="+result);
        break;
      
       default : 
        break;
    }
    
	}
}