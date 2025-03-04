import java.util.Scanner;

public class ChapterEight {
    //8.1
/*    public static void main(String[] args) {
        System.out.println("enter a 3 by 4 matrix row by row: ");
        Scanner input = new Scanner(System.in);
        double [][] matrix = new double[3][4];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                matrix [row] [col] = input.nextDouble();
            }
        }
        for (int col = 0; col < 4; col++) {
            System.out.println("sum of the elements ia column "+col+" is : "+ sumColumn(matrix,col));
        }
    }
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }
*/  //8.2
    public static void main(String[] args) {
        System.out.println("enter a 4 by 4 matrix row by row: ");
        Scanner input = new Scanner(System.in);
        double [][] matrix = new double[4][4];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                matrix [row] [col] = input.nextDouble();
            }
        }
        System.out.println("sum of diagonal matrix: "+ sumMajorDiagonal(matrix));

    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][row];
        }
        return sum;
    }


}
