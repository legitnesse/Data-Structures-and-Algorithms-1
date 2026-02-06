public class CharmandersNew extends Pokemon
{
    public CharmandersNew(String inputName)
    {
        super(inputName, 50);
    }
    public void printAttack(Pokemon target)
    {
        System.out.println(getName() + " Scratched " + target.getName() + " for 10 DMG.");
    }
    public void attack(Pokemon p)
    {
        p.setHP(p.getHP() - 10);
        printAttack(p);
    }
}