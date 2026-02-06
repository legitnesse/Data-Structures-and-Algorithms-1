public class MovingX
{
    private int numRows;
    private int numCols;
    
    public MovingX(int r, int c)
    {
        numRows = r;
        numCols = c;
    }
    public void forLoops()
    {
        for(int y = 0; y < numRows; y++)
        {
            for(int x = 0; x < numCols; x++)
            {
                for(int j = 0; j < numRows; j++)
                {
                    for(int i = 0; i < numCols; i++)
                    {
                        if(i == x && j == y)
                        {
                            System.out.print("[x]");
                        }
                        else
                        {
                            System.out.print("[ ]");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            } 
        }
    }
    
    public void array()
    {
        String[][] position = new String[numRows][numCols];
        for(int y = 0; y < numRows; y++)
        {
            for(int x = 0; x < numCols; x++)
            {
                position[y][x] = "x";
                if(x != 0)
                {
                    position[y][x - 1] = null;
                }
                for(int j = 0; j < numRows; j++)
                {
                    for(int i = 0; i < numCols; i++)
                    {
                        if(position[j][i] == null)
                        {
                            System.out.print("[ ]");
                        }
                        else
                        {
                            System.out.print("[" + position[j][i] +"]");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
                if(x == numCols - 1)
                {
                    position[y][x] = null;
                }
            }
        }  
    }
}