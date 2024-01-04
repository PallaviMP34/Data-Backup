import java.util.Scanner;
class Pattern4{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
    int num=sc.nextInt();
    for(int row=1;row<= num;row++){
       
         for(int col=num;col>= row;col--){
             //int output= numbers-(col-1);
            
         System.out.print(col+" ");
         
        
         }
         System.out.println();
    }
    
    
	}
}