public class main {
    public static void main(String[] args){
        cat[] cats = {
                new cat("дуся ",20),
                new cat("буся " , 15),
                new cat("боря ",40 )
        } ;

        plate plate = new plate(50);

        for(cat cat : cats){
            cat.eat(plate);
        }
        plate.morefood(30);

        for(cat cat : cats)
        {
            cat.eat(plate);
        }

    }

}
