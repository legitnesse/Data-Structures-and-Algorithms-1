public class PlayerGammaTester 
{
    public static void main(String[] args) 
    {
        PlayerGamma p1 = new PlayerGamma(1, true);
        String startDist = String.format("%.2f", p1.getDistFrom());
        int runs = 1;
        while(p1.getDistFrom() > 0)
        {
            
            if(p1.runWithBall() == false)
            {
                runs++;
            }
        }
        System.out.println("Player " + p1.getNum() + " ran " + runs + " time(s) and " + startDist + 
            " yards total.");
    }
}
