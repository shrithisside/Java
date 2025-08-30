package codes.basics;

public class types {
    public static void main(String[] args) {
        // PRIMITIVE TYPES:
        // byte - 1 [ -128 to 127]
        // short - 2
        // int - 4 [1,2,3 ....]
        // long - 8
        // float - 4
        // double - 8
        // char - 2 [a,b,c,d.....]
        // boolean - 1 [true or false]
        byte age = 30;
        int phone = 8910;
        long phone2 = 8910944852L;
        float pi = 3.14F;
        char letter = 'a';
        boolean isAdult = true;

        //NON PRIMITIVE TYPES:
        //String
        String name = "Shriwayanta";
        String surname = "Maiti";
        System.out.println(name+' '+surname);
        //charAt
        System.out.println(name.charAt(0));
        //length
        System.out.println(name.length());
        //replace
        String new_name = name.replace("a","x");
        System.out.println(new_name);
        //substring
        String names = "Aman and Akku";
        System.out.println(names.substring(0,6));
    }
}
