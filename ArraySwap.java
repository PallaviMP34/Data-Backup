import java.util.Scanner;
class ArraySwap{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size");
    int size=sc.nextInt();
   int [] num=new int[size];
       System.out.println("Enter the array");
       for(int count=0;count<size;count++){
         num[count]=sc.nextInt();
       }
    
   
    for(int i=0;i<size-1;i++)
    {
        for(int j=i+1;j<size;j++)
        {
            if(num[i]>num[j])
            {
            int temp=num[i];
            num[i]=num[j];
            num[j]=temp;
            }
        }
         
    }
   for(int newarray:num){ 
    System.out.println(newarray);
   }
    }
}