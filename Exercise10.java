import java.util.Scanner;
class Exercise10{
	public static void main(String [] args){
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age");
        age= sc.nextInt();
        String output="";
        if(age<1 || age >120){
            output="invalid age";
        }
        else if(age<=12){
            output="kid";
        }
        else if(age<=19){
          output="teen";  
        }
        else if(age<60){
            output="adult";
        }
        else if(age<=120){
            output="senior citizen";
        }
        System.out.println(output);
	}
}