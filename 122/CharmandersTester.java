public class CharmandersTester
{
    public static void main(String[] args) {
        Charmanders ch1 = new Charmanders();
        Charmanders ch2 = new Charmanders();

        System.out.println("ch1 HP: " + ch1.getHP());
        System.out.println("ch2 HP: " + ch2.getHP());

        System.out.println(ch1.scratch(ch2));
        System.out.println(ch1.scratch(ch2));
        System.out.println(ch1.scratch(ch2));


        System.out.println("ch1 HP: " + ch1.getHP());
        System.out.println("ch2 HP: " + ch2.getHP());
    }
}