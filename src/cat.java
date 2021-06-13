public class cat {
    private boolean full;
    private String name;
    private int appetite;

    public cat(String name,int appetite)
    {
        full = false;
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(plate plate)
    {
        if(plate.enoughfood(appetite) && !full)
        {
            System.out.println(name + "кушает");
            plate.decreasefood(appetite);
            full = true;
        }
        else if (!plate.enoughfood(appetite))
        {
            System.out.println(name + "еда закончилась" );
        }
        else if(full)
        {
            System.out.println(name + "уже поел");
        }

    }

}
