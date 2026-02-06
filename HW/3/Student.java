import java.util.Random;

public class Student 
{
    private int mainCharacterPotential;

    public Student()
    {
        Random r = new Random();
        mainCharacterPotential = r.nextInt(0, 101);
    }
    public int getPotential()
    {
        return mainCharacterPotential;
    }
}
    
