import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ChapterFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        float sum = 0;
// Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f){
            sum += i;System.out.println(sum);}
// Display result
        System.out.println("The sum is " + sum);

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (i % 3 == 0) continue;
            sum += i;
        }
        System.out.println(sum);
        //infinite code
        int i = 0, sums = 0;
        while (i < 4) {
            if (i % 3 == 0) continue;
            sum += i;
            i++;
        }
        System.out.println(sums);

        //5.1
        System.out.println("enter number as much as you want but it will end when you enter ziro and then ı will display average of number, negatif and positive number: ");
        double sum = 0;
        int positive = 0;
        int negative = 0;
        int k=0;
        boolean flag = true;
        while (flag){
            int i = sc.nextInt();
            if(i<0){
                negative++;
            }
            else if(i>0){
                positive++;
            }
            else{
                break;
            }
            sum += i;
            k++;
        }
        System.out.println("total number is: " + sum);
        System.out.println("number of positive is: " + positive);
        System.out.println("number of negative is: " + negative);
        System.out.println("average number is: " + sum/k);

        //5.5
                System.out.println("Kilograms     "+"     Pounds"+"          |"+"        Pounds     "+"         Kilograms");
        for(double i = 1, p1= 20; i < 200; i+=2, p1+=5) {
            double p= i*2.2 ;
            double kg1 = p1/2.2;
            //System.out.printf( "%.2f              %.2f          |        %.2f                 %.2f%n",i,p,p1,kg1);
            if(p<100){
                System.out.printf("%.2f              %.2f          |        %.2f                   %.2f%n",i,p,p1,kg1);
            }
            else{
                System.out.printf("%.2f              %.2f          |        %.2f                   %.2f%n",i,p,p1,kg1);
            }
        }

        //5.7
        int tution=10000;
        double rate=0.05;
        System.out.println("every year tution increase "+rate);
        for(double i=1, total=tution,add=0;i<=10;i++,total+=add) {
            add=tution*rate;
            tution += add;
            if(i<5) {
                System.out.printf("%.2f year tution is %.2f%n",i,total);
            }

        }System.out.println("total tution is : "+tution);


        //5.9
        System.out.print("how many students are there: ");
        int n = sc.nextInt();
        double average=0;
        double highest=0;
        String hname = "";
        for (int i = 0; i < n; i++) {
            System.out.println("enter score : ");
            int score = sc.nextInt();
            sc.nextLine();
            System.out.println("enter name of the student: ");
            String name = sc.nextLine();

            average += score;
            if(score>highest) {
                highest = score;
                hname=name;
            }

        }
        System.out.println("average of the scor: "+ average/n);
        System.out.println("the higehest score is "+highest+" belnogs to : "+ hname);


        //5.10
        for(int i = 100,a=0; i < 1000; i++) {
            if(i%5==0 && i%6==0) {
                a++;
                if(a%10==0) {
                   System.out.println(" ");
                }
                System.out.print(" "+i);

            }
        }

        //5.12
        int n=130;
        double a=0;
        while(n*n>12000) {
            n--;

        }
        System.out.println((n+1)+ " is the smallest number that n^2 "+ (n+1)*(n+1) +" is bigger than 12000");
        System.out.println(110*110);

        //5.14
        System.out.println("enter two positive numbers to find their gcd: ");
        int n = sc.nextInt();
        int n1 = sc.nextInt();

        for(double i = n; i > 0 ; i--) {
            if (n % i == 0 && n1 % i == 0) {
                System.out.println(i);
            }
        }

        //5.15
        for(int i=26, k=0;i<=100;i++,k++) {
            if(k%11!=0){
            System.out.print((char)('a'+i)+" ");
            }else{
                System.out.println(" ");
            }
        }


        //5.16 **
        System.out.println("enter a number and i will give you all factors(prime and how many time use) of that integer number: ");
        int number = sc.nextInt();
        int a=number;
        for(int i=2;i<a;i++) {
            while(number%i==0) {
                System.out.println(i+" ");
                number/=i;
            }
        }

        //5.17
        System.out.println("enter a number for pyramid: ");
        int pyramid = sc.nextInt();

        for(int i=1;i<=pyramid;i++) {
            for (int j=0;j<=pyramid-i;j++) {
                System.out.printf("  ");
            }
            for (int j=i;j>=1;j--) {
                if(j!=1){
                    System.out.printf("%-2d",j);}
            }
            for(int j=1;j<=i;j++) {
                System.out.printf("%2d",j);
            }
            System.out.println();

        }

        //5.18
        System.out.println("enter the loop number:");
        int loop = sc.nextInt();
        //A example
        for (int i = 1; i <= loop; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        System.out.println();
        //B example
        for (int i = 1; i <= loop; i++) {
            for (int j = 1; j <= loop-i+1; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        System.out.println();
        //C example
        for (int i = 1; i <= loop; i++) {
            for (int j = 0; j <loop-i; j++) {
                System.out.printf("  ");
            }
            for (int j = i; j>0; j--) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        System.out.println();
        //D example
        for (int i = 1; i <= loop; i++) {
            for (int j = 1; j < i; j++) {
                System.out.printf("  ");
            }
            for (int j = 1; j <= loop-i+1; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }

        //5.19
        System.out.println("enter the hight of the pyramid: ");
        int hight = sc.nextInt();

        for (int i = 1; i <= hight; i++) {
            for (int j = 0; j <= hight-i-1; j++) {
                System.out.printf("   ");
            }
            for (int k = 0; k < i-1; k++) {
                double n=Math.pow(2,k);
                System.out.printf("%.0f  ",n);
            }
            for (int l = 0; l < i; l++) {
                double n=Math.pow(2,l);
                System.out.printf("%.0f  ",n);
            }
            System.out.println();
        }

        //5.20
        int prime=0;
        final int number_Per_Line=8;
        int number=2;

        while(number<=1000) {
            boolean isPrime = true;
            for(int i=2;i<=number/2;i++) {
                if(number%i==0) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                prime++;
                if(prime % number_Per_Line==0) {
                    System.out.println(number);
                }
                else {
                    System.out.print(number+"   ");
                }
            }
            number++;
        }

        //5.21
        System.out.print("Please enter amount of loan: ");
        double loanAmount = sc.nextDouble();
        System.out.print("Please enter number of year that you will keep: ");
        int year = sc.nextInt();
        System.out.println("Interest Rate    Monthly Payment  Total Payment");
        for (double rate=0.05000; rate<=0.08000; rate+=0.00125){
            int month=year*12;
            double payment = loanAmount * rate;
            double totalPayment=payment*month;
            System.out.printf("%-17.5f%-17.2f%-17.2f%n",rate,payment,totalPayment);
        }
*/      //5.22
        

    }
}
