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
/*    public static void main(String[] args) {
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
*/
    //8.4
    public static void main(String[] args) {
        int [][] hours={{2,4,3,4,5,8,8},{3,3,4,3,3,2,2},{7,3,4,3,3,4,4},{9,3,4,7,3,4,1},{3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9}};
        compute(hours);
    }
    public static void compute(int [][] hours){
        int[] sum= new int[hours.length] ;
        int [] index= new int[hours.length] ;
        for(int i=0;i<hours.length;i++){
            sum[i]=0;
            index[i]=i;
            for(int j=0;j<hours[i].length;j++){
                sum[i]+=hours[i][j];
            }
        }
        for(int i=0;i<hours.length;i++){
            for(int j=0;j<hours.length;j++){
                if(sum[j]<sum[i]){
                    int temp=sum[j];
                    sum[j]=sum[i];
                    sum[i]=temp;
                    int tempIndex=index[i];
                    index[i]=index[j];
                    index[j]=tempIndex;
                }
            }

        }
        for(int i=0;i<hours.length;i++){
            System.out.println(index[i]+" employee works "+sum[i]+" hours");
        }
    }

}
