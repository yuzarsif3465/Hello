import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
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
/*    public static void main(String[] args) {
        String [] arr=new String[8];
        String [] arr2=new String[8];
        String [] arr3=new String[8];
        String [] arr4=new String[8];
        String [] arr5=new String[8];
        String [] arr6=new String[8];
        String [] arr7=new String[8];
        String [] arr8=new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i]="Q";
            for (int j = 0; j < 8; j++) {
                //j cant be same with i and shouldnt be on same diagonal
                if(j==i && j==i+1){break;}
                else if(j==i-1){break;}
                else{arr2[j]="Q";
                    for (int k = 0; k < 8; k++) {
                        if (k == j && k == j + 1 && k == i && k == i + 2) {
                            break;
                        } else if (k == j - 1 && k == i - 2) {
                            break;
                        } else {
                            arr3[j] = "Q";
                            for (int l = 0; l < 8; l++) {
                                if (l == k && l == k + 1 && l == i + 3 && l == i && l == j + 2 && l == j) {
                                    break;
                                } else if (l == k - 1 && l == i - 3 && l == j - 2) {
                                    break;
                                } else {
                                arr4[j] = "Q";
                                for (int m = 0; m < 8; m++) {
                                    if (m == l && m == l + 1 && m == k + 2 && m == k && m == j + 3 && m == j && m == i && m == i + 4) {
                                        break;
                                    } else if (m == l - 1 && m == k - 2 && m == j - 3 && m == i - 4) {
                                        break;
                                    } else {
                                    arr5[j] = "Q";
                                    for (int n = 0; n < 8; n++) {
                                    if (n == m && n == m + 1 && n == l && n == l + 2 && n == k && n == k + 3 && m == j && n == j + 4 && m == i && n == i + 5) {
                                        break;
                                    } else if (n == m - 1 && n == l - 2 && m == k - 3 && m == j - 4 && m == i - 5) {
                                        break;
                                    } else {
                                        arr6[j] = "Q";
                                        for (int o = 0; o < 8; o++) {
                                        if (o == n && o == n + 1 && o == m && o == m + 2 && o == l && o == l + 3 && o == k && o == k + 4 && m == j && o == j + 5 && m == i && o == i + 6) {
                                            break;
                                        } else if (o == n - 1 && o == m - 2 && o == l - 3 && o == k - 4 && m == j - 5 && o == i - 6) {
                                            break;
                                        } else {
                                            arr7[j] = "Q";
                                            for (int p = 0; p < 8; p++) {
                                            if (p == o && p == o + 1 && p == n && p == n + 2 && p == m && p == m + 3 && p == l && p == l + 4 && p == k && p == k + 5 && m == j && p == j + 6 && m == i && p == i + 7) {
                                                break;
                                            } else if (p == o - 1 && p == n - 2 && p == m - 3 && p == l - 4 && p == k - 5 && m == j - 6 && p == i - 7) {
                                                break;
                                            } else {
                                            arr8[j] = "Q";
                                            for (int q = 0; q < 8; q++) {
                                                System.out.print(arr[q]);
                                            }
                                            System.out.println();
                                            for (int q = 0; q < 8; q++) {
                                                System.out.print(arr2[q]);
                                            }
                                            System.out.println();
                                            for (int q = 0; q < 8; q++) {
                                                System.out.print(arr3[q]);
                                            }
                                            System.out.println();
                                            for (int q = 0; q < 8; q++) {
                                                System.out.print(arr4[q]);
                                            }
                                            System.out.println();
                                            for (int q = 0; q < 8; q++) {
                                                System.out.print(arr5[q]);
                                            }
                                            System.out.println();
                                            for (int q = 0; q < 8; q++) {
                                                System.out.print(arr6[q]);
                                            }
                                            System.out.println();
                                            for (int q = 0; q < 8; q++) {
                                                System.out.print(arr7[q]);
                                            }
                                            System.out.println();
                                            for (int q = 0; q < 8; q++) {
                                                System.out.print(arr8[q]);
                                            }
                                            System.out.println();
                                            break;
                                        }
                                    }
                                    }
                                }
                                }
                            }
                            }
                        }
                        }
                    }
                    }
                }
                }

            }
        }
    }

}*/
//7.23
/*   public static void main(String[] args) {
        boolean[] locked = new boolean[100];
        for (int i = 0; i < locked.length; i++) {
            locked[i] = false;
        }
        for (int i = 1; i <= locked.length; i++) {
            lock(locked,i);
        }

        print(locked);
    }
    public static void lock(boolean[] locked, int i) {
        for (int j = 0; j < locked.length; j++) {
            if ((j+1)%i==0) {
                if (locked[j]) {
                    locked[j] = false;
                } else {
                    locked[j] = true;
                }
            }
        }
    }
    public static void print(boolean[] locked) {
        for (int i = 0; i < locked.length; i++) {
            if(locked[i]){
                System.out.println((i+1)+". is open");
            }
        }
    }
*/
    //7.24
/*    public static void main(String[] args) {
        int [] symbol=new int[4];
        while(symbol[0]<1 || symbol[1]<1 || symbol[2]<1 || symbol[3]<1){
            int k=random(symbol);
            String m= number(k);
            if(0<=k && k<=12){
                symbol[0]+=0;//ı tried to increase +1 but with this way increased +2 so ı write =0 for symbol array
                String suit="spades";
                System.out.println(m+" of "+ suit);
            }
            else if(13<=k && k<=25){
                symbol[1]+=0;
                String suit="hearts";
                System.out.println(m+" of "+ suit);
            }
            else if(26<=k && k<=38){
                symbol[2]+=0;
                String suit="clubs";
                System.out.println(m+" of "+ suit);}
            else if(39<=k && k<=52  ){
                symbol[3]+=0;
                String suit="diamonds";
                System.out.println(m+" of "+ suit);}
        }
        howManyCardINeed(symbol);

    }
    public static int random(int[] symbol){
        int k=1+(int)(Math.random()*52);
        if(1<=k && k<=13){
            symbol[0]+=1;
        }
        else if(14<=k && k<=26){
            symbol[1]+=1;
        }
        else if(27<=k && k<=39){
            symbol[2]+=1;
        }
        else if(40<=k && k<=52){
            symbol[3]+=1;
        }
        return k;
    }
    public static String number(int k){
        int remainder=k%13;
        String card="";
        switch(remainder){
            case 0:card="Ace";break;
            case 1:card="Two";break;
            case 2:card="Three";break;
            case 3:card="Four";break;
            case 4:card="Five";break;
            case 5:card="Six";break;
            case 6:card="Seven";break;
            case 7:card="Eight";break;
            case 8:card="Nine";break;
            case 9:card="Ten";break;
            case 10:card="Jack";break;
            case 11:card="Queen";break;
            case 12:card="King";break;
        }
        return card;
    }
    public static void howManyCardINeed(int[] symbol){
        int spades=0;
        int hearts=0;
        int clubs=0;
        int diamonds=0;
        if(symbol[0]<=4){ spades=4-symbol[0];}
        if(symbol[1]<=4){ hearts=4-symbol[1];}
        if(symbol[2]<=4){ clubs=4-symbol[2];}
        if(symbol[3]<=4){ diamonds=4-symbol[3];}
        int total=spades+hearts+clubs+diamonds;
        System.out.println("number of picks: "+total);
    }
*/ //7.27
/*    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first list: ");
        int [] list1 = new int[6];
        int [] list2 = new int[6];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = in.nextInt();
        }
        System.out.println("Enter second list: ");
        for (int i = 0; i < list2.length; i++) {
            list2[i] = in.nextInt();
        }
        boolean flag = equals(list1, list2);
        if(flag){
            System.out.println("two lists are  identical");
        }
        else{
            System.out.println("two lists are not identical");
        }
    }
    public static boolean equals(int [] list, int [] list2) {
        boolean flag = true;
        for (int i = 0; i < list.length; i++) {
            if(list[i] != list2[i]){
                flag = false;
            }
        }
        return flag;
    }
*/// 7.26
/*public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter size of first list: ");
    int size = in.nextInt();
    int [] list1 = new int[size];
    System.out.println("Enter elements of first list: ");
    for (int i = 0; i < size; i++) {
        list1[i] = in.nextInt();
    }
    System.out.println("Enter size of second list: ");
    int size2 = in.nextInt();
    int [] list2 = new int[size2];
    System.out.println("Enter elements of second list: ");
    for (int i = 0; i < size2; i++) {
        list2[i] = in.nextInt();
    }
    boolean flag = equals(list1, list2);
    if(flag){
        System.out.println("two lists are strictly identical");
    }
    else{
        System.out.println("two lists are not strictly identical");
    }
}
    public static boolean equals(int [] list, int [] list2) {
        boolean flag = true;
        if(list.equals(list2)){flag = true;}
        else {flag = false;}
        return flag;
    }
*/
    //7.28
/*    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr= new int [10];
        System.out.println("Enter 10 numbers: ");
        for(int i=0; i<10; i++){
            arr[i]=in.nextInt();
        }
        combination(arr);
    }
    public static void combination(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" "+arr[i]);
            for(int j=i+1; j<arr.length; j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
*/
    //7.29
    public static void main(String[] args) {
        int [] arr=new int[52];
        int sum=0;
        for (int i = 0; i < 4; i++) {
            sum+=cards();
        }
        System.out.println(24-sum+" that you need pick up for reach to 24");
    }
    public static int cards() {
        int random=1+(int)(Math.random()*52);
        return random%13;
    }





}
