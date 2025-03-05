import java.util.Arrays;
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
/*    public static void main(String[] args) {
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
*/ //8.5
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first 3*3 matrix values: ");
        double[][] matrix = new double[3][3];
        double [][] matrix2 = new double[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.println("enter second 3*3 matrix values: ");
        for(int j=0;j<3;j++){
            for(int k=0;k<3;k++){
                matrix2[j][k] = sc.nextDouble();
            }
        }
        double [][] c=multiplyMatrix(matrix,matrix2);
        for (int i=0;i<3;i++){
            System.out.println(c[i][0]+" "+c[i][1]+" "+c[i][2]);
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] c = new double[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j];
            }
        }
        return c;
    }
*/
//8.7
/*    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},{5.5, 4, -0.5}};
        pointsNearest(points);

    }
    public static void pointsNearest(double[][] matrix) {
        int sum=0;
        int p1=0,p2=1;
        double shortestDistance= distance(matrix[p1][0],matrix[p1][1],matrix[p1][2],matrix[p2][0],matrix[p2][1],matrix[p2][2]);
        for(int i=0;i<matrix.length;i++){
            for(int j=1+i;j<matrix.length;j++){
                double distance=distance(matrix[i][0],matrix[i][1],matrix[i][2],matrix[j][0],matrix[j][1],matrix[j][2]);
                if(distance<shortestDistance){
                    p1=i;
                    p2=j;
                    shortestDistance=distance;
                }
            }
        }
        System.out.println("closest points are "+ matrix[p1][0]+","+matrix[p1][1]+","+matrix[p1][2] +" and "+ matrix[p2][0]+","+matrix[p2][1]+","+matrix[p2][2]);
        System.out.println("closest distance is "+ shortestDistance);

    }
    public static double distance(double x,double y,double z, double x1,double y1,double z1) {
        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)+(z-z1)*(z-z1));
    }
*/  //8.8
/*    public static void main(String[] args) {
        double[][] points = {{0, 0}, {-1, -1}, {1, 1},{2, 2}, {-2, -2}, {-3, -3}, {-4, -4,},{5, 5}};
        pointsNearest(points);

    }
    public static void pointsNearest(double[][] matrix) {
        double [][] arr = new double[matrix.length][matrix[0].length];
        int p1=0,p2=1;
        double shortestDistance= distance(matrix[p1][0],matrix[p1][1],matrix[p2][0],matrix[p2][1]);
        for(int i=0;i<matrix.length;i++){
            for(int j=1+i;j<matrix.length;j++){
                double distance=distance(matrix[i][0],matrix[i][1],matrix[j][0],matrix[j][1]);
                if(distance<shortestDistance){
                    p1=i;
                    p2=j;
                    shortestDistance=distance;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=1+i;j<matrix.length;j++){
                double distance=distance(matrix[i][0],matrix[i][1],matrix[j][0],matrix[j][1]);
                if(distance==shortestDistance){
                    p1=i;
                    p2=j;
                    System.out.println("closest points are "+ matrix[p1][0]+","+matrix[p1][1]+" and "+ matrix[p2][0]+","+matrix[p2][1]);
                }
            }
        }
        System.out.println("closest distance is "+ shortestDistance);

    }
    public static double distance(double x,double y, double x1,double y1) {
        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
    }
*/  //8.9
/*    public static void main(String[] args) {
        String [][] arr= new String [3][3];
        game(arr);
    }
    public static void game(String[][] arr){
        Scanner sc=new Scanner(System.in);
        String player1="x";
        String player2="o";
        for(int i=0;i<5;i++){
            System.out.println("first player enter where will you put your sign ");
            int row=sc.nextInt();
            int col=sc.nextInt();
            System.out.println("second player enter where will you put your sign ");
            int row1=sc.nextInt();
            int col1=sc.nextInt();
            arr[row][col]=player1;
            arr[row1][col1]=player2;
            if(arr[0][0]==player1&&arr[0][1]==player1&&arr[0][2]==player1){
                System.out.println("first player won ");
                break;
            }
            else if(arr[0][0]==player1&&arr[1][1]==player1&&arr[2][2]==player1){
                System.out.println("firstplayer won ");
                break;
            }
            else if(arr[0][0]==player1&&arr[1][0]==player1&&arr[2][0]==player1){
                System.out.println("firstplayer won ");
                break;
            }
            else if(arr[1][0]==player1&&arr[1][1]==player1&&arr[1][2]==player1){
                System.out.println("second player won ");
                break;
            }
            else if(arr[2][0]==player1&&arr[2][1]==player1&&arr[2][2]==player1){
                System.out.println("second player won ");
                break;
            }
            else if(arr[0][1]==player1&&arr[1][1]==player1&&arr[2][1]==player1){
                System.out.println("firstplayer won ");
                break;
            }
            else if(arr[0][2]==player1&&arr[1][2]==player1&&arr[2][2]==player1){
                System.out.println("firstplayer won ");
                break;
            }
            else if(arr[2][0]==player1&&arr[1][1]==player1&&arr[0][2]==player1){
                System.out.println("firstplayer won ");
                break;
            }
            else if(arr[0][0]==player2&&arr[0][1]==player2&&arr[0][2]==player2){
                System.out.println("first player won ");
                break;
            }
            else if(arr[0][0]==player2&&arr[1][1]==player2&&arr[2][2]==player2){
                System.out.println("firstplayer won ");
                break;
            }
            else if(arr[0][0]==player2&&arr[1][0]==player2&&arr[2][0]==player2){
                System.out.println("firstplayer won ");
                break;
            }
            else if(arr[1][0]==player2&&arr[1][1]==player2&&arr[1][2]==player2){
                System.out.println("second player won ");
                break;
            }
            else if(arr[2][0]==player2&&arr[2][1]==player2&&arr[2][2]==player2){
                System.out.println("second player won ");
                break;
            }
            else if(arr[0][1]==player2&&arr[1][1]==player2&&arr[2][1]==player2){
                System.out.println("firstplayer won ");
                break;
            }
            else if(arr[0][2]==player2&&arr[1][2]==player2&&arr[2][2]==player2){
                System.out.println("firstplayer won ");
                break;
            }
            else if(arr[2][0]==player2&&arr[1][1]==player2&&arr[0][2]==player2){
                System.out.println("firstplayer won ");
                break;
            }


        }

    }
*/  //8.14
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" what is the length of matrix");
        int m = sc.nextInt();
        int [][] matrix = new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = (int)(Math.random()*2);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        explore(matrix);
    }
    public static void explore(int [][] matrix){
        for(int i=0;i<matrix.length;i++) {
            int sum = 0, sum1 = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    sum++;
                }
                if (matrix[i][j] == 1) {
                    sum1++;
                }
            }
            if (sum == matrix.length) {
                System.out.println("all " + 0 + "s on row " + i);
            }
            if (sum1 == matrix.length) {
                System.out.println("all " + 1 + "s on row " + i);
            }

            int sumColumn = 0, sumColumn1 = 0;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][i] == 0) {
                    sumColumn++;
                }
                if (matrix[k][i] == 1) {
                    sumColumn1++;
                }
            }
            if (sumColumn == matrix.length) {
                System.out.println("all " + 0 + "s on column " + i);
            }
            if (sumColumn1 == matrix.length) {
                System.out.println("all " + 1 + "s on column " + i);
            }
        }
            int majDiagonal=0,majDiagonal1=0;
            for(int l=0;l<matrix.length;l++){
                if(matrix[l][l]==0){majDiagonal++;}
                if(matrix[l][l]==1){majDiagonal1++;}
            }
            if(majDiagonal==matrix.length){
                System.out.println("all "+0+"s on major diagonal ");
            }
            if(majDiagonal1==matrix.length){
                System.out.println("all "+1+"s on major diagonal ");
            }
            int subDiagonal=0,subDiagonal1=0;;
                for (int m = matrix.length - 1,i=0; m >= 0; m--,i++) {
                    if (matrix[i][m] == 0) {
                        subDiagonal++;
                    }
                    if (matrix[i][m] == 1) {
                        subDiagonal1++;
                    }
                }
                if (subDiagonal == matrix.length) {
                    System.out.println("all " + 0 + "s on sub diagonal ");
                }
                if (subDiagonal1 == matrix.length) {
                    System.out.println("all " + 1 + "s on sub diagonal ");
                }

        }
*/  //8.17
/*    public static void main(String[] args) {
        double [][][] lend={//{banka, borcverilen banka, miktar
                {{125,100.5},{181,320.5}},
                {{175,40},{75,85}},
                {{25,125},{75,75}},
                {{25,125},{0,0}},
                {{175,125},{0,0}}
        };
        double [][][] borrow={//{banka, borc alınan banka, miktar
                {{75,125},{175,125}},
                {{25,100.5},{0,0}},
                {{125,40},{181,125}},
                {{175,75},{125,85}},
                {{25,320.5},{0,0}}
        };
        tsunami(lend,borrow);
    }
    public static void tsunami(double [][][]arr,double [][][]borrow ){
        for(int i=0;i<arr.length;i++){
            double sub=arr[i][0][0]+arr[i][0][1]+arr[i][0][2];
            System.out.println(sub);

        }
    }
*/
    //8.18
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
    }
    public static void shuffle(int[][] m) {
        int [][] arr=new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            arr[i]=m[(int) (Math.random()*5)];
        }
        write(arr);
    }
    public static void write(int[][] arr) {
        for (int[] num:arr) {
            System.out.println(Arrays.toString(num));
        }
    }
}
