import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CourseArray {
    public ArrayList<String> courses = new ArrayList<String>(); // Store course names in this attribute


    CourseArray() {
        // Empty, but still needed.
    }

    /*
     * Copy constructor — new object with the same data as 'other'
     */
    CourseArray(CourseArray other) {
        courses.addAll(other.courses);     // Copy items from 'other' to this object
    }

    /*
     * selectionSort – implements the Selection Sort algorithm.
     *
     * Input: none
     * Output: none
     * Side effect: sorts the 'courses' attribute
     * Time complexity: quadratic in the number of elements in 'courses' array.
     */
    public void selectionSort() {
        // To implement
    }


    /*
     * mergeSort - implements the Merge Sort algorithm
     *
     * Input: none
     * Output: none
     * Side effect: sorts the 'courses' attribute
     * Time complexity: O(n lg n) comparisons, where n is the number of elements in the course array.
     */
    public void mergeSort() {
        // To implement
    }

    /*
     * javaSort - use Java's library support for sorting.
     *
     * Input: none
     * Output: none
     * Side effect: sorts the 'courses' attribute
     */
    public void javaSort() {
        // To implement
    }


    /*
     * loadData - Convenience function. Reads lines from stdin and put them in 'courses'.
     */
    private void loadData() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String c = sc.nextLine();
            courses.add(c);
        }
    }

    public boolean sorted() {
        for (int i=1; i<courses.size(); i++) {
            if (courses.get(i).compareTo(courses.get(i-1)) < 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // We create 3 CourseArray objects. They contain the same
        // data, but we can apply three different sorting algorithms on them independently.
        CourseArray courses1 = new CourseArray();
        courses1.loadData();    // Read course names from stdin

        CourseArray courses2 = new CourseArray(courses1); // Copy the data to two more arrays using the copy-constructor
        CourseArray courses3 = new CourseArray(courses1);

        long checkpoints[] = new long[4]; // To store timestamps in
        // Start tests
        checkpoints[0] = System.currentTimeMillis();
        courses1.selectionSort();
        checkpoints[1] = System.currentTimeMillis();
        courses2.mergeSort();
        checkpoints[2] = System.currentTimeMillis();
        courses3.javaSort();
        checkpoints[3] = System.currentTimeMillis();

        // Ensure correct sorting
        if (!courses1.sorted()) {
            System.out.println("courses1 is not sorted");
        }
        if (!courses2.sorted()) {
            System.out.println("courses2 is not sorted");
        }
        if (!courses3.sorted()) {
            System.out.println("courses3 is not sorted");
        }

        String algs[] = {"", "selectionSort", "mergeSort", "javaSort"};
        // Output timing results
        for (int i=1; i<4; i++) {
            System.out.format("Time for task %s: %d ms", algs[i], checkpoints[i] - checkpoints[i-1]);
            System.out.println();
        }
    }
}
