public class worker {
    String name;
    String position;
    String email;
    String mobnumber;
    float salary;
    int age;

    worker(String name,
            String position,
            String email,
            String mobnumber,
            float salary,
            int age)
    {
        this.name=name;
        this.position=position;
        this.email=email;
        this.mobnumber=mobnumber;
        this.salary=salary;
        this.age=age;
    }
    void printout()
    {
        System.out.println("фио" + " " + name);
        System.out.println("должность" + " " + position);
        System.out.println("e-mail" + " " + email);
        System.out.println("телефон" + " "  +mobnumber);
        System.out.println("зп" +  " " + salary);
        System.out.println("возраст" + " " +age);
    }
}
