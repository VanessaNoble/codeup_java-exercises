/**
 * Created by vanessamnoble on 1/12/17.
 */
//Display a sorted list of student scores.
//
//        The application accepts last name, first name, and score for one or more students and stores the results in an array.
//        The application prints the student name and their score alphabetically by last name.
//        The program should implement a class called Student that stores last name, first name, and score for each student.
//        The class should implement the Comparable interface so that students can be sorted by name.
//        The program should you an Array to store Student objects. It should sort the array prior to printing the student list.
//        Validate user input so that the number of students can only be a positive integer,
//        the last name and first name values cannot be empty Strings, and the score is an integer from 0 and 100.
import java.util.*;

public class sortingStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numofstudents = input.nextInt();
        String[] names = new String[numofstudents];
        int[] array = new int[numofstudents];
        for(int i = 0; i < numofstudents; i++) {
            System.out.print("Enter the student's name: ");
            names[i] = input.next();
            System.out.print("Enter the student's score: ");
            array[i] = input.nextInt();
        }
        selectionSort(names, array);
        System.out.println(Arrays.toString(names));
    }
    public static void selectionSort(String[] names, int[] array) {
        for(int i = array.length - 1; i >= 1; i--) {
            String temp;
            int currentMax = array[0];
            int currentMaxIndex = 0;
            for(int j = 1; j <= i; j++) {
                if (currentMax > array[j]) {
                    currentMax = array[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                temp = names[currentMaxIndex];
                names[currentMaxIndex] = names[i];
                names[i] = temp;
                array[currentMaxIndex] = array[i];
                array[i] = currentMax;
            }
        }
    }
}


