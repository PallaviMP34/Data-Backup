import java.util.Scanner;
class ShortestWord{
	public static void main(String [] args){
String word[] = {"Atrocity", "Pensive", "Imperceptible", "Discordant" };
String words=word[0];
int len=word[0].length();
for (int i = 1; i <4; i++){
     if ( word[i].length()<len){
            len= word[i].length();
            words=word[i];
    
        }
    }
    System.out.printf(words);
}
}