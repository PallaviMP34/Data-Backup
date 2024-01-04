import java.util.Scanner;
class ArrayNames{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size");
    int size=sc.nextInt();
   String [] name=new String[size];
       System.out.println("Enter the names");
    
   
    for(int count=0;count<size;count++){
         name[count]=sc.next();
         //name[count]=sc.next()+sc.nextLine();
        
    }
  
   for(var nums:name)
    System.out.println(nums);
    }
}