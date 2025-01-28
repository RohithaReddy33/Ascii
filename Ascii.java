import java.util.*;
public class Ascii {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the character:");
        char character = input.next().charAt(0);//charAt retrive the interger value of the index of a string 
        int asciiValue=(int) character;
        System.out.println(asciiValue);
        input.close();
    }   
}
