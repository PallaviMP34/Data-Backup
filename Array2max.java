import java.util.Scanner;
class Array2max{
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
    int secmax=num[0];
    for(int count=1;count<num.length;count++){
        if(num[count]<max && num[count]>secmax){
            secmax=num[count];
        }
    }
    /*
 for( int nums:num)
 {
     if(nums<max && nums>secmax)
     {
     secmax=nums;
     }
 }
    */
    System.out.println("second highest :"+secmax);
    }
}
