import java.util.Scanner;
class Exercise8{
	public static void main(String [] args){
        char character;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character");
        character= sc.next().toLowerCase().charAt(0);
         if(character=='a' ||character=='e' || character=='i' ||character=='o' ||character=='u'){
             System.out.println(character+" is a vowel");
         }
         else{
             System.out.println(character+" is a constant");
         }
    }
}