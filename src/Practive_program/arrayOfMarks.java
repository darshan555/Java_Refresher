package Practive_program;

public class arrayOfMarks {
    public static void main(String[] args){

            int[] marks = new int[5];
            marks[0] = 56;
            marks[1] = 57;
            marks[2] = 58;
            marks[3] = 59;
            marks[4] = 60;

            /*for(int i = 0;i<marks.length;i++){
                System.out.println(marks[i]);
            }*/

        //using for each loop
        for (int element:marks
             ) {
            System.out.println("value is :" +element);
        }


    }
}
