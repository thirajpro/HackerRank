package HackerRank;

import java.util.Scanner;

public class RectangleQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breadth;
        int width;
        for (;;){
            System.out.print("Enter breadth: ");
            breadth = scanner.nextInt();
            System.out.print("Enter width: ");
            width = scanner.nextInt();
            int area = breadth*width;
            int perimeter = 2*(breadth + width);
            System.out.println("Area: " + area +" " + "Perimeter : " + perimeter);
            if(area>perimeter){
            break;
            }else {
                continue;
            }
        }
    }
}
