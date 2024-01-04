import java.util.Scanner;
class UniqueArray{
	public static void main(String [] args){
int [] empid = {101,105,106,107,109,109};
boolean value=true;
for(int i=0;i<empid.length;i++){
    for(int j=1;j<empid.length;j++){
        if(empid[i]==empid[j]){
            value=false;
        }
        else{
            value=true;
        }
    }
}
System.out.println(value);
}
}