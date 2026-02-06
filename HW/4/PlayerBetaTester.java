public class PlayerBetaTester 
{
    public static void main(String[] args) 
    {
        PlayerBeta p1 = new PlayerBeta(1, true);
        PlayerBeta p2 = new PlayerBeta(2, false);
        int rounds = 0;
        while(p1.getHasBall() || p2.getHasBall()) 
        {
            if(p1.passBall(p2) == true)
            {
                rounds++;
                PlayerBeta temp = p1;
                p1 = p2;
                p2 = temp;
            }
        }
        System.out.println("They passed " + rounds + " time(s).");
    }  
}
