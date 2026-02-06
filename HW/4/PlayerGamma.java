import java.util.Random;

public class PlayerGamma 
{
    private int num;
    private double prob;
    private Boolean hasBall;
    private double distFrom;
    private double sprintDist;

    public PlayerGamma(int n, Boolean h)
    {
        Random r = new Random();
        num = n;
        prob = r.nextDouble();
        hasBall = h;
        distFrom = r.nextDouble() * 100;
        sprintDist = r.nextDouble() * 50;

    }
    public int getNum()
    {
        return num;
    }
    public double getProb()
    {
        return prob;
    }
    public Boolean getHasBall()
    {
        return hasBall;
    }
    public void setHasBall(Boolean h)
    {
        hasBall = h;
    }
    public double getSprintDist()
    {
        return sprintDist;
    }
    public double getDistFrom()
    {
        return distFrom;
    }
    public void printPlayer()
    {
        if(hasBall)
        {
            System.out.println("Player " + num + " has a " + (int)(prob * 100) + "chance of successfully passing, has a sprint distance of " + sprintDist + " yards, is currently " + distFrom + " yards from the endzone, and currently has the ball."); 
        }
        else
        {
           System.out.println("Player " + num + " has a " + (int)(prob * 100) + "chance of successfully passing, has a sprint distance of " + sprintDist + " yards, is currently " + distFrom + " yards from the endzone, and currently does not have the ball.");   
        }
    }
    public int passBall(PlayerGamma p)
    {
        if(hasBall == false)
        {
            System.out.println("Player " + num + " does not have a ball to pass.");
            return 2;
        }
        else if(p.getHasBall() == true)
        {
            System.out.println("Player " + p.getNum() + " already has a ball.");
            return 2;
        }
        else
        {
            Random r = new Random();
            if(r.nextDouble() < prob)
            {
                System.out.println("Player " + num + " succeeded in passing to Player " + p.getNum() + ".");
                setHasBall(false);
                p.setHasBall(true);
                return 1;
            }
            else
            {
                System.out.println("Player " + num + " failed in passing to Player " + p.getNum() + ".");
                setHasBall(false);
                return 0;
            }
        }
    }
    public Boolean runWithBall()
    {
        Random r = new Random();
        distFrom -= sprintDist;
        String sprintDistString = String.format("%.2f", sprintDist);
        System.out.println("Player " + num + " ran " + sprintDistString + " yards.");
        sprintDist = r.nextDouble() * 30;
        if(distFrom <= 0)
        {
            System.out.println("Player " + num + " made it to the endzone with the ball!");
            return true;
        }
        else
        {
            return false;
        } 
    }
}
