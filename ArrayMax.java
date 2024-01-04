import java.util.Scanner;
class ArrayMax{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size");
    int size=sc.nextInt();
   int [] num=new int[size];
       System.out.println("Enter the numbers");
    int max=num[0];
   for(int count=0;count<size;count++){
         num[count]=sc.nextInt();
        
    }
   
    for(int nums:num){
        if(nums>max){
            max=nums;
        }
    }
    System.out.println("highest value : "+max);
    }
}