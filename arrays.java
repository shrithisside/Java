import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        //arrays in java
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        System.out.println(marks[0]);

        //length
        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);       //97,98,95
        Arrays.sort(marks);
        System.out.println(marks[0]);       //95,97,98

                //or

        int[] marks2 = {97, 98, 95};        // 1D array

        int[][] finalmarks = {{97, 98, 95}, {95, 95, 98}};      // 2D array
        System.out.println(finalmarks[0][1]);

    }
}
