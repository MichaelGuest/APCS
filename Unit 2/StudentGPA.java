package StudentGPA;

import chn.util.ConsoleIO;

public class StudentGPA
{

	private String myName;
	private String myID;
	private int myTotalPoints;
	private int myNumGrades;
	private double myGPA;

	/**
	 * 
	 * @param name
	 * @param id
	 */
	public StudentGPA (String name, String id)
	{
		myName = name;
		myID = id;
		myTotalPoints = 0;
		myNumGrades = 0;
	}
	/**
	 * Adds Grades
	 * @param grade
	 */
	public void addGrade(int grade)
	{
		myTotalPoints += grade;
		myNumGrades++;
	}

	public double getGPA()
	{
		if(myNumGrades == 0)
		{
			return 0.0;
		}
		return myGPA = (double)
				myTotalPoints / myNumGrades;
	}
	

	
	//Main
	public static void main(String[] args)
	{

		int grade;

		ConsoleIO console = new ConsoleIO();

		System.out.print("Enter Student Name: ");
		String name = console.readLine();

		System.out.print("Enter Student ID: ");
		String id = console.readLine();

		StudentGPA gpa = new StudentGPA(name, id);
		System.out.println("initial GPA: " + gpa.getGPA());

		System.out.print("Enter a grade: ");
		grade = console.readInt();
		gpa.addGrade(grade);
		System.out.println("GPA: " + gpa.getGPA());

		System.out.print("Enter a grade: ");
		grade = console.readInt();
		gpa.addGrade(grade);
		System.out.println("GPA: " + gpa.getGPA());

		System.out.print("Enter a grade: ");
		grade = console.readInt();
		gpa.addGrade(grade);
		System.out.println("GPA: " + gpa.getGPA());

	}

}
