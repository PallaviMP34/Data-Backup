import java.util.Scanner;
class Pattern2{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
    int num=sc.nextInt();
    for(int row=1;row<= num;row++){
        for(int col=1;col<= row;col++){
           if((col+row )% 2 == 0 )  {
         System.out.print("1  ");
             }
             else  {
                 
                 System.out.print("0 ");
             }
            
         }
       System.out.println();  
    }
    
    
	}
}