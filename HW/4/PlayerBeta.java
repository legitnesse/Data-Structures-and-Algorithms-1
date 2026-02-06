import java.util.Random;

public class PlayerBeta 
{
    private int num;
    private double prob;
    private Boolean hasBall;

    public PlayerBeta(int n, Boolean h)
    {
        Random r = new Random();
        num = n;
        prob = r.nextDouble();
        hasBall = h;
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
    public void printPlayer()
    {
        if(hasBall)
        {
            System.out.println("Player " + num + " has a " + (int)(prob * 100) + "chance of successfully passing and currently has the ball"); 
        }
        else
        {
           System.out.println("Player " + num + " has a " + (int)(prob * 100) + "chance of successfully passing and currently does not have the ball");  
        }
    }
    public Boolean passBall(PlayerBeta p)
    {
        if(hasBall == false)
        {
            System.out.println("Player " + num + " does not have a ball to pass.");
            return false;
        }
        else if(p.getHasBall() == true)
        {
            System.out.println("Player " + p.getNum() + " already has a ball");
            return false;
        }
        else
        {
            Random r = new Random();
            if(r.nextDouble() < prob)
            {
                System.out.println("Player " + num + " succeeded in passing to Player " + p.getNum());
                setHasBall(false);
                p.setHasBall(true);
                return true;
            }
            else
            {
                System.out.println("Player " + num + " failed in passing to Player " + p.getNum());
                setHasBall(false);
                return false;
            }
        }
    }
}
