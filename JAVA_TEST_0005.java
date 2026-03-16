
public class JAVA_TEST_0005 {

    public static void printPattern(int rows) {
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                if (j < i) {
                    System.out.print(" ");
                }
                number++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
 
