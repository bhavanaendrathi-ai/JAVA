import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class ExaminationScoreManagement {

    public static void main(String[] args){

        int[] marks = {78,85,69,92,88};

        System.out.println("\nOne Demintional array: ");
        System.out.println("marks: " + Arrays.toString(marks));

        //length member
        System.out.println("number of subjects : " +marks.length);

        int[] copyMarks = marks;
        copyMarks[0] = 95;
        System.out.println("\nArray reference behavior: ");
        System.out.println("original array: "+Arrays.toString(marks));
        System.out.println("refernce array: "+Arrays.toString(copyMarks));

        //multiple dimensional
        int[][] StudentMarks = {
                {78,85,90},
                {65,72,80},
                {88,91,84}
        };

        System.out.println("\n 2 dimensional array: ");
        for(int i = 0; i < StudentMarks.length;i++){
            System.out.println("student "+(i + 1)+ ": "+Arrays.toString(StudentMarks[i]));
        }

        //irregular array
        int [][] irregularMarks = {
                {80,75},
                {90,85,88},
                {70,65,72,78}
        };
        for(int i = 0; i < irregularMarks.length;i++){
            System.out.println("student "+(i + 1)+ " wrote "+irregularMarks[i].length + " exam: " +Arrays.toString(irregularMarks[i]));
        }


        //array util class
        int[]  examScore = {76,92,68,85,80};

        System.out.println("\nArray util class: ");
        System.out.println("Before sorting: "+Arrays.toString(examScore));
        Arrays.sort(examScore);
        System.out.println("after sorting: " +Arrays.toString(examScore));

        int position = Arrays.binarySearch(examScore,85);

        System.out.println("postion of score 85 : "+position);

        //arraylist

        ArrayList<Integer> ScoreList = new ArrayList<>();
        ScoreList.add(75);
        ScoreList.add(82);
        ScoreList.add(91);

        System.out.println("\nArrayList: ");
        System.out.println("score: "+ ScoreList);
        ScoreList.add(88);
        System.out.println("after adding a score: "+ScoreList);
        System.out.println("number of scores: "+ScoreList);

        //vectors
        Vector<Integer> ScoreVector = new Vector<>();
        ScoreVector.add(70);
        ScoreVector.add(85);
        ScoreVector.add(90);
        System.out.println("\n Vectors");
        System.out.println("score: "+ ScoreVector);
        ScoreVector.add(95);
        System.out.println("after adding a score: "+ScoreVector);
        System.out.println("number of score: "+ScoreVector.size());
    }

}
