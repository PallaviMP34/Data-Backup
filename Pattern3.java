import java.util.Scanner;
class Pattern3{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
    int num=sc.nextInt();
    for(int row=0;row<= num;row++){
        int number=5;
         for(int col=0;col<= row;col++){
             //int output= numbers-(col-1);
         System.out.print(number+" ");
         number--;
        
         }
         System.out.println();
    }
    
    
	}
}