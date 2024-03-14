import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String>  currentCourses = new ArrayList<>();


    // CONNSTRUCTOR
    // VARS INSIDE THE C, BELONGS TO C, AND ARE THUS LOCAL.
    public Student(String name, ArrayList<String> passedCourses)
    {
        super(name);
        this.passedCourses = passedCourses;
    }

    @Override
    public boolean addCourse(String courseName) // aaddCourse("English");
    {
        if(passedCourses.contains(courseName))
            {
                return false;
            }
        else
        {
            currentCourses.add(courseName);
            return true;
        }
    }
}
