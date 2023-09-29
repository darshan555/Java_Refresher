public class Q25_Practice_Set {
    public static void main(String[] args) {

        // Question 1
        /*float[] number = {25.2f,25.6f,23.4f,74.2f,45.4f};
        float sum = 0;
        for (int i = 0; i<number.length ;i++){
            sum += number[i];
        }
        System.out.println(sum);*/

        // Question 2 check the value is available in array or not

        /*int[] number = {24,25,85,45,65};
        boolean isAvailable = false;
        int checkNumber = 9;
        for (int element:number) {
            if(element == checkNumber ){
                isAvailable = true;
            }
        }
        if (isAvailable){
            System.out.println("Value is available in array");
        }else {
            System.out.println("Value is not available in array");
        }*/


        // Question 3 Average of the marks
        /*int[] marks = {74,85,97,84,65};
        int sum = 0;
        for (int element:marks) {
            sum += element;
        }
        int average = sum/marks.length;
        System.out.println("Average is "+average);*/

        // Question 4 matrix sum
        /*int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
            }
            System.out.println(""); // Prints a new line
        }*/

        // Question 5 Print array in reverse order

        /*int[] value = {24,25,28,78};
        for(int i = value.length-1 ; i >= 0 ; i--){
            System.out.println(value[i]);
        }*/

        // Question 6 Print Maximum number

        /*int[] number = {25,471,85,96,54};
        int max = 0;

        for (int element:
             number) {
            if(element>max){
                max = element;
            }
        }
        System.out.println("Maximum number = "+max);*/

        // Question 7  Print Minimum number

        /*int[] value = {25,471,85,96,54};
        int min = 0;

        for (int element:
                value) {
            if(element>min){
                max = element;
            }
        }
        System.out.println("Minimum number = "+max);*/

        // Question 8  Array is sorted or not?

        int[] value = {2,45,780,98,101};
        boolean isSorted = true;

        for(int i = 0;i<value.length-1;i++){
            if(value[i]>value[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is not sorted");
        }


    }
}
