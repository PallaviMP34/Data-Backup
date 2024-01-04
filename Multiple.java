import java.util.Scanner;
class Multiple{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
    int multiple=0;
    int count;
	System.out.println("Enter a number");
     int num=sc.nextInt();
    for(count=1;count<=10;count++){
        
        
         multiple=num*count;
         
         System.out.println(num+"*"+count+"="+multiple);
         }
    } 
    }
    
	/*int count=1;
    while(count<=10){
        multiple=count*num;
        System.out.println(num+"*"+count+"="+multiple);
        count++;
    }
    */