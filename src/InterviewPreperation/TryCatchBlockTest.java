package InterviewPreperation;

public class TryCatchBlockTest {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        try {
            System.out.println(array[7]);
        }catch (Exception e){
            System.out.println(e);
            System.out.println(array[3]);

        } finally {
            System.out.println(array[3]);
        }
    }
}
