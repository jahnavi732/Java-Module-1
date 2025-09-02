class Str{
    public static void main(String[] args){
        String a="Hello";
        String b="hello";
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.length());
        System.out.println(a.charAt(3));
        if(a.equals(b))
        System.out.println("a and b are equal");
        else
        System.out.println("a and b are not equal");
        if(a.equalsIgnoreCase(b))
        System.out.println("a and b are equal");
        else
        System.out.println("a and b are not equal");
    }
}