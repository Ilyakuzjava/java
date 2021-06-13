public class plate {
    private int food;
    public plate(int food ){
        this.food = food;

    }
    public void decreasefood(int appetite){
        if(!enoughfood(appetite))
        {
            System.out.println("еды не хватает на запросы");
        }
        else
        {
            food = food - appetite;
        }

    }
    public boolean enoughfood(int appetite)
    {
        return appetite < food;
    }
    public void morefood(int amountoffood)
    {
        food += amountoffood;
    }

}
