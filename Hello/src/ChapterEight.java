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
    public static void main(String[] args) {
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





}
