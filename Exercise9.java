import java.util.Scanner;
class Exercise9{
	public static void main(String [] args){
        int num1,num2,num3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        num1= sc.nextInt();
        num2= sc.nextInt();
        num3= sc.nextInt();
        if(num1==num2 && num1==num3){
            System.out.println("3  are equal: " +num1);
        }
        else if(num1>num2 && num1>num3){
            System.out.println(num1+" is the highest number");
        }
        else if(num2>num1&& num2>num3){
          System.out.println(num2+" is the highest number");  
        }
        else{
            System.out.println(num3+" is the highest number");
        }
	
	}
}

/*if(n1>n2){
    largest=num1;
}else{
    largest=num2;
}
if(num3>largest{
    largest=num3;

}
*/ 