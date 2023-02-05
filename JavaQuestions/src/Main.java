import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] array = {1,2,6,4,2};
        int [] afterSort= new int[5];
        int max= 0;
        for(int i = 0; i<array.length;i++){
            for (int j=0;j<afterSort.length;j++){
                if(max<array[i]){
                    max=array[i];
                    afterSort[j]=array[i];

                }else if (max>array[i]){
                    afterSort[j]=max;
                }
            }
        }
        System.out.println(Arrays.toString(afterSort));
        System.out.println("Hello world!");
    }
}