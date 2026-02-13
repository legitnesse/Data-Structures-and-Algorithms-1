public class Cabin
{
    private String passengerName;
    private Cabin nextCabin;

    public Cabin()
    {
        passengerName = null;
        nextCabin = null;
    }

    public void setPassengerName(String inputPassengerName)
    {
        passengerName = inputPassengerName;
    }
    public String getPassengerName()
    {
        return passengerName;
    }
    public Cabin getNextCabin()
    {
        return nextCabin;
    }
    public void setNextCabin(Cabin inputCabin)
    {
        nextCabin = inputCabin;
    }
}
