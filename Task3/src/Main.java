import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        ArrayList<Person> listOfTeachersStudents = new ArrayList<>();

        // STUDENT ARRAYS
        ArrayList<String> studentOnePassedCourses = new ArrayList<>();
        studentOnePassedCourses.add("Marketing strategy");
        studentOnePassedCourses.add("Spanish");

        ArrayList<String> studentTwoPassedCourses = new ArrayList<>();
        studentTwoPassedCourses.add("Life coaching");

        ArrayList<String> studentThreePassedCourses = new ArrayList<>();
        studentThreePassedCourses.add("Business economics");
        studentThreePassedCourses.add("Marketing strategy");
        studentThreePassedCourses.add("Mandarin");

        // TEACHER ARRAYS
        ArrayList<String> currentCourses = new ArrayList<>();
        currentCourses.add("EngelskCourse");

        ArrayList<String> teacherOneSubjects = new ArrayList<>();
        teacherOneSubjects.add("Dansk");
        teacherOneSubjects.add("Engelsk");

        ArrayList<String> teacherTwoSubjects = new ArrayList<>();
        teacherTwoSubjects.add("Spanish");
        teacherTwoSubjects.add("Marketing strategy");
        teacherTwoSubjects.add("Life coaching");

        ArrayList<String> teacherThreeSubjects = new ArrayList<>();
        teacherThreeSubjects.add("Life coaching");
        teacherThreeSubjects.add("Business economics");
        teacherThreeSubjects.add("philosophy");
        teacherThreeSubjects.add("Marketing");
        teacherThreeSubjects.add("Team management");

        // STUDENTS

        Student studentOne = new Student("Martin", studentOnePassedCourses);
        Student studentTwo = new Student("Mo", studentTwoPassedCourses);
        Student studentThree = new Student("Sammy", studentThreePassedCourses);


        /*

        alternativ måde at tilføje strings (courses) i instansieringen af constructor
        Teacher teacherOne = new Teacher("Brian", ArrayList<String>(Arrays.asList("Course1, course2"))
         */

        //

        Teacher teacherOne = new Teacher("Brian", currentCourses, teacherOneSubjects);
        Teacher teacherTwo = new Teacher("Sara", currentCourses, teacherTwoSubjects);
        Teacher teacherThree = new Teacher("Mikkel", currentCourses, teacherThreeSubjects);

        listOfTeachersStudents.add(teacherOne);
        listOfTeachersStudents.add(teacherTwo);
        listOfTeachersStudents.add(teacherThree);
        listOfTeachersStudents.add(studentOne);
        listOfTeachersStudents.add(studentTwo);
        listOfTeachersStudents.add(studentThree);


        for (int i = 0; i<listOfTeachersStudents.size();i++)
        {
            System.out.println(studentOne.addCourse("Spanish"));
            studentOne.addCourse("Mandarin");

            System.out.println(studentTwo.addCourse("Marketing strategy"));
            System.out.println(studentTwo.addCourse("Life coaching"));

            System.out.println(studentThree.addCourse("Mandarin"));
            System.out.println(studentThree.addCourse("Life coaching"));
        }

    }
}