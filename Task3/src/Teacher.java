import java.util.ArrayList;
import java.util.Arrays;

public class Teacher extends Person
{

    // BELONGS TO OBJECT
    public ArrayList<String> canTeach = new ArrayList<>();
    public ArrayList<String> currentCourses;

    // CONSTRUCTOR
    // VARS INSIDE THE C, BELONGS TO C, AND ARE THUS LOCAL.
    public Teacher(String name, ArrayList<String> currentCourses, ArrayList<String> canTeachFromOutside)
    {
        super(name);
        this.currentCourses = currentCourses;
        this.canTeach = canTeachFromOutside;
    }

    @Override
    public boolean addCourse(String courseName)
    {
        if (canTeach.contains((courseName)))
        {
            currentCourses.add(courseName);
            return true;
        }
        else
        {
            return false;
        }
    }


}
