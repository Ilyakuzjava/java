public class mainworker {
    public static void main(String[] args){
        worker[] workers = {
                new worker(
                        "Ivan Ivanov Ivanovich",
                        "administrator",
                        "alala@mail.ru",
                        "8 911 111 11 11",
                        150000,
                        30),
                new worker(
                        "Ivan Ivanov Petrovich",
                        "director",
                        "aloha@mail.ru",
                        "8 911 111 11 22",
                        300000,
                        45),

                new worker(
                        "Vova Ivanov Ivanovich",
                        "designer",
                        "noba@mail.ru",
                        "8 911 111 11 33",
                        150000,
                        40),

                new worker(
                        "Gora Kirillov Ivanovich",
                        "cleaner",
                        "clean@mail.ru",
                        "8 911 111 11 44",
                        50000,
                        25),

        new worker(
                "Petr Petrov Ivanovich",
                "owner",
                "boss@mail.ru",
                "8 911 111 11 99",
                1500000,
                50),

        };
        int rightage = 40;
        for (worker worker:workers)
        {
            if(worker.age > rightage)
            {
                worker.printout();
                System.out.println();
            }
        }
    }
}

