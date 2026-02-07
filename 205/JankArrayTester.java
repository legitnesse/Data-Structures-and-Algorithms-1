public class JankArrayTester 
{
    public static void main(String[] args) {
        JankArray JA = new JankArray();
        for(int i = 0; i < 20; i++)
        {
            JA.add(i);
            JA.print();
            JA.getSize();
        }
    }
}
