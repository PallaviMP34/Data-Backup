import java.util.Scanner;
class StringEqual{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=sc.nextLine();
    System.out.println("Enter other string");
    String str1=sc.nextLine();
    if((str.equalsIgnoreCase(str1))){
    System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    int difference=str.compareTo(str1);
    System.out.println(difference);
    System.out.println(str1.length());
    System.out.println(str1.charAt(3));
    System.out.println(str1.indexOf("a") );
    System.out.println(str1.contains("anu"));
    }
}