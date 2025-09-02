import java.util.*;
class Revstr
{
    public static void main(String[] args){
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("Original string is: "+s1);
        System.out.println("Reverse string is: ");
        for(int i=s1.length()-1;i>=0;i--)
        System.out.print(s1.charAt(i));
    }
}
