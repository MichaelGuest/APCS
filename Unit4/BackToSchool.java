package BackToSchool;

public class BackToSchool {
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}

class Person {
    private String myName;
    private int myAge;
    private String myGender;

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}

class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age, String gender,
                   String idNum, double gpa) {
        super(name, age, gender);
        
        myIdNum = idNum;
        myGPA = gpa;
    }

    public String toString() {
        return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
    }
}

class Teacher extends Person {
    private String mySubject = "";
    private double mySalary = 0;

    public Teacher(String myName, int myAge, String myGender,
                   String subject, double salary) {
        super(myName, myAge, myGender);
        this.mySubject = subject;
        this.mySalary = salary;
    }

    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
    }
}

class CollegeStudent extends Student {
    private String myMajor = "";
    private int myYear = 0;

    public CollegeStudent(String myName, int myAge, String myGender, String myIDNum,
                          double myGPA, int year, String major) {
        super(myName, myAge, myGender, myIDNum, myGPA);
        this.myMajor = major;
        this.myYear = year;
    }

    public String toString() {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}




