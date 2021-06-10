package homework6;

public class factory {
    private int animalcount;
    private int dogscount;
    private int catcount;

    public factory()
    {
        animalcount = 0;
        dogscount = 0;
        catcount = 0;
    }
    public cat newcat(int limitrun)
    {
        cat cat = new cat(limitrun);

        animalcount++;
        catcount++;

        return cat;

    }
    public dog newdog(int limitswim, int limitrun)
    {
        dog dog = new dog(limitrun,limitswim);

        animalcount++;
        dogscount++;

        return dog;
    }
    public int getAnimalcount()
    {return animalcount;}
    public int getDogscount()
    {return dogscount;}
    public int getCatcount()
    {return catcount;
    }

}
