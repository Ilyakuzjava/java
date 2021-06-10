package homework6;

public class animal {
    private float rundistance;
    private float swimdistance;

    public animal(float rundistance,float swimdistance)
    {
        this.swimdistance = swimdistance;
        this.rundistance = rundistance;
     }
     public void run(float setdistance){
        if (setdistance > rundistance)
        {
            System.out.println("слишком много" + " " + setdistance);
            System.out.println("max" + " " + rundistance);
        }
        else
        {
            System.out.println("пробежал" + " " + setdistance);
        }
         System.out.println();
     }
     public void swim(float setdistance)
     {
         if ( setdistance > swimdistance)
         {
             System.out.println("слишком много плыть"+ " " + setdistance);
             System.out.println("может только" + " " +  swimdistance);
         }
         else
         {
             System.out.println("проплыл" + " " + setdistance);
         }
         System.out.println();
     }


}
