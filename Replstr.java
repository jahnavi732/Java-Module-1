import java.util.*;
class Replstr{
    public static void main(String[] args){
        String s2="";
        System.out.println("Enter a String: ");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("Entered string is: "+s1);
        s2=s1.replace('a','o');
        System.out.println("Replaced String is: "+s2);
    }
}