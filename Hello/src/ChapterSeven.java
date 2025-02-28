import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class ChapterSeven {
/*    public static void main(String[] args) {
        //7.8 page 252 examples
        double [] myList= new double [10];
        myList[9]=5.5;
        System.out.println(myList[0]+" "+myList[1]);
        int sum=0;
        for(int i=0; i<myList.length; i++){
            sum+=myList[i];
        }
        System.out.println(sum);
        double min=0;
        for(int i=0;i<myList.length;i++){
            if(myList[i]<min){
                min=myList[i];
            }
        }
        for(int i=0; i<myList.length; i++){
            myList[i]=Math.random()*100;
            System.out.println(myList[i]);
        }

        double [] newList= new double[]{3.5, 5.5, 4.52, 5.6};

    }
*/
    //7.10 examples not quiz question
/*    public static void main(String[] args) {
        double[] r=new double[100];
        for (int i = 0; i < r.length; i++){
            r[i] = Math.random() * 100;
        }
    }
*/
    //7.11
/*public static void main(String[] args) {
    int list[] = {1, 2, 3, 4, 5, 6};
    for (int i = 1; i < list.length; i++)
        list[i] = list[i - 1];
    for (int i = 0; i < list.length; i++)
        System.out.print(list[i] + " ");
}
*/
//7.22
/*    public static void main(String[] args) {
        int [] list={2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int key=10;
        int newKey=12;
        keyFound(list,key);
        keyFound(list,newKey);


    }
    public static void keyFound(int [] list,int key){
        int low=0;
        int high=list.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(list[mid]==key){
                System.out.println(mid +" is index of key "+key);
                break;
            }
            else if(key<list[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(low>high){
            System.out.println("there is no index of key "+key);
        }
    }
*/  //7.24
/*    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
    }
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
            System.out.print(list[i]+" ");
        }
    }
*/
/*    public static void main(String[] args) {
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        //java.util.Arrays.sort(numbers); // Sort the whole array
        //java.util.Arrays.parallelSort(numbers); // Sort the whole array
        char[] chars = {'a', 'Z', '4', 'F', 'A', 'P'};
        //java.util.Arrays.sort(chars, 1, 3); // Sort part of the array
        java.util.Arrays.parallelSort(chars, 2, chars.length); // Sort part of the array
        for (char num:chars){
            System.out.print(num+" ");
        }
    }
*/  //7.1
/*    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of student: ");
        int n = input.nextInt();
        int [] score=new int[n];
        System.out.print(" enter "+n+ "score: ");
        for (int i = 0; i < n; i++) {
            score[i] = input.nextInt();
        }
        grades(score);

    }
    public static void grades(int [] score){
        for (int i = 0; i < score.length; i++) {
            if (90<=score[i] && score[i]<= 100) {
                System.out.println("student "+i+" score is "+score[i]+" and grade is A");
            }
            else if (80<=score[i] && score[i]< 90) {
                System.out.println("student "+i+" score is "+score[i]+" and grade is B");
            }
            else if (70<=score[i] && score[i]< 80) {
                System.out.println("student "+i+" score is "+score[i]+" and grade is C");
            }
            else if (60<=score[i] && score[i]< 70) {
                System.out.println("student "+i+" score is "+score[i]+" and grade is D");
            }
            else {
                System.out.println("student "+i+" score is "+score[i]+" and grade is F");
            }

        }
    }
*/  //7.2
/*    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[10];
        System.out.println("enter ten integers number: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(reverse(numbers[i]));
        }

    }
    public static int reverse(int numbers) {
        String revNum = String.valueOf(numbers);
        String reversed = "";
        for (int i = revNum.length()-1; i >=0; i--) {
            reversed += revNum.charAt(i);
        }
        return Integer.parseInt(reversed);
    }
*///7.3
/*    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[10];
        System.out.println("enter ten number between 1 and 100");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        countingSort(numbers);
    }
    public static void countingSort(int [] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int count = 0;
            for (int j = i ; j < numbers.length-1; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count >1) {
                System.out.println(numbers[i]+" occurs "+count+" times.");
            }
            else {
                System.out.println(numbers[i]+" occurs "+count+" time.");
            }
        }
    }
*/
    //7.4
/*    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a few integers between 0 and 100");
        int [] numbers = new int[100];
        for (int a = 0; a < 100; a++) {
            numbers[a] = input.nextInt();
            if (numbers[a] < 0) {break;}
        }
        scores(numbers);
    }
    public static void scores(int [] numbers) {
        int sum = 0;
        for (int a = 0; a < numbers.length; a++) {
            sum += numbers[a];
        }
        double average = sum / numbers.length;
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] > average) {
                System.out.println(numbers[a]+" is greater than " + average);
            }
            else if (numbers[a] < average) {
                System.out.println(numbers[a]+" is less than " + average);
            }
            else {
                System.out.println(numbers[a]+" is equal to " + average);
            }
        }
    }
 */
//7.5
/*    public static void main(String[] args) {
        int [] primeList=new int[50];
        primeList[0]=2;
        int count=1;
        for (int j=3;j<1000;j++) {
                if(prime(j)) {
                    primeList[count]=j;
                    count++;
                    if (count==50) {break;}
                }
        }
        displayArray(primeList);

    }
    public static boolean prime(int number) {
        boolean prime=true;
        for(int i=2;i<number;i++) {
            if(number%i==0) {
                prime=false;
                break;
            }
        }
        return prime;
    }
    public static void displayArray(int [] array) {
        System.out.print(array[0]+" ");
        for(int i=1;i<array.length;i++) {
            if(i%10==0) {
                System.out.println(array[i]+" ");
            }
            else {
                System.out.print(array[i]+" ");
            }
        }
    }
*/ //7.7
/*    public static void main(String[] args) {
        int [] random=new int[100];
        for (int i=0; i<100; i++) {
            random[i]=(int)(Math.random()*10);
        }
        counts(random);
    }
    public static void  counts(int [] random) {
        int count0=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0;
        for (int i=0;i<random.length;i++) {
            switch (random[i]) {
                case 0:count0++;break;
                case 1:count1++;break;
                case 2:count2++;break;
                case 3:count3++;break;
                case 4:count4++;break;
                case 5:count5++;break;
                case 6:count6++;break;
                case 7:count7++;break;
                case 8:count8++;break;
                case 9:count9++;break;
            }
        }
        System.out.println("There is "+count0+" 0 numbers");
        System.out.println("There is "+count1+" 1 numbers");
        System.out.println("There is "+count2+" 2 numbers");
        System.out.println("There is "+count3+" 3 numbers");
        System.out.println("There is "+count4+" 4 numbers");
        System.out.println("There is "+count5+" 5 numbers");
        System.out.println("There is "+count6+" 6 numbers");
        System.out.println("There is "+count7+" 7 numbers");
        System.out.println("There is "+count8+" 8 numbers");
        System.out.println("There is "+count9+" 9 numbers");

    }
*/
//7.9
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 numbers : ");
        int [] number=new int[10];
        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("the smallest number is : "+smallest(number));
    }
    public static int smallest(int [] array){
        int smallest=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<smallest){
                smallest=array[i];
            }
        }
        return smallest;
    }
*/  //7.11
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 10 numbers: ");
        double [] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i]=sc.nextDouble();
        }
        System.out.printf(" the mean is: %.2f%n",mean(numbers));
        System.out.printf(" the standard deviation is %.2f : ",deviation(numbers));

    }
    public static double mean(double[] x){
        double sum=0;
        for (int i = 0; i < x.length; i++) {
            sum+=x[i];
        }
        return sum/x.length;
    }
    public static double deviation(double[] x){
        double sum=0;
        for (int i = 0; i < x.length; i++) {
            sum+=x[i];
        }
        double total=0;
        for (int i=0; i<x.length; i++) {
            total+=x[i]*x[i];
        }
        return Math.sqrt((total-((sum*sum)/x.length))/(x.length-1));
    }
*/
    //7.12
/*    public static void main(String[] args) {
        System.out.println("enter ten numbers: ");
        Scanner sc = new Scanner(System.in);
        int [] list = new int [10];
        for (int i = 0; i < 10; i++) {
            list[i]=sc.nextInt();
        }
        reverse(list);

    }
    public static void reverse(int [] arr) {
        int [] reversedList = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedList[i] = arr[arr.length - i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(reversedList[i]+" ");
        }
    }
*/  //7.15// ı dont know how to eliminate number ı took this from chat
/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            list[i] = scanner.nextInt();
        }

        int[] uniqueList = eliminateDuplicates(list);

        System.out.print("The distinct numbers are: ");
        for (int num : uniqueList) {
            System.out.print(num + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        Arrays.sort(list); // Step 1: Sort the array
        int n = list.length;
        int[] temp = new int[n];
        int j = 0;

        // Step 2: Copy unique elements
        for (int i = 0; i < n - 1; i++) {
            if (list[i] != list[i + 1]) {
                temp[j++] = list[i];
            }
        }
        temp[j++] = list[n - 1]; // Add last element

        // Step 3: Copy unique elements to a new array of correct size
        return Arrays.copyOf(temp, j);
    }
*/

/*    //7.17
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter there is how many students: ");
        int students = input.nextInt();
        int [] score = new int[students];
        String [] name= new String[students];
        for (int i = 0; i < students; i++) {
            System.out.println("enter the name of the student: ");
            String names = input.next();
            System.out.println("enter the scores of the student: ");
            int scores = input.nextInt();
            score[i] = scores;
            name[i] = names;
        }
        sortStudents(score, name);

    }
    public static void sortStudents(int[] scores,String[] names) {

        for (int i = 0; i < scores.length-1; i++) {
            int min = scores[i];
            String minName = names[i];
            int minIndex = i;

            for (int j = i+1; j < scores.length; j++) {
                if (min > scores[j]) {
                    min = scores[j];
                    minName = names[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                scores[minIndex] = scores[i];
                names[minIndex] = names[i];
                scores[i] = min;
                names[i] = minName;
            }
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d: %s%n",scores[i],names[i]);
        }
    }
*/
/*    //7.18 ı solved by help of chat
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 10 double numbers: ");
        double [] numbers = new double [10];
        for(int i = 0; i < 10; i++) {
            double number = input.nextDouble();
            numbers[i] = number;
        }
        bubble(numbers);
        for(double num: numbers) {
            System.out.println(num+" ");
        }
    }

    public static void bubble(double[] numbers) {
        double temp;
        boolean swap;
        for(int i = 0; i < numbers.length-1; i++) {
            swap = false;
            for(int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
*/
    //7.19
/*    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter how many numbers you want to enter: ");
        int n = input.nextInt();
        int [] list = new int[n];
        for (int i = 0; i < n; i++) {
            int x=input.nextInt();
            list[i]=x;
        }
        if(sorted(list)){
            System.out.println("already sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
    public static boolean sorted(int [] list){
        boolean flag = true;
        for (int i = 0; i < list.length-1; i++) {
            if (list[i]>list[i+1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
*/  //7.20
/*    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many index do you want for array: ");
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
        sort(arr);

    }
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i];
            int maxIndex=i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                arr[maxIndex] = arr[i];
                arr[i] = max;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
*/  //7.21
/*    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many balls are there");
        int ball=input.nextInt();
        System.out.println("how many sluts are there");
        int slut=input.nextInt();
        dropTheBall(slut,ball);


    }
    public static void dropTheBall(int slut, int ball) {
        int [] pointer= new int [slut-1];
        for (int i = 0; i < ball; i++) {
            String k="";
            int r=0;
            for(int j=0; j<slut-1;j++){
                int road=(int)(Math.random()*2);
                if(road==1){
                    k+="L";
                }else if(road==0){
                    k+="R";
                    r++;
                }

            }
            System.out.println((i+1)+". ball is following the road of "+k);
            pointer[i]=r;
        }
        addToSlut(pointer,slut);
    }
    public static void addToSlut(int[] pointer, int slut){
        int [] sluts=new int[slut];

        for(int i=0;i<pointer.length;i++){
            System.out.print(pointer[i]);
            sluts[pointer[i]]+=1;
        }
        System.out.println();
        for(int i=0;i<slut;i++){
            System.out.print(sluts[i]);
        }
        System.out.println();
        int max= findMax(sluts);
        //System.out.println(max);
        for(int i=max;i>0;i--){
            for (int j:sluts){
                if(j>=i){
                    System.out.print("O ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    public static int findMax(int [] sluts){
        int max=sluts[0];
        for(int num:sluts){
            if(num>max){
                max=num;
            }
        }
        return max;
}
*/
//7.22


}
