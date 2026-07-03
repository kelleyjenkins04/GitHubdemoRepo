import java.util.Scanner;
public class AreaProgram {

    static final double PI = 3.14;
    static final double areaFormulaConstant = .5;
    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int option;
/**
 * @param keyboard the Scanner
 */
    do {
        System.out
                  .print("=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n");
        System.out.print("Enter the desired option[1-4]: ");

        option = keyboard.nextInt();

        double area = 0;

        if (option == 1)
        {
            double sideLengthA;
            double sideLengthB;

            System.out.println( "Enter side length 1: ");
            sideLengthA = keyboard.nextDouble();

            System.out.println( "Enter side length 2: ");
            sideLengthB = keyboard.nextDouble();

            area = sideLengthA * sideLengthB;

            System.out.println( "Area = " + area);
        }else if (option == 2)
        {
            double radius; 

            System.out.println( "Enter in the radius: ");
            radius = keyboard.nextDouble();

            area = radius * PI * radius;

            System.out.println( "Area = " + area);
        }else if(option == 3)
        {
            double base;
            double height;

            System.out.println( "Enter in the base: ");
            base = keyboard.nextDouble();

            System.out.println( "Enter in the height: ");
            height = keyboard.nextDouble();

            area = base * height * areaFormulaConstant;

            System.out.println( "Area = " + area);
        }
    } while (option != 4);

    keyboard.close();

    }
}