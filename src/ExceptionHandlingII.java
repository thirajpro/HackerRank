import java.util.Scanner;

public class ExceptionHandlingII extends MyCalculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyCalculator myCal = new MyCalculator();
        try {
            for (int i = 0; i < 10; i++) {
                int x1 = scan.nextInt();
                int x2 = scan.nextInt();
                if ((x1 == 0) && (x2 == 0)) {
                    System.out.println("java.lang.Exception: n and p should not be zero");
                } else if ((x1 < 0) || (x2 < 0)) {
                    System.out.println("java.lang.Exception: n or p should not be negative");
                } else {
                    System.out.println(myCal.power(x1, x2));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
