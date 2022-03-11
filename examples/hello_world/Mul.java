import java.util.Scanner;


public class Mul {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNextLong()) {
	    long a = sc.nextLong(), b = sc.nextLong(); // Read two long integers
	    System.out.println(a*b);
	}
    }
}
