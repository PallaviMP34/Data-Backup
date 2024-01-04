import java.util.Scanner;
class While{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
    double sum=0;
    int count=0;
	System.out.println("Enter 5 numbers");
    while(count<5){
         int num=sc.nextInt();
         if(num>0){
         sum=sum+num;
         }
         count++;
         }
         
    }
    System.out.println("Sum = "+sum);
	}
/* while(count<5){
         int num=sc.nextInt();
         count++;
         if(num<0) continue;
         
         sum += num;
        
         }
  */       