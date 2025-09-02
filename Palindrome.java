import java.util.*;
class Palindrome{
    public static void main(String[] args){
        String s2="";
        System.out.println("Enter a string: ");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("Entered String is: "+s1);
        s1=s1.toUpperCase();
        for(int i=s1.length()-1;i>=0;i--){
        s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2))
        System.out.println("The Entered string is Palindrome");
        else
        System.out.println("The Entered string is not Palindrome");

    }
}