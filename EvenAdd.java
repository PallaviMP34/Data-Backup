import java.util.Scanner;

class EvenAdd{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        int []numbers=new int[size];
        System.out.println("enter the numbers:");
        int sum=0;
for(int count=0;count<size;count++)
{
    numbers[count]=sc.nextInt();
}
for(int count1=0;count1<size;count1++)
{
if(numbers[count1]%2==0)
{
sum=sum+numbers[count1];
}
}
System.out.println("sum="+sum);
 }
}