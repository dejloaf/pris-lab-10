import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lecturer extends ResearchAssociate {

	public void teach() {
		// TODO - implement Lecturer.teach
		throw new UnsupportedOperationException();
	}

	public void makeStudyPlan() {
		// TODO - implement Lecturer.makeStudyPlan
		throw new UnsupportedOperationException();
	}

	public void getStudentMarks() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int numberOfStudents = scanner.nextInt();

		List<String> studentNames = new ArrayList<>();
		List<Integer> studentGrades = new ArrayList<>();
		List<String> gradeCategories = new ArrayList<>();

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter the name of student " + (i + 1) + ":");
			studentNames.add(scanner.next());

			System.out.println("Enter the numerical grade of student " + (i + 1) + ":");
			int studentGrade = scanner.nextInt();
			studentGrades.add(studentGrade);

			String gradeCategory;
			if (studentGrade < 50) {
				gradeCategory = "Fail";
			} else if (studentGrade <= 69) {
				gradeCategory = "Pass";
			} else if (studentGrade <= 89) {
				gradeCategory = "Good";
			} else if (studentGrade <= 100) {
				gradeCategory = "Excellent";
			} else {
				gradeCategory = "Invalid Grade";
			}

			gradeCategories.add(gradeCategory);
		}

		System.out.println("\nGrade Statistics:");

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println(studentNames.get(i) + ": " + studentGrades.get(i) + " - " + gradeCategories.get(i));
		}
	}
}