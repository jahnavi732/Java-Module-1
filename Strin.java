import java.util.*;
class Strin{
    public static void main(String[] args){
        System.out.println("Enter a String: ");
        Scanner sc= new Scanner(System.in);
        String st1=sc.nextLine();
        String st2=sc.nextLine();
        st1=st1.toUpperCase();
        st2=st2.toUpperCase();
        System.out.println(st1);
        System.out.println(st2);
        if(st1.equals(st2))
        System.out.println("Both the strings are equal");
        else
        System.out.println("Both the strings are not equal");
    }
}