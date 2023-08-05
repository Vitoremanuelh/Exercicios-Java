package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Program {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("student name: ");
		student.name = sc.nextLine();
		System.out.print("first quarter note: ");
		student.grade1 = sc.nextDouble();
		System.out.print("second quarter note: ");
		student.grade2 = sc.nextDouble();
		System.out.print("third quarter note: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		if(student.finalGrade() < 60.0) {
			System.out.print("FAILED");
			System.out.printf("MISSING %.2f%n POINT", student.missingPoints());
		}else {System.out.println("PASS");}
		sc.close();
	}
}
