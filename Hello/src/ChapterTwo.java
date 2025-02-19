public class ChapterTwo {
    public static void main(String[] args) {
        /*double i = 50.0;
        double k = i + 50.0;
        double j = k + 1;
        System.out.println( "j is " + j + " and k is " + k);


        Scanner input = new Scanner(System.in);
        System.out.print("Enter an double value: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle of radius " + radius + " is " + area);

        Scanner input = new Scanner(System.in);
        System.out.print( " enter three numbers for avarage output: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double avarage = (number1 + number2 + number3)/ 3;
        System.out.println( "avarage of three number is  " + avarage);

        Scanner input = new Scanner(System.in);
        double radius= input.nextDouble();
        int i, j, k;
        i= j = k = 2;
        System.out.println(i + " " + j + " " + k);

        final int SIZE =87;
        double miles = 100.0;
        final double KILOMMETERS_PER_MILE = 1.609;
        System.out.println("kilometers: "+ KILOMMETERS_PER_MILE);

        Scanner input = new Scanner(System.in);
        System.out.println("enter seconds number for transistor to minutes:");
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(minutes + ":" + remainingSeconds);



        System.out.println(100%7);
        System.out.println(25.0/4);
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println("25 / 4.0 is " + 25 / 4.0);
        System.out.println(Math.pow(2,3.5));


        Scanner input = new Scanner(System.in);
        System.out.println("enter a fahrenheit degrees for convert to celsius");
        double fahrenheit= input.nextDouble();
        double celsius = (5.0/9)*(fahrenheit-32);
        System.out.println("celsius: "+celsius);


        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalMilliseconds % 1000;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.println(tax);
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);


        float f = 12.5F;
        System.out.println(f);
        int i = (int)f;
        System.out.println("f is " + f);
        System.out.println("i is " + i);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double number: ");
        double number = scanner.nextDouble();
        int remainingNumber = (int)(number * 100);
        int oneDollar = remainingNumber/100;
        remainingNumber = remainingNumber%100;
        int quarter = remainingNumber/25;
        remainingNumber = remainingNumber%25;
        int dimes = remainingNumber/10;
        remainingNumber = remainingNumber%10;
        int nickel = remainingNumber/5;
        remainingNumber = remainingNumber%5;
        int penny = remainingNumber;

        System.out.println("there is "+oneDollar+" dollars "+ quarter+" quarters "+ dimes+" dimes "+ nickel+" nickels "+ penny+" pennies" );



        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of pound");
        int pound = scanner.nextInt();
        double kg= (pound* 0.454);
        System.out.println(pound + " pound is " + kg +" kilograms");

        System.out.print("what is subtotal of the restourant :");
        double subtotal = scanner.nextDouble();
        double gratutity= 0.15;
        System.out.print("total amount is: "+ (subtotal+(subtotal*gratutity)));




        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number between 0 and 1000 and ı will display the remaining to divide 10: ");
        int n = scanner.nextInt();
        int a = (n%10);
        n = (n/10);
        a += (n%10);
        n = (n/10);
        a += (n%10);
        System.out.println(a);

        System.out.print("enter a number for minutes and ı convert to years, days and hour: ");
        int minutes = scanner.nextInt();
        int hour = minutes/60;
        int restMinutes = minutes%60;
        int days = hour/24;
        int restHour = hour%24;
        int years = days/365;
        int restDays = days%365;
        System.out.println(minutes+" is "+ years+" years "+ restDays+" days " + restHour+  " hour " + restMinutes+" minutes");



        Scanner scanner = new Scanner(System.in);
        long totalMilliseconds = System.currentTimeMillis();
        System.out.print("write a time zone: ");
        int timezone = scanner.nextInt();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        System.out.println((currentHours-timezone) + ":" + currentMinutes + ":" + currentSeconds + ":" + totalHours);

      Scanner scanner = new Scanner(System.in);//2.16
        System.out.print(  " enter lenght of a side of hexagon: ");
        int length = scanner.nextInt();
        System.out.println(3*Math.pow(3,0.5)*Math.pow(length,2)/2);

      Scanner scanner = new Scanner(System.in);//2.10
        System.out.print("enter the amount of water in kilogram: ");
        double kg=scanner.nextDouble();
        System.out.print("enter the initial temperature: ");
        double initTemp=scanner.nextDouble();
        System.out.print("enter the final temperature: ");
        double finalTemp=scanner.nextDouble();
        System.out.println("the energy needed is "+(kg*(finalTemp-initTemp)*4184));

        Scanner sc = new Scanner(System.in);//2.11
        System.out.print("enter year : ");
        int year = sc.nextInt();
        System.out.println(312032486 + (year*2780096));

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter speed: ");
        Double speed = scanner.nextDouble();
        System.out.print("accleration: ");
        double accleration = scanner.nextDouble();
        System.out.print("lenght:  "+(Math.pow(speed,2)/(2*accleration)));

        Scanner sc = new Scanner(System.in);//2.13
        System.out.print("enter monthly saving amount:");
        double monthlySavingAmount = sc.nextDouble();
        double value=0;
        double n = monthlySavingAmount*(1+0.00417);
        System.out.println("first year: "+ n);
        n = (monthlySavingAmount+n)*(1+0.00417);
        System.out.println("second year: "+ n);
        n=(monthlySavingAmount+n)*(1+0.00417);
        System.out.println("3th year: "+ n);
        n=(monthlySavingAmount+n)*(1+0.00417);
        System.out.println("4th year: "+ n);
        n=(monthlySavingAmount+n)*(1+0.00417);
        System.out.println("5th year: "+ n);
        n=(monthlySavingAmount+n)*(1+0.00417);
        System.out.println("6th year: "+ n);

        Scanner sc = new Scanner(System.in);//2.14
        System.out.print("Enter the weight as pounds: ");
        double weight0= sc.nextDouble();
        System.out.print("enter the height as inches: ");
        double height= sc.nextDouble();

        double weightKg= weight0*0.45359237;
        double heightKg= height*0.0254;
        System.out.println("BMI: "+(weightKg/(Math.pow(heightKg,2))));

        Scanner sc = new Scanner(System.in);//2.17
        System.out.print("enter the temperature between -57 and 41: ");
        double temperature = sc.nextDouble();
        System.out.print("enter the wind speed(must be 2 or greater): ");
        double windSpeed = sc.nextDouble();
        System.out.println("the wind chill index is :" +(35.74+0.6215*temperature - 35.75*Math.pow(windSpeed,0.16)+ 0.4275*temperature*Math.pow(windSpeed,0.16)));



        Scanner sc = new Scanner(System.in);//2.19
        System.out.print(  "enter the points of triangle : ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double side1 = Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x1,2) + Math.pow(y3 - y1,2), 0.5);
        double side3 = Math.pow(Math.pow(x2 - x3,2) + Math.pow(y2 - y3,2), 0.5);
        System.out.println(side1+ "  "+ side2 + " "+ side3);
        double s = (side1 + side2 + side3)/2;
        System.out.println(s);
        System.out.println("area of triangle is : "+(Math.pow((s*(s-side1)*(s-side2)*(s-side3)),0.5)));

        Scanner sc = new Scanner(System.in);//2.21
        System.out.print("Enter the investment amount : ");
        double amount = sc.nextDouble();
        System.out.print("annual interest rate in percentage: ");
        double rate = sc.nextDouble();
        System.out.print("enter number of years: ");
        int years = sc.nextInt();
        System.out.println(amount);
        System.out.println(amount+(amount * Math.pow((1+rate), (years*12))));
*/

    }
}
