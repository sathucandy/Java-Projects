package studentdatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor prompt user to enter students name and year
	public Student() {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior \nEnter student class level: ");
		this.gradeYear = in.nextInt();

		setStudentID();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}

	// Generate an id
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;

	}

	// Enroll in courses
	public void enroll() {
		// Get inside a a loop, user hits 0
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
	}

	// View Balance
	public void viewBalance() {
		System.out.println("Your balance is: Rs" + tuitionBalance);
	}

	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: Rs");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of Rs" + payment);
		viewBalance();
	}

	// Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + "\nGrade Level:" + gradeYear +"\nCourses Enrolled:" + courses + "\nBalance: Rs"
				+ tuitionBalance;
	}

}
