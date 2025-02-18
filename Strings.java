public class Strings {
    public static void main(String[] args) {
        // String Manipulations and Methods

        // String Literal
        String str1 = "Hello";
        System.out.println(str1);

        // String Object
        String str2 = new String("World");
        System.out.println(str2);

        System.out.println(str1 + " " + str2);

//        String Methods
//                String Split()
//                String CompareTo()
//                String length()
//                String replace()
//                String contains()
//                String trim()
//                String concat()
//                String indexOf()
//
//

        System.out.println(str1.length());
        System.out.println(str1.charAt(3));
        System.out.println(str1.concat(str2));
        System.out.println(str1.substring(0,3));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.contains("Hello"));






    }
}
