package homework6;

public class main {
    public static void main(String[] args){
     factory factory = new factory();
     cat cat = factory.newcat(200);
     dog dog = factory.newdog(10,500);

     cat.run(188);
     cat.swim(2);

     dog.run(600);
     dog.swim(7);

        System.out.println("колво животных" + " " +  factory.getAnimalcount());
        System.out.println("колво собак" + " " +  factory.getDogscount());
        System.out.println("колво кот" + " " + factory.getCatcount());
    }
}
