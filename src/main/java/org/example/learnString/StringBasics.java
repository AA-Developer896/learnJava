package org.example.learnString;

public class StringBasics {

    public static void main(String args[]) {

        // Ways to make String
        // String Literals  -- created in String Pool
        String str1 = "Java String";

        // String objects
        // By directly giving String value  --- Created in Heap
        String str2 = new String("Java String");

        // By Using Char array
        char c[] = {'A','B','C'};
        String str3 = new String(c);

        // By using Byte array
        byte b[] = {65,66,67,68};
        String str4 = new String(b,0,2); // AB

//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);


        /*---------------------------------------------------------------
        * String Pool
        *
        *
        *
        * */

        String str5 = "Java";
        String str6 = " Java   ";
        //str6 = "Java";
        str6 = str6.trim();
        System.out.println(str6 == str5); // "==" -- it simply checks if both the reference are pointing to same object
        System.out.println(str6.equals(str5));

        // sTRING METHODS

        String s = "Java";
        // Original String will not be modified (Immutable)-- new String will be created in the heap
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s);

        String s1 = "  Java      ";
        System.out.println(s1);
        s1 = s1.trim(); // remove leading and tailing spaces
        System.out.println(s1);

        // Sub String methods
        String sub = "Abhinav";
        System.out.println(sub.substring(2));
        System.out.println(sub.substring(2,6)); // starIndex = 2, end Index = 6-1

        // replace char in String
        String rep = "Abhinav";
       // System.out.println(rep.charAt(7)); //.StringIndexOutOfBoundsException
        System.out.println(rep.replace('a','p')); // it is case sensitive , it will replace only lower case 'a'


        // Concatination
        String firstName = "Abhinav";
        String lastName = "Anand";
        String fullName = firstName + " "+ lastName;
        String fullName1 = firstName.concat(" " + lastName).concat(lastName);
        System.out.println(fullName1);

        System.out.println(fullName);




    }
}
