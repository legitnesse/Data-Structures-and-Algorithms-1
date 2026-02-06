public class PlayerAlpha
{
    private Boolean hasBall;

    public PlayerAlpha(Boolean h)
    {
        hasBall = h;
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
        if(getHasBall())
        {
            System.out.println("The player has the ball.");
        }
        else
        {
            System.out.println("The player does not have the ball.");
        }
    }
    public void passBall(PlayerAlpha p)
    {
        if(hasBall == false)
        {
            System.out.println("The thrower does not have a ball to pass.");
        }
        else if(p.getHasBall() == true)
        {
            System.out.println("The catcher already has a ball.");
        }
        else
        {
            System.out.println("The pass was successful!");
            setHasBall(false);
            p.setHasBall(true);
        }
    }
}