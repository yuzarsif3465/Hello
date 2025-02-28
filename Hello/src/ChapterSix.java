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
/*        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter amount invested: " );
        double invested=sc.nextDouble();
        System.out.print("annual interest rate: " );
        double rate =sc.nextDouble()/100;
        System.out.println("year for future investement: ");
        int year=sc.nextInt();
        for(int i=1;i<=year;i++){
            futureInvestmentValue(invested,rate,i,year);
        }
    }
    public static void futureInvestmentValue(double investmentAmount, double InterestRate, double i, int years){
        System.out.print(investmentAmount * Math.pow(1 + (InterestRate/years), years*i));
    }
*/
/*    //6.8
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius = 40;
        double fahrenheit=120.0;
        System.out.println("Celsius     Fahrenheit     |     Fahrenheit     Celsius");
        System.out.println("___________________________________________________________");
        for (;celsius>=31;celsius--,fahrenheit-=10){
            System.out.printf("%.2f       %.2f               %.2f              %.2f%n",celsius,celsiusToFahrenheit(celsius),fahrenheit,fahrenheitToCelsius(fahrenheit));
            //System.out.println(celsius+"         "+celsiusToFahrenheit(celsius)+"             "+fahrenheit+"           "+fahrenheitToCelsius(fahrenheit));
        }
    }

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * (9.0/5)) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit -32) * (5.0/9);
    }
*/
      //6.13
/*    public static void main(String[] args) {
        System.out.println("i          m(i)");
        System.out.println("_______________");
        for (double i=1; i<=20; i++) {
            System.out.printf("%.4f %.4f%n", i,Sum(i));
        }
    }
    public static double Sum(double i){
        double sum = 0;
        for (;i>=0;i--){
            sum+=i/(i+1);
        }
        return sum;
    }
*/      //6.14
/*    public static void main(String[] args) {
        System.out.println("i          m(i)");
        for (int i=1; i<=901; i+=100) {
            if (i==1){
                System.out.printf("%d           %.4f%n",i,estimate(i));
            }
            else {
                System.out.printf("%d         %.4f%n", i, estimate(i));
            }
        }
    }
    public static double estimate(int a){
        double sum = 0;
        for (int i=1; i<=a; i++) {
            sum += Math.pow(-1,i+1)/(2*i-1);
        }
        return 4*sum;
    }
*/  //6.15
/*    public static void main(String[] args) {
        //0.17 0.13 0.14
        System.out.println("Texable      Single      Married Joint     Married           Head of");
        System.out.println("Income                   or Qualifying     Separate          a House");
        System.out.println("                         Widow(er)");
        System.out.println("____________________________________________________________________");
        for (int i= 50000; i<=60000;i+=50){
            computeTax(i,0.17,0.13,0.14);
        }
    }
    public static void computeTax(int i, double single, double married, double house) {
        double s=i*single;
        double m=i*married;
        double h=i*house;

        System.out.printf("%d        %.0f        %.0f              %.0f              %.0f%n",i,s,m,s,h);
    }
*/
/*    //6.17
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number for matrix: ");
        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            printMatrix(m);
            System.out.println();
        }
    }
    public static void printMatrix(int matrix) {
        for (int i = 0; i < matrix; i++) {
            int k=(int)(Math.random()*2);
            System.out.printf("%d ",k);
        }
    }
*/
    //6.18
/*    public static void main(String[] args) {
        System.out.print("enter a password: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        if(password(password)==true){
            System.out.println("valid password");
        }
        else{
            System.out.println("invalid password");
        }
    }
    public static boolean password(String password){
        if(password.length()>=8){
            int digit =0;
            for(int i = 0; i<password.length(); i++){
                if(47<password.charAt(i)&& password.charAt(i)<58){
                    digit++;
                }
                else if((96<password.charAt(i)&& password.charAt(i)<123)||(64<password.charAt(i)&& password.charAt(i)<91)){}
                else{
                    return false;
                }
            }
            if(digit<2){
                return false;
            }
            else{return true;}
        }

        else{return false;}
    }
*/
    //6.19
/*    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 number for triangle : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (isValid(a, b, c)) {
            System.out.println("Valid triangle");
            System.out.printf("area of triangle is: %.2f",area(a, b, c));
        }
        else {
            System.out.println("Invalid input");
        }

    }
    public static boolean isValid(double side1, double side2, double side3){
        if (side1>side2 && side1>side3){
            if (side2+side3>side1){
                return true;
            }
            else{return false;}
        }
        else if (side2>side1 && side2>side3){
            if (side1+side3>side2){
                return true;
            }
            else{return false;}
        }
        else{
            if (side2+side1>side3){
                return true;
            }
            else{return false;}
        }
    }
    public static double area(double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.pow(s*(s-a)*(s-b)*(s-c),0.5);
    }
*/  //6.20
/*    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string: ");
        String s = input.nextLine();
        System.out.println("this string has "+countLetters(s)+" letters");
    }
    public static int countLetters(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        return count;
    }
*/  //6.22 solve this problem later

/*    //6.23
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write a string and input a char than program will print number of occurrences of the character: ");
        String s = input.nextLine();
        char ch = input.next().charAt(0);
        int a=count(s, ch);
        if(a == -1) {
            System.out.println("invalid input");
        }
        else {
            System.out.println(a+". is the occurrence of "+ch);
        }

    }
    public static int count(String str, char a){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                return i;
            }
        }
        return -1;
    }
*/  //6.24
    //6.25
/*    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a miliseconds: ");
        long time = input.nextLong();
        System.out.println(convertMillis(time));

    }
    public static String convertMillis(long millis){
        int seconds = (int) (millis / 1000);
        int minutes = seconds / 60;
        int currentSeconds = seconds % 60;
        int hours = minutes / 60;
        int currentMinutes = minutes % 60;
        return String.format("%02d:%02d:%02d", hours, currentMinutes, currentSeconds);

    }
*/
    //6.26
/*    public static void main(String[] args) {
        System.out.println(prime(9));
        int count=1;
        System.out.printf("%d ", 2);

        for (int i=3; count<100;i++) {

            if(prime(i)==true && palindromic(i)==true) {
                System.out.printf("%d ", i);
                count++;
                if(count%10==0){
                    System.out.println();
                }
                else{continue;}
            }



        }

    }
    public static boolean prime(int n) {
        boolean prime = true;
        for (int i=2; i<n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static boolean palindromic(int n) {
        String s = String.valueOf(n);
        String reversed="";
        for (int i=s.length()-1; i>=0; i--) {
            reversed += s.charAt(i);
        }
        if(reversed.equals(s)){
            return true;
        }
        else {return false;}
    }
*/
/*    //6.27
    public static void main(String[] args) {
        System.out.println(prime(9));
        int count=0;

        for (int i=13; count<100;i++) {

            if(prime(i)==true && emirp(i)==true) {
                System.out.printf("%d ", i);
                count++;
                if(count%10==0){
                     System.out.println();
                }
                else{continue;}
            }
        }
    }
    public static boolean prime(int n) {
        boolean prime = true;
        for (int i=2; i<n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static boolean emirp(int n) {
        String s = String.valueOf(n);
        String reversed="";
        for (int i=s.length()-1; i>=0; i--) {
            reversed += s.charAt(i);
        }
        int k=Integer.parseInt(reversed);
        if(!reversed.equals(s)){
            if(prime(k)==true){return true;}
            else{return false;}
        }
        else {return false;}
    }
*/  //6.28
/*    public static void main(String[] args) {
        System.out.println("p                2^p-1");
        System.out.println("______________________");
        for (int p=2; p<=31; p++) {
            if(mersenne(p)==-1){ continue;}
            else if(mersenne(p)==-1){continue;}
            else{
                System.out.println(p+"                "+mersenne(p));}
        }
    }
    public static int mersenne(int a){
        int c=-1;
        double b=Math.pow(2,a)-1;
        if (a==2){
            return (int)b;
        }
        else{
            for(int i=2;i<a;i++){
                if(a%i!=0){
                    c=(int)b;
                    break;
                }
                else if(a%i==0){
                    break;
                }
            }
        }
        return c;

    }
*/ /* //6.29
public static void main(String[] args) {
    for (int i=3; i<=1000; i++) {
        int k=0;
        if (twinPrimes(i)==true) {
            for (int j=i+1; j<=1000; j++) {
                if (twinPrimes(j)==true) {
                    System.out.printf("(%d,%d)%n",i,j);
                    break;
                }
            }
        }
    }
}

    public static boolean twinPrimes(int number) {
        boolean twinPrime = true;
        for (int i=2; i<number; i++) {
            if (number % i == 0) {
                twinPrime = false;
            }
        }
        return twinPrime;
    }
*/
/*    //6.30
    public static void main(String[] args) {
        int n=craps();
        if(n==2||n==3||n==12){
            System.out.printf("point is %d you lose%n",n);
        }
        else if(n==7||n==11){
            System.out.printf("point is %d you win%n",n);
        }
        else{
            System.out.printf( "point is %d roll again%n",n);

            int m=craps();
            if(n==2||n==3||n==12){
                System.out.printf("point is %d you lose%n",n);
            }
            else if(n==7||n==11) {
                System.out.printf("point is %d you win%n",n);
            }
            else{
                System.out.println("you lose");
            }
        }

    }
    public static int craps() {
        int n=(int)(Math.random()*7);
        int m=(int)(Math.random()*7);
        return n+m;
    }
*/
//6.31

 /*   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        long number = input.nextLong();
        if (isValid(number)) {
            System.out.println(number + " is a valid credit card number.");
        } else {
            System.out.println(number + " is an invalid credit card number.");
        }
    }

        public static boolean isValid(long number) {
            return (getSize(number) >= 13 && getSize(number) <= 16) && (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                    ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
        }

        public static int sumOfDoubleEvenPlace(long number) {
            String numStr = String.valueOf(number);
            int sum = 0;

            for (int i = numStr.length() - 2; i >= 0; i -= 2) {
                int doubled = (numStr.charAt(i) - '0') * 2;
                sum += getDigit(doubled);
            }
            return sum;
        }

        public static int getDigit(int number) {
            return (number < 10) ? number : (number / 10 + number % 10);
        }

        public static int sumOfOddPlace(long number) {
            String numStr = String.valueOf(number);
            int sum = 0;

            for (int i = numStr.length() - 1; i >= 0; i -= 2) {
                sum += numStr.charAt(i) - '0';
            }
            return sum;
        }

        public static boolean prefixMatched(long number, int d) {
            int prefix = (int) getPrefix(number, getSize(d));
            return prefix == d;
        }

        public static int getSize(long d) {
            return String.valueOf(d).length();
        }

        public static long getPrefix(long number, int k) {
            String numStr = String.valueOf(number);
            return (numStr.length() < k) ? number : Long.parseLong(numStr.substring(0, k));
        }
*/

    //6.32
/*    public static void main(String[] args) {
        for(int i=0;i<10000;i++){
            int n=craps();

        if(n==2||n==3||n==12){
            System.out.printf("point is %d you lose%n",n);
        }
        else if(n==7||n==11){
            System.out.printf("point is %d you win%n",n);
        }
        else{
            System.out.printf( "point is %d roll again%n",n);

            int m=craps();
            if(n==2||n==3||n==12){
                System.out.printf("point is %d you lose%n",n);
            }
            else if(n==7||n==11) {
                System.out.printf("point is %d you win%n",n);
            }
            else{
                System.out.println("you lose");
            }
        }
        }

    }
    public static int craps() {
        int n=(int)(Math.random()*7);
        int m=(int)(Math.random()*7);
        return n+m;
    }
*/
/*    //6.33
    public static void main(String[] args) {
        currentTime();
    }
    public static void currentTime() {
        long time = System.currentTimeMillis();
        int seconds = (int) (time / 1000);
        int currentSeconds = seconds % 60;
        int minutes = seconds / 60;
        int currentMinutes = minutes % 60;
        int hours = minutes / 60;
        int currentHours = hours % 24;
        int days = hours / 24;
        int currentDays = days % 30;
        int months = days / 30;
        int currentMonths = months % 12;
        int years=months / 12;
        System.out.printf("Current date and time is: %d %d, %d %d:%d:%d ",currentMonths,currentDays,years,currentHours,currentMinutes,currentSeconds);

    }
*/  //6.35
/*   public static void main(String[] args) {
        System.out.println(area(5.5));
    }
    public static double area(double side) {
        double area = (5*side*side)/(4*Math.tan(Math.toRadians(36)));
        return area;
    }
*/    //6.36
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of sides and a side: ");
        int sides = sc.nextInt();
        double side=sc.nextDouble();
        System.out.println(area(sides,side));
    }
    public static double area(int sides,double side) {
        double area = (sides*side*side)/(4*Math.tan(Math.toRadians(180/sides)));
        return area;
    }
*///6.37
/*    public static void main(String[] args) {
        System.out.println(format(34,4));
    }
    public static String format(int number, int width){
        String output = ""+number;
        if(output.length() > width){
            return output;
        }
        int diff=width-output.length();
        String newOutput="";
        for(int i=0; i<diff; i++){
            newOutput += "0";
        }
        return newOutput+output;
    }
*/



}


