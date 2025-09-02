import java.util.*;
class StChar{
    public static void main(String[] args){
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("Character present in First Index is: "+s1.charAt(0));
        System.out.println("Character present in Last Index is: "+s1.charAt(s1.length()-1));
    }
}