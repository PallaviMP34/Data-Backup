import java.util.Scanner;
class ArrayBasics{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
   // int [] num=new int[];
    int [] num={20,10,9,12,32};
    /* System.out.println(num[0]);
    System.out.println(num[1]);
    System.out.println(num[2]);
    System.out.println(num[3]);
    System.out.println(num[4]);
    */
    // for(int index=0;index<num.length;index++){
    //    System.out.println(num[index]);
    for(int item:num){
        System.out.println(item);
    }
    }
    }
