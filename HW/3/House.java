import java.util.ArrayList;

public class House 
{
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();

    public House(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public ArrayList<Student> getStudents()
    {
        return students;
    }
    public void addStudent(Student s)
    {
        students.add(s);
    }
    public int getHousePotential()
    {
        int housePotential = 0;
        for(Student s: students)
        {
            housePotential += s.getPotential();
        }
        return housePotential;
    }
}
