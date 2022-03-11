package courseinfo;

public class CourseInfo {

	public static void main(String[] args) {
		BinarySearchTree courses = new BinarySearchTree();
		
		courses.insert("DA3018", "Computer Science", 7.5);
		courses.insert("MM2001", "Matematik I", 30.0);
		courses.insert("DA2004", "Programmeringsteknik", 7.5);
		
		int n = courses.size();
		System.out.printf("There are %d courses in the database.\n", n);
		
		String name = courses.find("MM2001").getCourseName();
		System.out.printf("Name: %s\n", name);
	}

}
