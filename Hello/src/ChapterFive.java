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
      //5.22
        //principle is the loan-balance
        // interest is monthly interest*balance
        System.out.print("enter loan amount: ");
        double loanAmount = sc.nextDouble();
        System.out.print("enter year: ");
        int year = sc.nextInt();
        System.out.print("what is the annual interest rate: ");
        double rate = sc.nextDouble();
        double monthlyInterestRate = rate / (12*100);
        double monthlyPayment = loanAmount * monthlyInterestRate*(Math.pow(monthlyInterestRate+1,12*year))/(Math.pow(monthlyInterestRate+1,12*year)-1);

        System.out.printf("monthly payment: %.2f%n",monthlyPayment);
        System.out.printf("total payment: %.2f%n",monthlyPayment*12);

        System.out.println("Payment      Interest     Principle      Balance");
        double balance = loanAmount;
        for (int i = 1; 1<balance; i++) {

            double interest = balance * monthlyInterestRate;
            double principal = monthlyPayment - interest;
            balance = balance - principal;

            System.out.printf("%-13d%-13.2f%-15.2f%-13.2f",i,interest,principal,balance);
            System.out.println();
        }

        //5.23
        int number = 5000;
        double a=0;
        for (int i = 1; i <= number; i++) {
            a=a+(1/i);
        }
        System.out.println(a);

        for (int i = number; i >0 ; i--) {
            a=a+(1/i);
        }
        System.out.println(a);

        //5.24
        int a=0;
        for (int i=1;i<98;i++) {
            a=a+(i/(i+2));
        }
        System.out.println(a);
        for (int i=99;i>2;i--) {
            a=a+((i-2)/(i));
        }
        System.out.println(a );

        //5.25
        double PI = 0;
        for (int k=1; k<=10; k++) {
            for (int i = 1; i <= 10000*k; i++) {
                PI = PI + (Math.pow(-1, i + 1) / (2 * i - 1));
            }
            System.out.print("i= "+10000*k+" degeri icin PI=");
            System.out.println(4 * PI);
        }
      //5.26
        double e=1;
        for (int k = 1; k <= 10; k++) {
            for (int i = 10000*k; i >0; i--) {

                for (double j = i; j>=1; j--) {
                    e*=(1/j);
                }
                e+=e;

            }
            System.out.println("from 0 to "+10000*k+": "+e);
        }
      //5.27
        System.out.println("we will find the leap year");
        int count=0;
        for (int i=101; i<=2100; i++) {
            if (i%4==0) {
                count++;
                if (count%10==0) {
                    System.out.println(i);
                }
                else{
                    System.out.print(i+" ");
                }
            }
            else {
                continue;
            }
        }
      //5.28
        System.out.print("enter the  year: ");
        int year = sc.nextInt();
        System.out.print("enter first day of the year 0-7:");
        int firstDay = sc.nextInt();
        String day = "";
        if(year%4==0){//fabruary would be 29 days
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("january 1,"+year+" is "+day);
            firstDay=firstDay+31;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("february 1,"+year+" is "+day);
            firstDay=firstDay+29;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("march 1,"+year+" is "+day);
            firstDay=firstDay+31;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("april 1,"+year+" is "+day);
            firstDay=firstDay+30;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("may 1,"+year+" is "+day);
            firstDay=firstDay+31;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("june 1,"+year+" is "+day);
            firstDay=firstDay+30;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("july 1,"+year+" is "+day);
            firstDay=firstDay+31;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("august 1,"+year+" is "+day);
            firstDay=firstDay+31;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("september 1,"+year+" is "+day);
            firstDay=firstDay+30;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("october 1,"+year+" is "+day);
            firstDay=firstDay+31;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("november,"+year+" is "+day);
            firstDay=firstDay+30;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("december,"+year+" is "+day);
        }
        else{
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("january 1,"+year+" is "+day);
            firstDay=firstDay+31;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("february 1,"+year+" is "+day);
            firstDay=firstDay+28;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("march 1,"+year+" is "+day);
            firstDay=firstDay+31;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("april 1,"+year+" is "+day);
            firstDay=firstDay+30;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("may 1,"+year+" is "+day);
            firstDay=firstDay+31;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("june 1,"+year+" is "+day);
            firstDay=firstDay+30;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("july 1,"+year+" is "+day);
            firstDay=firstDay+31;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("august 1,"+year+" is "+day);
            firstDay=firstDay+31;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("september 1,"+year+" is "+day);
            firstDay=firstDay+30;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("october 1,"+year+" is "+day);
            firstDay=firstDay+31;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("november,"+year+" is "+day);
            firstDay=firstDay+30;
            switch (firstDay%7) {
                case 0:day="sunday";break;
                case 1:day="monday";break;
                case 2:day="tuesday";break;
                case 3:day="wednesday";break;
                case 4:day="thursday";break;
                case 5:day="friday";break;
                case 6:day="saturday";break;
            }
            System.out.println("december,"+year+" is "+day);
        }

    */


        /*        //5.33
        int count=0;
        for(int i=1;i<10000;i++){
            for (int k=1;k<=i/2;k++){
                //System.out.println(i);
                if(i%k==0){
                    count+=k;
                    //System.out.println(k);
                }

            }
            if (i==count){
                System.out.println(i+" is perfect number");
            }
            count=0;

        }


        //5.34

        int winOfComputer=0;
        int winOfPlayer=0;
        System.out.println("0 is rock , 1 paper, 2 is scissor. ");


        while(winOfComputer<3 && winOfPlayer<3 ) {
            int n= (int) (Math.random()*3);
            System.out.print("enter a number for game: ");
            int guess = input.nextInt();
            if(guess==0){
                if (n==0){
                    System.out.println(" no one win ");
                }
                else if (n==1){
                    System.out.println("computer win");
                    winOfComputer+=1;
                }else{
                    System.out.println("you win");
                    winOfPlayer+=1;
                }
            }
            else if (guess==1){
                if (n==0){
                    System.out.println(" you win ");
                    winOfPlayer+=1;
                }
                else if (n==1){
                    System.out.println("no one win");
                }else{
                    System.out.println("computer win");
                    winOfComputer+=1;
                }
            }
            else if (guess==2){
                if (n==0){
                    System.out.println(" computer win ");
                    winOfComputer+=1;
                }
                else if (n==1){
                    System.out.println("you win");
                    winOfPlayer+=1;
                }else{
                    System.out.println("no one win");
                }
            }
            else {
                System.out.println("invalid value");
            }
        }
        System.out.println("computer won "+winOfComputer+" times, you won "+ winOfPlayer+" times");
        if (winOfComputer<winOfPlayer){
            System.out.println("you won the game");
        }
        else{
            System.out.println("computer won the game");
        }
      //5.37
        System.out.print("enter a decimal number and ı will corresponding to binary value: ");
        int decimal = input.nextInt();
        String bin="";
        while (decimal != 0) {
            int binValue=decimal % 2;
            if(binValue==0){
                String binDigit="0";
                bin=binDigit+bin;
            }
            else{
                String binDigit="1";
                bin=binDigit+bin;
            }
            decimal = decimal / 2;

        }
        System.out.println(bin);

      //5.38
        System.out.println("enter a decimal number: ");
        int decimal = input.nextInt();
        String oct="";
        while (decimal != 0) {
            int octValue=decimal%8;
            if (octValue==0){
                String binDigit="0";
                oct=binDigit+oct;
            }
            else if (octValue==1){
                String binDigit="1";
                oct=binDigit+oct;
            }
            else if (octValue==2){
                String binDigit="2";
                oct=binDigit+oct;
            }
            else if (octValue==3){
                String binDigit="3";
                oct=binDigit+oct;
            }
            else if (octValue==4){
                String binDigit="4";
                oct=binDigit+oct;
            }
            else if (octValue==5){
                String binDigit="5";
                oct=binDigit+oct;
            }
            else if (octValue==6){
                String binDigit="6";
                oct=binDigit+oct;
            }
            else if (octValue==7){
                String binDigit="7";
                oct=binDigit+oct;
            }
            decimal=decimal/8;

        }
        System.out.println(oct);

      //5.39
        double a =2910000/112;

        System.out.println(a+10);

      //5.43
        for (int i=1; i<8;i++){
            for(int j=1; j<8; j++){
                System.out.println(i+" "+j);
            }
        }

     //5.45
        System.out.print("Enter 10 number : ");
        double a0=input.nextDouble();
        double a1=input.nextDouble();
        double a2=input.nextDouble();
        double a3=input.nextDouble();
        double a4=input.nextDouble();
        double a5=input.nextDouble();
        double a6=input.nextDouble();
        double a7=input.nextDouble();
        double a8=input.nextDouble();
        double a9=input.nextDouble();
        double total=a0+a1+a2+a3+a4+a5+a6+a7+a8+a9;
        double mean= (total)/10;
        System.out.println("mean of the ten number is : "+mean);
        double d=(a0*a0)+(a1*a1)+(a2*a2)+(a3*a3)+(a4*a4)+(a5*a5)+(a6*a6)+(a7*a7)+(a8*a8)+(a9*a9);
        double deviation=Math.sqrt((d-(total*total)/10)/9);
        System.out.println("deviation of the ten number is : "+deviation);



      //5.46
        System.out.print("write a string and  i will revers: ");
        String s = input.nextLine();
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);

        }
        System.out.println(reversed);



        //5.47
        System.out.println("for identfy book input 12 digits: ");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();
        String s4 = input.nextLine();
        String s5 = input.nextLine();
        String s6 = input.nextLine();
        String s7 = input.nextLine();
        String s8 = input.nextLine();
        String s9 = input.nextLine();
        String s10 = input.nextLine();
        String s11 = input.nextLine();
        String s12 = input.nextLine();
        String message=s1+s2+s3+s4+s5+s6+s7+s8+s9+s10+s11+s12;
        if (message.length()!= 12){
            System.out.println(message+ " is not a valid book ID");
        }
        else {
            int d1 = Integer.parseInt(s1);
            int d2 = Integer.parseInt(s2);
            int d3 = Integer.parseInt(s3);
            int d4 = Integer.parseInt(s4);
            int d5 = Integer.parseInt(s5);
            int d6 = Integer.parseInt(s6);
            int d7 = Integer.parseInt(s7);
            int d8 = Integer.parseInt(s8);
            int d9 = Integer.parseInt(s9);
            int d10 = Integer.parseInt(s10);
            int d11 = Integer.parseInt(s11);
            int d12 = Integer.parseInt(s12);
            int d13 = 10-((d1+3*d2+d3+3*d4+d5+3*d6+d7+3*d8+d9+3*d10+d11+3*d12)%10);
            if(d13==10){
                d13=0;
            }
            System.out.println(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+d10+""+d11+""+d12+""+d13);
        }

        //5.48
        System.out.println("enter a string words or sentence: ");
        String words = input.nextLine();

        for (int i=0; i<words.length(); i+=2) {
            System.out.print(words.charAt(i));
        }

        //5.49
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        int up=0;
        int low=0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ' ':break;
                case 'A':up++;break;
                case 'a':up++;break;
                case 'E':up++;break;
                case 'e':up++;break;
                case 'O':up++;break;
                case 'o':up++;break;
                case 'I':up++;break;
                case 'i':up++;break;
                case 'U':up++;break;
                case 'u':up++;break;
                default:low++;break;
            }

        }
        System.out.println(" the number of vowel is " +up);
        System.out.println(" the number of consonant is " +low);

        //5.50
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        int up=0;
        int low=0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ' ':break;
                case 'A':up++;break;
                case 'B':up++;break;
                case 'C':up++;break;
                case 'D':up++;break;
                case 'E':up++;break;
                case 'F':up++;break;
                case 'G':up++;break;
                case 'H':up++;break;
                case 'I':up++;break;
                case 'J':up++;break;
                case 'K':up++;break;
                case 'L':up++;break;
                case 'M':up++;break;
                case 'N':up++;break;
                case 'O':up++;break;
                case 'P':up++;break;
                case 'Q':up++;break;
                case 'R':up++;break;
                case 'S':up++;break;
                case 'T':up++;break;
                case 'U':up++;break;
                case 'V':up++;break;
                case 'W':up++;break;
                case 'X':up++;break;
                case 'Y':up++;break;
                case 'Z':up++;break;
                default:low++;break;
            }

        }
        System.out.println(" the number of uppercase letter is  " +up);

        //5.51

        System.out.print("enter the first string: ");
        String s = sc.nextLine();
        System.out.print("enter the second string: ");
        String t = sc.nextLine();
        String common="";
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (cs != ct) {continue;}
            else if (cs == ct) {
                common = common + ct;
            }
        }
        System.out.println(common);
*/      //5.29

        System.out.println("Enter the year ");
        int year=sc.nextInt();
        System.out.println("enter the day as number 0-6:");
        int firstDay=sc.nextInt();
        String day = "";
        String month="";

        if(year%4==0){
            for (int a=0;a<12;a++){
                switch(a){
                    case 0:month="January";break;
                    case 1:month="February";break;
                    case 2:month="March";break;
                    case 3:month="April";break;
                    case 4:month="May";break;
                    case 5:month="June";break;
                    case 6:month="July";break;
                    case 7:month="August";break;
                    case 8:month="September";break;
                    case 9:month="October";break;
                    case 10:month="November";break;
                    case 11:month="December";break;
                }
                switch (month){
                    case "January":break;
                    case "February":firstDay+=31;break;
                    case "March":firstDay+=29;break;
                    case "April":firstDay+=31;break;
                    case "May":firstDay+=31;break;
                    case "June":firstDay+=31;break;
                    case "July":firstDay+=30;break;
                    case "August":firstDay+=31;break;
                    case "September":firstDay+=31;break;
                    case "October":firstDay+=30;break;
                    case "November":firstDay+=31;break;
                    case "December":firstDay+=30;break;
                }
                switch (firstDay%7) {
                    case 0:day="sunday";break;
                    case 1:day="monday";break;
                    case 2:day="tuesday";break;
                    case 3:day="wednesday";break;
                    case 4:day="thursday";break;
                    case 5:day="friday";break;
                    case 6:day="saturday";break;
                }
                System.out.println();
                System.out.printf("               %s %d %n",month,year);
                System.out.println("_____________________________________________");
                System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
                if(day.equals("sunday")){
                    int count=1;
                    for(int i=1;i<=6;i++){
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32 && month.equals("January")){break;}
                            else if(count==30 && month.equals("February")){break;}
                            else if(count==32 && month.equals("March")){break;}
                            else if(count==32 && month.equals("April")){break;}
                            else if(count==32 && month.equals("May")){break;}
                            else if(count==31 && month.equals("June")){break;}
                            else if(count==32 && month.equals("July")){break;}
                            else if(count==32 && month.equals("August")){break;}
                            else if(count==31 && month.equals("September")){break;}
                            else if(count==32 && month.equals("October")){break;}
                            else if(count==31 && month.equals("November")){break;}
                            else if(count==32 && month.equals("December")){break;}
                        }if (count==32 && month.equals("January")){break;}
                        else if(count==30 && month.equals("February")){break;}
                        else if(count==32 && month.equals("March")){break;}
                        else if(count==32 && month.equals("April")){break;}
                        else if(count==32 && month.equals("May")){break;}
                        else if(count==31 && month.equals("June")){break;}
                        else if(count==32 && month.equals("July")){break;}
                        else if(count==32 && month.equals("August")){break;}
                        else if(count==31 && month.equals("September")){break;}
                        else if(count==32 && month.equals("October")){break;}
                        else if(count==31 && month.equals("November")){break;}
                        else if(count==32 && month.equals("December")){break;}
                        System.out.println();
                    }
                }
                else if(day.equals("monday")){
                    int count=1;
                    System.out.printf("       ");
                    for(int i=1;i<=6;i++){
                        if(i==1){
                            for(int k=1;k<=6;k++){
                                System.out.printf("%-7d",count);
                                count++;

                            }
                        }
                        else{
                            for(int j=1;j<=7;j++){
                                System.out.printf("%-7d",count);
                                count++;
                                if (count==32 && month.equals("January")){break;}
                                else if(count==30 && month.equals("February")){break;}
                                else if(count==32 && month.equals("March")){break;}
                                else if(count==32 && month.equals("April")){break;}
                                else if(count==32 && month.equals("May")){break;}
                                else if(count==31 && month.equals("June")){break;}
                                else if(count==32 && month.equals("July")){break;}
                                else if(count==32 && month.equals("August")){break;}
                                else if(count==31 && month.equals("September")){break;}
                                else if(count==32 && month.equals("October")){break;}
                                else if(count==31 && month.equals("November")){break;}
                                else if(count==32 && month.equals("December")){break;}
                            }
                        }if (count==32 && month.equals("January")){break;}
                        else if(count==30 && month.equals("February")){break;}
                        else if(count==32 && month.equals("March")){break;}
                        else if(count==32 && month.equals("April")){break;}
                        else if(count==32 && month.equals("May")){break;}
                        else if(count==31 && month.equals("June")){break;}
                        else if(count==32 && month.equals("July")){break;}
                        else if(count==32 && month.equals("August")){break;}
                        else if(count==31 && month.equals("September")){break;}
                        else if(count==32 && month.equals("October")){break;}
                        else if(count==31 && month.equals("November")){break;}
                        else if(count==32 && month.equals("December")){break;}
                        System.out.println();
                    }
                }
                else if(day.equals("tuesday")){
                    int count=1;
                    System.out.printf("              ");
                    for(int i=1;i<=6;i++){
                        if(i==1){
                            for(int k=1;k<=5;k++){
                                System.out.printf("%-7d",count);
                                count++;

                            }
                        }
                        else{
                            for(int j=1;j<=7;j++){
                                System.out.printf("%-7d",count);
                                count++;
                                if (count==32 && month.equals("January")){break;}
                                else if(count==30 && month.equals("February")){break;}
                                else if(count==32 && month.equals("March")){break;}
                                else if(count==32 && month.equals("April")){break;}
                                else if(count==32 && month.equals("May")){break;}
                                else if(count==31 && month.equals("June")){break;}
                                else if(count==32 && month.equals("July")){break;}
                                else if(count==32 && month.equals("August")){break;}
                                else if(count==31 && month.equals("September")){break;}
                                else if(count==32 && month.equals("October")){break;}
                                else if(count==31 && month.equals("November")){break;}
                                else if(count==32 && month.equals("December")){break;}
                            }
                        }if (count==32 && month.equals("January")){break;}
                        else if(count==30 && month.equals("February")){break;}
                        else if(count==32 && month.equals("March")){break;}
                        else if(count==32 && month.equals("April")){break;}
                        else if(count==32 && month.equals("May")){break;}
                        else if(count==31 && month.equals("June")){break;}
                        else if(count==32 && month.equals("July")){break;}
                        else if(count==32 && month.equals("August")){break;}
                        else if(count==31 && month.equals("September")){break;}
                        else if(count==32 && month.equals("October")){break;}
                        else if(count==31 && month.equals("November")){break;}
                        else if(count==32 && month.equals("December")){break;}
                        System.out.println();
                    }
                }
                else if(day.equals("wednesday")){
                    int count=1;
                    System.out.printf("                     ");
                    for(int i=1;i<=6;i++){
                        if(i==1){
                            for(int k=1;k<=4;k++){
                                System.out.printf("%-7d",count);
                                count++;

                            }
                        }
                        else{
                            for(int j=1;j<=7;j++){
                                System.out.printf("%-7d",count);
                                count++;
                                if (count==32 && month.equals("January")){break;}
                                else if(count==30 && month.equals("February")){break;}
                                else if(count==32 && month.equals("March")){break;}
                                else if(count==32 && month.equals("April")){break;}
                                else if(count==32 && month.equals("May")){break;}
                                else if(count==31 && month.equals("June")){break;}
                                else if(count==32 && month.equals("July")){break;}
                                else if(count==32 && month.equals("August")){break;}
                                else if(count==31 && month.equals("September")){break;}
                                else if(count==32 && month.equals("October")){break;}
                                else if(count==31 && month.equals("November")){break;}
                                else if(count==32 && month.equals("December")){break;}
                            }
                            if (count==32 && month.equals("January")){break;}
                            else if(count==30 && month.equals("February")){break;}
                            else if(count==32 && month.equals("March")){break;}
                            else if(count==32 && month.equals("April")){break;}
                            else if(count==32 && month.equals("May")){break;}
                            else if(count==31 && month.equals("June")){break;}
                            else if(count==32 && month.equals("July")){break;}
                            else if(count==32 && month.equals("August")){break;}
                            else if(count==31 && month.equals("September")){break;}
                            else if(count==32 && month.equals("October")){break;}
                            else if(count==31 && month.equals("November")){break;}
                            else if(count==32 && month.equals("December")){break;}
                        }
                        System.out.println();
                    }
                }
                else if(day.equals("thursday")){
                    int count=1;
                    System.out.printf("                            ");
                    for(int i=1;i<=6;i++){
                        if(i==1){
                            for(int k=1;k<=3;k++){
                                System.out.printf("%-7d",count);
                                count++;

                            }
                        }
                        else{
                            for(int j=1;j<=7;j++){
                                System.out.printf("%-7d",count);
                                count++;
                                if (count==32 && month.equals("January")){break;}
                                else if(count==30 && month.equals("February")){break;}
                                else if(count==32 && month.equals("March")){break;}
                                else if(count==32 && month.equals("April")){break;}
                                else if(count==32 && month.equals("May")){break;}
                                else if(count==31 && month.equals("June")){break;}
                                else if(count==32 && month.equals("July")){break;}
                                else if(count==32 && month.equals("August")){break;}
                                else if(count==31 && month.equals("September")){break;}
                                else if(count==32 && month.equals("October")){break;}
                                else if(count==31 && month.equals("November")){break;}
                                else if(count==32 && month.equals("December")){break;}
                            }
                        }if (count==32 && month.equals("January")){break;}
                        else if(count==30 && month.equals("February")){break;}
                        else if(count==32 && month.equals("March")){break;}
                        else if(count==32 && month.equals("April")){break;}
                        else if(count==32 && month.equals("May")){break;}
                        else if(count==31 && month.equals("June")){break;}
                        else if(count==32 && month.equals("July")){break;}
                        else if(count==32 && month.equals("August")){break;}
                        else if(count==31 && month.equals("September")){break;}
                        else if(count==32 && month.equals("October")){break;}
                        else if(count==31 && month.equals("November")){break;}
                        else if(count==32 && month.equals("December")){break;}
                        System.out.println();
                    }
                }
                else if(day.equals("friday")){
                    int count=1;
                    System.out.printf("                                   ");
                    for(int i=1;i<=6;i++){
                        if(i==1){
                            for(int k=1;k<=2;k++){
                                System.out.printf("%-7d",count);
                                count++;

                            }
                        }
                        else{
                            for(int j=1;j<=7;j++){
                                System.out.printf("%-7d",count);
                                count++;
                                if (count==32 && month.equals("January")){break;}
                                else if(count==30 && month.equals("February")){break;}
                                else if(count==32 && month.equals("March")){break;}
                                else if(count==32 && month.equals("April")){break;}
                                else if(count==32 && month.equals("May")){break;}
                                else if(count==31 && month.equals("June")){break;}
                                else if(count==32 && month.equals("July")){break;}
                                else if(count==32 && month.equals("August")){break;}
                                else if(count==31 && month.equals("September")){break;}
                                else if(count==32 && month.equals("October")){break;}
                                else if(count==31 && month.equals("November")){break;}
                                else if(count==32 && month.equals("December")){break;}
                            }
                            if (count==32 && month.equals("January")){break;}
                            else if(count==30 && month.equals("February")){break;}
                            else if(count==32 && month.equals("March")){break;}
                            else if(count==32 && month.equals("April")){break;}
                            else if(count==32 && month.equals("May")){break;}
                            else if(count==31 && month.equals("June")){break;}
                            else if(count==32 && month.equals("July")){break;}
                            else if(count==32 && month.equals("August")){break;}
                            else if(count==31 && month.equals("September")){break;}
                            else if(count==32 && month.equals("October")){break;}
                            else if(count==31 && month.equals("November")){break;}
                            else if(count==32 && month.equals("December")){break;}
                        }
                        System.out.println();
                    }
                }
                else if(day.equals("saturday")){
                    int count=1;
                    System.out.printf("                                          ");
                    for(int i=1;i<=6;i++){
                        if(i==1){
                            for(int k=1;k<=1;k++){
                                System.out.printf("%-7d",count);
                                count++;

                            }
                        }
                        else{
                            for(int j=1;j<=7;j++){
                                System.out.printf("%-7d",count);
                                count++;
                                if (count==32 && month.equals("January")){break;}
                                else if(count==30 && month.equals("February")){break;}
                                else if(count==32 && month.equals("March")){break;}
                                else if(count==32 && month.equals("April")){break;}
                                else if(count==32 && month.equals("May")){break;}
                                else if(count==31 && month.equals("June")){break;}
                                else if(count==32 && month.equals("July")){break;}
                                else if(count==32 && month.equals("August")){break;}
                                else if(count==31 && month.equals("September")){break;}
                                else if(count==32 && month.equals("October")){break;}
                                else if(count==31 && month.equals("November")){break;}
                                else if(count==32 && month.equals("December")){break;}
                            }
                            if (count==32 && month.equals("January")){break;}
                            else if(count==30 && month.equals("February")){break;}
                            else if(count==32 && month.equals("March")){break;}
                            else if(count==32 && month.equals("April")){break;}
                            else if(count==32 && month.equals("May")){break;}
                            else if(count==31 && month.equals("June")){break;}
                            else if(count==32 && month.equals("July")){break;}
                            else if(count==32 && month.equals("August")){break;}
                            else if(count==31 && month.equals("September")){break;}
                            else if(count==32 && month.equals("October")){break;}
                            else if(count==31 && month.equals("November")){break;}
                            else if(count==32 && month.equals("December")){break;}
                        }
                        System.out.println();
                    }
                }

            }
        }
        else{
            for (int a=0;a<12;a++){
                switch(a){
                    case 0:month="January";break;
                    case 1:month="February";break;
                    case 2:month="March";break;
                    case 3:month="April";break;
                    case 4:month="May";break;
                    case 5:month="June";break;
                    case 6:month="July";break;
                    case 7:month="August";break;
                    case 8:month="September";break;
                    case 9:month="October";break;
                    case 10:month="November";break;
                    case 11:month="December";break;
                }
                switch (month){
                    case "January":break;
                    case "February":firstDay+=31;break;
                    case "March":firstDay+=28;break;
                    case "April":firstDay+=31;break;
                    case "May":firstDay+=31;break;
                    case "June":firstDay+=31;break;
                    case "July":firstDay+=30;break;
                    case "August":firstDay+=31;break;
                    case "September":firstDay+=31;break;
                    case "October":firstDay+=30;break;
                    case "November":firstDay+=31;break;
                    case "December":firstDay+=30;break;
                }
                switch (firstDay%7) {
                    case 0:day="sunday";break;
                    case 1:day="monday";break;
                    case 2:day="tuesday";break;
                    case 3:day="wednesday";break;
                    case 4:day="thursday";break;
                    case 5:day="friday";break;
                    case 6:day="saturday";break;
                }
                System.out.println();
                System.out.printf("               %s %d %n",month,year);
                System.out.println("_____________________________________________");
                System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
                if(day.equals("sunday")){
                    int count=1;
                    for(int i=1;i<=6;i++){
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32 && month.equals("January")){break;}
                            else if(count==29 && month.equals("February")){break;}
                            else if(count==32 && month.equals("March")){break;}
                            else if(count==32 && month.equals("April")){break;}
                            else if(count==32 && month.equals("May")){break;}
                            else if(count==31 && month.equals("June")){break;}
                            else if(count==32 && month.equals("July")){break;}
                            else if(count==32 && month.equals("August")){break;}
                            else if(count==31 && month.equals("September")){break;}
                            else if(count==32 && month.equals("October")){break;}
                            else if(count==31 && month.equals("November")){break;}
                            else if(count==32 && month.equals("December")){break;}
                        }if (count==32 && month.equals("January")){break;}
                        else if(count==29 && month.equals("February")){break;}
                        else if(count==32 && month.equals("March")){break;}
                        else if(count==32 && month.equals("April")){break;}
                        else if(count==32 && month.equals("May")){break;}
                        else if(count==31 && month.equals("June")){break;}
                        else if(count==32 && month.equals("July")){break;}
                        else if(count==32 && month.equals("August")){break;}
                        else if(count==31 && month.equals("September")){break;}
                        else if(count==32 && month.equals("October")){break;}
                        else if(count==31 && month.equals("November")){break;}
                        else if(count==32 && month.equals("December")){break;}
                        System.out.println();
                    }
                }
                else if(day.equals("monday")){
                    int count=1;
                    System.out.printf("       ");
                    for(int i=1;i<=6;i++){
                        if(i==1){
                            for(int k=1;k<=6;k++){
                                System.out.printf("%-7d",count);
                                count++;

                            }
                        }
                        else{
                            for(int j=1;j<=7;j++){
                                System.out.printf("%-7d",count);
                                count++;
                                if (count==32 && month.equals("January")){break;}
                                else if(count==29 && month.equals("February")){break;}
                                else if(count==32 && month.equals("March")){break;}
                                else if(count==32 && month.equals("April")){break;}
                                else if(count==32 && month.equals("May")){break;}
                                else if(count==31 && month.equals("June")){break;}
                                else if(count==32 && month.equals("July")){break;}
                                else if(count==32 && month.equals("August")){break;}
                                else if(count==31 && month.equals("September")){break;}
                                else if(count==32 && month.equals("October")){break;}
                                else if(count==31 && month.equals("November")){break;}
                                else if(count==32 && month.equals("December")){break;}
                            }
                        }if (count==32 && month.equals("January")){break;}
                        else if(count==29 && month.equals("February")){break;}
                        else if(count==32 && month.equals("March")){break;}
                        else if(count==32 && month.equals("April")){break;}
                        else if(count==32 && month.equals("May")){break;}
                        else if(count==31 && month.equals("June")){break;}
                        else if(count==32 && month.equals("July")){break;}
                        else if(count==32 && month.equals("August")){break;}
                        else if(count==31 && month.equals("September")){break;}
                        else if(count==32 && month.equals("October")){break;}
                        else if(count==31 && month.equals("November")){break;}
                        else if(count==32 && month.equals("December")){break;}
                        System.out.println();
                    }
                }
                else if(day.equals("tuesday")){
                    int count=1;
                    System.out.printf("              ");
                    for(int i=1;i<=6;i++){
                        if(i==1){
                            for(int k=1;k<=5;k++){
                                System.out.printf("%-7d",count);
                                count++;

                            }
                        }
                        else{
                            for(int j=1;j<=7;j++){
                                System.out.printf("%-7d",count);
                                count++;
                                if (count==32 && month.equals("January")){break;}
                                else if(count==29 && month.equals("February")){break;}
                                else if(count==32 && month.equals("March")){break;}
                                else if(count==32 && month.equals("April")){break;}
                                else if(count==32 && month.equals("May")){break;}
                                else if(count==31 && month.equals("June")){break;}
                                else if(count==32 && month.equals("July")){break;}
                                else if(count==32 && month.equals("August")){break;}
                                else if(count==31 && month.equals("September")){break;}
                                else if(count==32 && month.equals("October")){break;}
                                else if(count==31 && month.equals("November")){break;}
                                else if(count==32 && month.equals("December")){break;}
                            }
                        }if (count==32 && month.equals("January")){break;}
                        else if(count==29 && month.equals("February")){break;}
                        else if(count==32 && month.equals("March")){break;}
                        else if(count==32 && month.equals("April")){break;}
                        else if(count==32 && month.equals("May")){break;}
                        else if(count==31 && month.equals("June")){break;}
                        else if(count==32 && month.equals("July")){break;}
                        else if(count==32 && month.equals("August")){break;}
                        else if(count==31 && month.equals("September")){break;}
                        else if(count==32 && month.equals("October")){break;}
                        else if(count==31 && month.equals("November")){break;}
                        else if(count==32 && month.equals("December")){break;}
                        System.out.println();
                    }
                }
                else if(day.equals("wednesday")){
                    int count=1;
                    System.out.printf("                     ");
                    for(int i=1;i<=6;i++){
                        if(i==1){
                            for(int k=1;k<=4;k++){
                                System.out.printf("%-7d",count);
                                count++;

                            }
                        }
                        else{
                            for(int j=1;j<=7;j++){
                                System.out.printf("%-7d",count);
                                count++;
                                if (count==32 && month.equals("January")){break;}
                                else if(count==29 && month.equals("February")){break;}
                                else if(count==32 && month.equals("March")){break;}
                                else if(count==32 && month.equals("April")){break;}
                                else if(count==32 && month.equals("May")){break;}
                                else if(count==31 && month.equals("June")){break;}
                                else if(count==32 && month.equals("July")){break;}
                                else if(count==32 && month.equals("August")){break;}
                                else if(count==31 && month.equals("September")){break;}
                                else if(count==32 && month.equals("October")){break;}
                                else if(count==31 && month.equals("November")){break;}
                                else if(count==32 && month.equals("December")){break;}
                            }
                            if (count==32 && month.equals("January")){break;}
                            else if(count==29 && month.equals("February")){break;}
                            else if(count==32 && month.equals("March")){break;}
                            else if(count==32 && month.equals("April")){break;}
                            else if(count==32 && month.equals("May")){break;}
                            else if(count==31 && month.equals("June")){break;}
                            else if(count==32 && month.equals("July")){break;}
                            else if(count==32 && month.equals("August")){break;}
                            else if(count==31 && month.equals("September")){break;}
                            else if(count==32 && month.equals("October")){break;}
                            else if(count==31 && month.equals("November")){break;}
                            else if(count==32 && month.equals("December")){break;}
                        }
                        System.out.println();
                    }
                }
                else if(day.equals("thursday")){
                    int count=1;
                    System.out.printf("                            ");
                    for(int i=1;i<=6;i++){
                        if(i==1){
                            for(int k=1;k<=3;k++){
                                System.out.printf("%-7d",count);
                                count++;

                            }
                        }
                        else{
                            for(int j=1;j<=7;j++){
                                System.out.printf("%-7d",count);
                                count++;
                                if (count==32 && month.equals("January")){break;}
                                else if(count==29 && month.equals("February")){break;}
                                else if(count==32 && month.equals("March")){break;}
                                else if(count==32 && month.equals("April")){break;}
                                else if(count==32 && month.equals("May")){break;}
                                else if(count==31 && month.equals("June")){break;}
                                else if(count==32 && month.equals("July")){break;}
                                else if(count==32 && month.equals("August")){break;}
                                else if(count==31 && month.equals("September")){break;}
                                else if(count==32 && month.equals("October")){break;}
                                else if(count==31 && month.equals("November")){break;}
                                else if(count==32 && month.equals("December")){break;}
                            }
                        }if (count==32 && month.equals("January")){break;}
                        else if(count==29 && month.equals("February")){break;}
                        else if(count==32 && month.equals("March")){break;}
                        else if(count==32 && month.equals("April")){break;}
                        else if(count==32 && month.equals("May")){break;}
                        else if(count==31 && month.equals("June")){break;}
                        else if(count==32 && month.equals("July")){break;}
                        else if(count==32 && month.equals("August")){break;}
                        else if(count==31 && month.equals("September")){break;}
                        else if(count==32 && month.equals("October")){break;}
                        else if(count==31 && month.equals("November")){break;}
                        else if(count==32 && month.equals("December")){break;}
                        System.out.println();
                    }
                }
                else if(day.equals("friday")){
                    int count=1;
                    System.out.printf("                                   ");
                    for(int i=1;i<=6;i++){
                        if(i==1){
                            for(int k=1;k<=2;k++){
                                System.out.printf("%-7d",count);
                                count++;

                            }
                        }
                        else{
                            for(int j=1;j<=7;j++){
                                System.out.printf("%-7d",count);
                                count++;
                                if (count==32 && month.equals("January")){break;}
                                else if(count==29 && month.equals("February")){break;}
                                else if(count==32 && month.equals("March")){break;}
                                else if(count==32 && month.equals("April")){break;}
                                else if(count==32 && month.equals("May")){break;}
                                else if(count==31 && month.equals("June")){break;}
                                else if(count==32 && month.equals("July")){break;}
                                else if(count==32 && month.equals("August")){break;}
                                else if(count==31 && month.equals("September")){break;}
                                else if(count==32 && month.equals("October")){break;}
                                else if(count==31 && month.equals("November")){break;}
                                else if(count==32 && month.equals("December")){break;}
                            }
                            if (count==32 && month.equals("January")){break;}
                            else if(count==29 && month.equals("February")){break;}
                            else if(count==32 && month.equals("March")){break;}
                            else if(count==32 && month.equals("April")){break;}
                            else if(count==32 && month.equals("May")){break;}
                            else if(count==31 && month.equals("June")){break;}
                            else if(count==32 && month.equals("July")){break;}
                            else if(count==32 && month.equals("August")){break;}
                            else if(count==31 && month.equals("September")){break;}
                            else if(count==32 && month.equals("October")){break;}
                            else if(count==31 && month.equals("November")){break;}
                            else if(count==32 && month.equals("December")){break;}
                        }
                        System.out.println();
                    }
                }
                else if(day.equals("saturday")){
                    int count=1;
                    System.out.printf("                                          ");
                    for(int i=1;i<=6;i++){
                        if(i==1){
                            for(int k=1;k<=1;k++){
                                System.out.printf("%-7d",count);
                                count++;

                            }
                        }
                        else{
                            for(int j=1;j<=7;j++){
                                System.out.printf("%-7d",count);
                                count++;
                                if (count==32 && month.equals("January")){break;}
                                else if(count==29 && month.equals("February")){break;}
                                else if(count==32 && month.equals("March")){break;}
                                else if(count==32 && month.equals("April")){break;}
                                else if(count==32 && month.equals("May")){break;}
                                else if(count==31 && month.equals("June")){break;}
                                else if(count==32 && month.equals("July")){break;}
                                else if(count==32 && month.equals("August")){break;}
                                else if(count==31 && month.equals("September")){break;}
                                else if(count==32 && month.equals("October")){break;}
                                else if(count==31 && month.equals("November")){break;}
                                else if(count==32 && month.equals("December")){break;}
                            }
                            if (count==32 && month.equals("January")){break;}
                            else if(count==29 && month.equals("February")){break;}
                            else if(count==32 && month.equals("March")){break;}
                            else if(count==32 && month.equals("April")){break;}
                            else if(count==32 && month.equals("May")){break;}
                            else if(count==31 && month.equals("June")){break;}
                            else if(count==32 && month.equals("July")){break;}
                            else if(count==32 && month.equals("August")){break;}
                            else if(count==31 && month.equals("September")){break;}
                            else if(count==32 && month.equals("October")){break;}
                            else if(count==31 && month.equals("November")){break;}
                            else if(count==32 && month.equals("December")){break;}
                        }
                        System.out.println();
                    }
                }

            }

        }

    }


}


