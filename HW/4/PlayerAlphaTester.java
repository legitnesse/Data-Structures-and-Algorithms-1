public class PlayerAlphaTester 
{
    public static void main(String[] args) {
        PlayerAlpha p1 = new PlayerAlpha(true);
        PlayerAlpha p2 = new PlayerAlpha(false);

        System.out.print("p1");
        p1.printPlayer();
        System.out.print("p2");
        p2.printPlayer();

        System.out.println("p2 tries to pass the ball to p1");
        p2.passBall(p1);
        System.out.print("p1");
        p1.printPlayer();
        System.out.print("p2");
        p2.printPlayer();
        
        System.out.println("p1 tries to pass the ball to p2");
        p1.passBall(p2);
        System.out.print("p1");
        p1.printPlayer();
        System.out.print("p2");
        p2.printPlayer();
    }
    
}