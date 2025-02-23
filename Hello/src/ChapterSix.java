import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ChapterSix {
/*    public static int sum(int i1, int i2) {
        int result = 0;
        for (int i = i1; i <= i2; i++)
            result += i;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 is " + sum(1, 10));
        System.out.println("Sum from 20 to 37 is " + sum(20, 37));
        System.out.println("Sum from 35 to 49 is " + sum(35, 49));
    }
*/  //6.1
/*    public static void main(String[] args) {
        for (int i=1;i<=100;i++) {
            if (i%10==0){
                System.out.println(getPentagonalNumber(i));
            }else{
                System.out.print(getPentagonalNumber(i)+" ");
            }
        }
    }
    public static int getPentagonalNumber(int n){
        int a= n*(3*n-1)/2;
        return a;
    }
*/  //6.2
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number, i will separete and sum digit:");
        int a=sc.nextInt();
        System.out.println(sumDigits(a));
    }
    public static int sumDigits(long n){
        int sum=0;
        while(n!=0){
            sum += (int) (n%10);
            n=n/10;
        }
        return sum;
    }
*/  //6.3
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that we will check is it palindrome or not: ");
        int a= sc.nextInt();
        //System.out.println(reverse(a));
        System.out.println(isPalindrome(a));
    }
    public static int reverse(int number){
        String num=String.valueOf(number);
        String rev="";
        for (int i=num.length()-1;i>=0;i--){
            rev+=num.charAt(i);
        }
        return Integer.parseInt(rev);

    }
    public static boolean isPalindrome(int number){
        if(number==reverse(number)){return true;}
        else{return false;}
    }
*/  //6.4
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that we will check is it palindrome or not: ");
        int a= sc.nextInt();
        System.out.println(reverse(a));
    }
    public static int reverse(int number){
        String num=String.valueOf(number);
        String rev="";
        for (int i=num.length()-1;i>=0;i--){
            rev+=num.charAt(i);
        }
        return Integer.parseInt(rev);

    }
*/  //6.5
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number and program will sort them by increasing order: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        displaySortedNumbers(a, b, c);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        double first=num1;
        double second=num2;
        double third=num3;
        if(num1<num2 && num1<num3){
            first=num1;
            if (num2<num3){
                second=num2;
                third=num3;
                System.out.println(first+" "+second+" "+ third);

            }
            else{
                second=num3;
                third=num2;
                System.out.println(first+" "+second+" "+ third);
            }
        }
        else if(num2<num3 && num2<num1){
            first=num2;
            if (num1<num3){
                second=num1;
                third=num3;
                System.out.println(first+" "+second+" "+ third);

            }
            else{
                second=num3;
                third=num1;
                System.out.println(first+" "+second+" "+ third);
            }
        }
        else if(num3<num2 && num3<num1){
            first=num3;
            if (num2<num1){
                second=num2;
                third=num1;
                System.out.println(first+" "+second+" "+ third);

            }
            else{
                second=num1;
                third=num2;
                System.out.println(first+" "+second+" "+ third);
            }
        }
        else{
            System.out.println(first+" "+second+" "+third);
        }
    }
*/  //6.6
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height of the pattern:");
        int height=sc.nextInt();
        displayPattern(height);
    }
    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >0; j--) {
                System.out.print("    ");
            }
            for (int k = i; k >0; k--) {
                System.out.printf("%d   ", k);
            }
            System.out.println();
        }
    }
*/  //6.7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter amount invested: " );
        double invested=sc.nextDouble();
        System.out.print("annual interest rate: " );
        double rate=sc.nextDouble();
        System.out.println("year for future investement: ");
        int year=sc.nextInt();
        System.out.println("Years     Future value");
        for (int i=1;i<=year*12;i++) {
            System.out.println(i+"       "+futureInvestmentValue(invested, rate, year));
        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
            investmentAmount += investmentAmount * monthlyInterestRate;
        return investmentAmount;
    }
}

