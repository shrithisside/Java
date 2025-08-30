package codes.basics;

public class casting {
    public static void main(String[] args) {
        //casting means to convert one datatype to another as long as they are compatible
        // it is of 2 types: a) implicit, b) explicit

        //IMPLICIT CASTING
        double price = 100.00;
        double FinalPrice = price + 18; // here the 18 is integer which the double can handle
        System.out.println("Price is " + FinalPrice);


        //EXPLICIT CASTING
        int p = 100;
        int fp = p + (int)18.0; // here 18.0 is double(8 bits) which exceeds the storage limit integer(4 bits)
        int sp = p + (int)18.18;// here there will bw data loss of .18 because of int type
        System.out.println("Price is " + fp + " and " + sp);
    }
}
