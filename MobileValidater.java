import java.util.Scanner;

class Mobile
    {
        public String mob;
        public String getInput()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Sample-Input");
            mob=sc.nextLine();
            return mob;
        }
public boolean validatePhoneNumber(String mob1)
    {
        boolean value;
        int len=mob1.length();
        int check=0;
        int count=0;
for(int i=0;i<mob1.length();i++)
    {
        if(Character.isDigit(mob1.charAt(i)))
        {
            check++;
        }
        else if(mob1.charAt(i)!='-')
        {
            count++;
        }
    }
    if(check==10 && count==0)
    {
        value=true;
    }
    else{
        value=false;
        }
return value;
    }
public void displayResult(boolean result)
{
if(result)
    {
        System.out.println("Expected Output");
        System.out.println("Valid");
    }
else
    {
        System.out.println("Expected Output");
        System.out.println("InValid");
    }
}
}
class MobileValidater
{
public static void main(String []args)
{
Mobile m1=new Mobile();
String mob3=m1.getInput();
boolean res=m1.validatePhoneNumber(mob3) ;
m1.displayResult(res);
}
}