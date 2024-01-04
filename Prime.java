import java.util.Scanner;
class Prime{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
    int n= sc.nextInt();
    int check=0;
    for(int start=2; start<=n/2;start++){
        if(n%start==0){
            check++
            break;
        }
        if(n%start==0)
            System.out.println("not prime");
       
        }
        else{
            System.out.println(" prime");
           
        }
      
    }
    
    
        
    }
        
    /* boolean prime=true;
    for(int start=2; start<=n/2;start++){
        if(n%start==0){
            prime=false
            break;
        }
        if(prime){
            System.out.println(" prime");
       
        }
        else{
            System.out.println("not prime");
           
        }
      
    }
    */