public class Charmanders
{
    private int HP;

    public Charmanders()
    {
        HP = 50;
    }

    public int getHP()
    {
        return HP;
    }
    public void setHP(int newHP)
    {
        HP = newHP;
    }
    public String scratch(Charmanders ch)
    {
        ch.setHP(ch.getHP() - 10);
        return(this + " scratched " + ch + " for 10 damage.");
    }
}