public class PokemonBattle
{
    public static void main(String[] args) {
        CharmandersNew ch = new CharmandersNew("CharChar");
        Bulbasaur b = new Bulbasaur("Bulby");
        Squirtle sq = new Squirtle("Squirty");

        ch.printHP();
        b.printHP();
        sq.printHP();

        ch.attack(b);
        b.attack(sq);
        sq.attack(ch);

        ch.printHP();
        b.printHP();
        sq.printHP();
    }
}