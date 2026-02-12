public class GenericTrain<T>
{
    private Object[] cars;
    private int currentNumberOfCars;

    public GenericTrain()
    {
        cars = new Object[5];
        currentNumberOfCars = 0;
    }
    public void doubleTrainCapacity()
    {
        Object[] temp = new Object[cars.length*2];
        for(int i = 0; i < cars.length; i++)
        {
            temp[i] = cars[i];
        }
        cars = temp;
    }

    public int getCurrentNumberOfCars()
    {
        return currentNumberOfCars;
    }
    public void addCar(T inputCarObject)
    {
        if(currentNumberOfCars == cars.length)
        {
            doubleTrainCapacity();
        }
        cars[currentNumberOfCars] = inputCarObject;
        currentNumberOfCars++;
    }
    public void addCar(T inputCarObject, int newCarIndex)
    {
        if(newCarIndex > currentNumberOfCars)
        {
            return;
        }
        else if(newCarIndex == currentNumberOfCars)
        {
            addCar(inputCarObject);
            return;
        }
        else
        {
            for(int i = currentNumberOfCars; i > newCarIndex; i--)
            {
                cars[i] = cars[i - 1];
            }
            cars[newCarIndex] = inputCarObject;
            currentNumberOfCars++;
        }
    }
    public void removeCar()
    {
        cars[currentNumberOfCars] = null;
        currentNumberOfCars--;
    }
    public void removeCar(int oldCarIndex)
    {
        if(oldCarIndex > currentNumberOfCars)
        {
            return;
        }
        else if (oldCarIndex == currentNumberOfCars)
        {
            removeCar();
            return;
        }
        else
        {
            for(int i = oldCarIndex; i < currentNumberOfCars; i++)
            {
                cars[i] = cars[i + 1];
            }
            currentNumberOfCars--;
            return;
        }
    }
    public void replaceCar(String inputCarString, int newCarIndex)
    {
        cars[newCarIndex] = inputCarString;
    }
    public Object getCar(int carIndex)
    {
        return cars[carIndex];
    }
    public Object[] getCars()
    {
        return cars;
    }
    public void resetTrain()
    {
        cars = new String[5];
        currentNumberOfCars = 0;
    }
    public Boolean checkForCar(String inputCarString)
    {
        for(int i = 0; i < currentNumberOfCars; i++)
        {
            if(cars[i].equals(inputCarString))
            {
                return true;
            }
        }
        return false;
    }
    public int countCarType(String inputCarString)
    {
        int numberOfCarType = 0;
        for(int i = 0; i < currentNumberOfCars; i++)
        {
            if(cars[i].equals(inputCarString))
            {
                numberOfCarType++;
            }
        }
        return numberOfCarType;
    }
    public GenericTrain<T> cloneTrain()
    {
        GenericTrain<T> clonedTrain = new GenericTrain<>();
        Object[] clonedCars = new Object[cars.length];
        for(int i = 0; i < currentNumberOfCars; i++)
        {
            clonedCars[i] = cars[i];
        }
        clonedTrain.cars = clonedCars;
        clonedTrain.currentNumberOfCars = this.currentNumberOfCars;
        return clonedTrain;
    }
    public void printTrain()
    {
        if(currentNumberOfCars == 0)
        {
            System.out.println("There are currently no cars on this train.");
        }
        if(currentNumberOfCars == 1)
        {
            System.out.println("[" + cars[currentNumberOfCars - 1] + "]");
        }
        else
        {
            System.out.print("[");
            for(int i = 0; i < currentNumberOfCars - 1; i++)
            {
                System.out.print(cars[i] + ", ");
            }
            System.out.println(cars[currentNumberOfCars - 1] + "]");
        }
    }   
}

