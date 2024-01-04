import java.util.Scanner;
class For{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
    double sum=0;
    int count;
	System.out.println("Enter 5 numbers");
    for(count=0;count<5;count++){
         int num=sc.nextInt();
         if(num>0){
         sum=sum+num;
         }
         }
    System.out.println("The sum is "+sum);
	}
}