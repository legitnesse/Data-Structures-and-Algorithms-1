public class Pokemon
{
    private String name;
    private int HP;

    public Pokemon(String inputName, int inputHP)
    {
        name = inputName;
        HP = inputHP;
    }
    public int getHP()
    {
        return HP;
    }
    public void setHP(int newHP)
    {
        HP = newHP;
    }
    public void printHP()
    {
        System.out.println(getName() + " has " + getHP() + " HP.");
    }
    public String getName()
    {
        return name;
    }
    public void attack(Pokemon p)
    {
        
    }
        
}