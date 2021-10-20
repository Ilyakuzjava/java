
public class first {

    public static void main(String[] args) {
        first main = new first();
        String[][] correct = {
                {"1", "2", "3", "4"},
                {"1", "5", "3", "4"},
                {"1", "8", "3", "4"},
                {"1", "9", "2", "4"}
        };
        String[][] incorrect = {
                {"1", "2", "3", "4"},
                {"1", "B", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            main.ExceptionTest(correct);
            main.ExceptionTest(incorrect);
        } catch (ArrayException e) {
            e.printStackTrace();
        }

        try {
            main.SecondTest(correct);
            main.SecondTest(incorrect);
        } catch (ArrayException e) {
            e.printStackTrace();
        }
    }


    public void ExceptionTest(String[][] arr) throws ArrayException {
        if (arr.length != 4) throw new ArrayException("Not enough strings");
        for (int i = 0; i < arr.length; i++) {
           if (arr[i].length != 4) throw new ArrayException("Not enough columns");
            for (int j = 0; j < arr[i].length; j++) {
               System.out.print(arr[i][j]);

            }
            System.out.println();
        }
    }

    public void SecondTest(String[][] arr) throws ArrayException{
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(Integer.parseInt(arr[i][j]) >= 0) {
                    sum += Integer.parseInt(arr[i][j]);
                }else {
                    throw new ArrayException("Not correct symbols");
                }


            }
        }
        System.out.println();

        System.out.println(sum);

    }
}





