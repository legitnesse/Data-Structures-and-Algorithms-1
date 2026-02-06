import java.util.ArrayList;
import java.util.Random;

public class Hogwarts 
{
    
    private House Gryffindor = new House("Gryffindor");
    private House Hufflepuff = new House("Hufflepuff");
    private House Ravenclaw = new House("Ravenclaw");
    private House Slytherin = new House("SLytherin");
    private ArrayList<Student> students = new ArrayList<Student>();

    public void newStudents()
    {
        for(int i = 0; i < 100; i++)
        {
            students.add(new Student());
        }
    }
    public void hatSorts()
    {
        Random r = new Random();
        for(int i = 0; i < students.size(); i++)
        {
           if(students.get(i).getPotential() % 2 == 0) 
           {
                if(r.nextInt(2) == 0)
                {
                    Hufflepuff.addStudent(students.get(i));
                    students.remove(i);
                }
                else
                {
                    Ravenclaw.addStudent(students.get(i));
                    students.remove(i);
                }
           }
           else
           {
            if(r.nextInt(2) == 0)
                {
                    Gryffindor.addStudent(students.get(i));
                    students.remove(i);
                }
                else
                {
                    Slytherin.addStudent(students.get(i));
                    students.remove(i);
                }
           }
        }
    }
    public void printAveragePotentials()
    {
        newStudents();
        hatSorts();
        System.out.println("The average potential of Gryffindor is: " + Gryffindor.getHousePotential() / Gryffindor.getStudents().size());
        System.out.println("The average potential of Hufflepuff is: " + Hufflepuff.getHousePotential() / Hufflepuff.getStudents().size());
        System.out.println("The average potential of Ravenclaw is: " + Ravenclaw.getHousePotential() / Ravenclaw.getStudents().size());
        System.out.println("The average potential of Slytherin is: " + Slytherin.getHousePotential() / Slytherin.getStudents().size());
    }
}
