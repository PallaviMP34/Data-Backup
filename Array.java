import java.util.Scanner;
class Array{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size");
    int size=sc.nextInt();
   int [] num=new int[size];
       System.out.println("Enter the numbers");
    int sum=0;
   
    for(int count=0;count<size;count++){
         num[count]=sc.nextInt();
        sum=num[count]+sum;
    }
    System.out.println(sum);
    for(var nums:num)
    System.out.println(nums);
    }
}