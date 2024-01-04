import java.util.Scanner;
class Fibinocci{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	int n1=1 , n2=1 ;
    
    System.out.print(n1+" " );
    while(n2<100){
        System.out.print(n2+ " ");
        int n3=n1;
        n1=n2;
        n2=n1+n3;
        
    }
        
    
	}
}