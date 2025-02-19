import java.util.Scanner;

public class ChapterThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        System.out.print("enter an integer number: ");
        int number = sc.nextInt();
        if(number%5==0){
            System.out.println("hi five");
        }
        if(number%2==0) {
            System.out.println("hi two: ");
        }
        else if(number%3==0) {
            System.out.println("hi three: ");
        }
        else {
            System.out.println("hi rest of the number : ");
        }

        System.out.print("enter the price: ");
        int pay=sc.nextInt();
        if(pay<=90){
            System.out.println("total amount is :" +(pay+(pay*0.03)));
        }
        else{
            System.out.println("total amount is :" +(pay+(pay*0.01)));
        }

        System.out.print("enter a number : ");
        int number = sc.nextInt();
        boolean even = number %2==0;


        boolean newLine = true
        System.out.print(" entera number ");
        int count = sc.nextInt();
        if (count%10== 0) {
            newLine = true;
        }
        else{
            newLine = false;
        }
      int i= 10+(int)(Math.random()*40);
        System.out.println(i);


        int x,y;
        x = 3; y = 3;
        switch (x + 3) {
            case 6: y = 1;
            default: y += 1;
        }
        System.out.println(y);

        System.out.print("enter a number between 1 and 7: ");
        int a = sc.nextInt();
        switch (a) {
            case 1: System.out.println("monday"); break;
            case 2: System.out.println("tuesday"); break;
            case 3: System.out.println("wednesday"); break;
            case 4: System.out.println("thursday"); break;
            case 5: System.out.println("friday"); break;
            case 6: System.out.println("saturday"); break;
            case 7: System.out.println("sunday"); break;
        }
// for conditional expression use ? instead of if else max = (num1 > num2) ? num1 : num2;


        System.out.println(true && true || false);

        //3.1
        System.out.println(" enter three value for equations value and we will display the root: ");
        System.out.print(  "a is : ");
        int a = sc.nextInt();
        System.out.print("b is : ");
        int b = sc.nextInt();
        System.out.print("c is : ");
        int c = sc.nextInt();

        double discriminant = (Math.pow(b,2)-(4*a*c));
        double root1 = (-b-(double)Math.sqrt(discriminant))/(2*a);
        double root2 = (-b+(double)Math.sqrt(discriminant))/(2*a);
        if (discriminant > 0) {
            System.out.println("there is 2 root");
            System.out.println(root1+" "+root2);
        }
        else if (discriminant == 0) {
            System.out.println("there is 1 root"+ root1);
        }
        else {
            System.out.println("there is no root");
        }


        //3.4
        int random= 1+(int)(Math.random()*12);
        System.out.println("random number: "+random);
        switch(random) {
            case 1: System.out.println("january"); break;
            case 2: System.out.println("february"); break;
            case 3: System.out.println("march"); break;
            case 4: System.out.println("april"); break;
            case 5: System.out.println("may"); break;
            case 6: System.out.println("june"); break;
            case 7: System.out.println("july"); break;
            case 8: System.out.println("august"); break;
            case 9: System.out.println("september"); break;
            case 10: System.out.println("october"); break;
            case 11: System.out.println("november"); break;
            case 12: System.out.println("december"); break;

            default: break;
        }


        //3.5
        System.out.print(" enter today's number and enter future day number: ");
        int day = sc.nextInt();
        int future = sc.nextInt();

        day=day%7;
        future=future%7;
        switch (day) {
            case 0:System.out.println("today is sunday"); break;
            case 1:System.out.println("today is Monday"); break;
            case 2:System.out.println("today is Tuesday"); break;
            case 3:System.out.println("today is Wednesday"); break;
            case 4:System.out.println("today is Thursday"); break;
            case 5:System.out.println("today is Friday"); break;
            case 6:System.out.println("today is Saturday"); break;
        }

        switch (future) {
            case 0:System.out.println("future is sunday"); break;
            case 1:System.out.println("future is Monday"); break;
            case 2:System.out.println("future is Tuesday"); break;
            case 3:System.out.println("future is Wednesday"); break;
            case 4:System.out.println("future is Thursday"); break;
            case 5:System.out.println("future is Friday"); break;
            case 6:System.out.println("future is Saturday"); break;
            }
        }



        System.out.print("enter 9 natural number:  ");//3.9
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int d4 = sc.nextInt();
        int d5 = sc.nextInt();
        int d6 = sc.nextInt();
        int d7 = sc.nextInt();
        int d8 = sc.nextInt();
        int d9 = sc.nextInt();

        int n10= (d1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;

        if(n10==10){
            System.out.println(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+"X");
        }
        else{
            System.out.println(d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+n10);
        }

        //3.11
        System.out.print(  " enter the year and month :");
        int year = sc.nextInt();
        int month = sc.nextInt();

        if(year%4==0){
            switch(month){
                case 1:System.out.println("january "+year+ " had 31 days");break;
                case 2:System.out.println("february "+year+ " had 29 days");break;
                case 3:System.out.println("march "+year+ " had 31 days");break;
                case 4:System.out.println("april "+year+ " had 28 days");break;
                case 5:System.out.println("may "+year+ " had 31 days");break;
                case 6:System.out.println("june"+year+ " had 28 days");break;
                case 7:System.out.println("july"+year+ " had 31 days");break;
                case 8:System.out.println("august"+year+ " had 28 days");break;
                case 9:System.out.println("september"+year+ " had 31 days");break;
                case 10:System.out.println("october"+year+ " had 28 days");break;
                case 11:System.out.println("november"+year+ " had 31 days");break;
                case 12:System.out.println("december"+year+ " had 28 days");break;

            }

        }
        else{
            switch(month){
                case 1:System.out.println("january "+year+ " had 31 days");break;
                case 2:System.out.println("february "+year+ " had 28 days");break;
                case 3:System.out.println("march "+year+ " had 31 days");break;
                case 4:System.out.println("april "+year+ " had 28 days");break;
                case 5:System.out.println("may "+year+ " had 31 days");break;
                case 6:System.out.println("june"+year+ " had 28 days");break;
                case 7:System.out.println("july"+year+ " had 31 days");break;
                case 8:System.out.println("august"+year+ " had 28 days");break;
                case 9:System.out.println("september"+year+ " had 31 days");break;
                case 10:System.out.println("october"+year+ " had 28 days");break;
                case 11:System.out.println("november"+year+ " had 31 days");break;
                case 12:System.out.println("december"+year+ " had 28 days");break;
            }

        }

        //3.17
        int n= (int)Math.random()*2;
        System.out.print("enter a number; 0 is rock, 1 is paper, 2 is scissors: ");
        int a = sc.nextInt();

        if(a==1){
            switch(n){
                case 1:System.out.println(" you are paper, computer is paper.  it's draw"); break;
                case 2:System.out.println("you are paper, computer is scissors.  computer won"); break;
                case 0:System.out.println("you are parer, computer is rock. you won");

            }
        }
        else if(a==2){
            switch(n){
                case 0:System.out.println("you are scissors, computer is rock. computer won"); break;
                case 1:System.out.println("you are scissors, computer is paper, you won"); break;
                case 2:System.out.println("you are scissors, computer is scissors. it's draw"); break;

            }
        }else{
            switch(n){
                case 0:System.out.println("you are rock, computer is rock. it's draw "); break;
                case 1:System.out.println("you are rock, computer is paper, computer won"); break;
                case 2:System.out.println("you are rock, computer is scissors. you won"); break;
            }
        }


        System.out.println(" enter 3 edgesfor triangle: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1+n2>=n3){
            if(n2+n3>=n1){
                if(n3+n1>=n2){
                    int perimeter = n3+n1+n2;
                    System.out.println("perimeter of triangel is : "+ perimeter);
                }
                else{System.out.println("input is not valid");}
            }
            else{System.out.println("input is not valid");}
        }
        else {System.out.println("input is not valid");}


        System.out.print(" enter year:");//3.21
        int year = sc.nextInt();

        System.out.println("enter month as number:");
        int month = sc.nextInt();

        System.out.println("enter the day of th month as number:");
        int day = sc.nextInt();
        int k = year%100;
        int j = year/100;
        int h=(day+(26*(month+1)/10)+k+(k/4)+(j/4)+5*j)%7;
        switch (h) {
            case 0: System.out.println("saturday"); break;
            case 1: System.out.println("sunday"); break;
            case 2: System.out.println("monday"); break;
            case 3: System.out.println("tuesday"); break;
            case 4: System.out.println("wednesday"); break;
            case 5: System.out.println("thursday"); break;
            case 6: System.out.println("friday"); break;

        }


        int card=(int)(Math.random()*10);//3.24
        int suit=(int)(Math.random()*4);

        switch (card){
            case 0:System.out.print(" you picked as of ");break;
            case 1:System.out.print(" you picked 2 of ");break;
            case 2:System.out.print(" you picked 3 of ");break;
            case 3:System.out.print(" you picked 4 of ");break;
            case 4:System.out.print(" you picked 5 of ");break;
            case 5:System.out.print(" you picked 6 of ");break;
            case 6:System.out.print(" you picked 7 of ");break;
            case 7:System.out.print(" you picked 8 of ");break;
            case 8:System.out.print(" you picked 9 of ");break;
            case 9:System.out.print(" you picked 10 of ");break;
            case 10:System.out.print(" you picked jack of ");break;
            case 11:System.out.print(" you picked queen of ");break;
            case 12:System.out.print(" you picked king of ");break;

        }
        switch(suit){
            case 0: System.out.println("Clubs"); break;
            case 1: System.out.println("Diamonds"); break;
            case 2: System.out.println("Hearts"); break;
            case 3: System.out.println("Spades"); break;
        }

        // 3.28than width and height of ractangle: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("enter the center of ractangle x, y than width and height of ractangle:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double w2 = sc.nextDouble();
        double h2 = sc.nextDouble();

        System.out.println("edge of first ractangle: ");
        int r1ax= (int) (x+w/2);
        int r1ay= (int) (y+h/2);
        int r1bx= (int) (x-w/2);
        int r1by= (int) (y-h/2);


        int r2ax= (int) (x+w/2);
        int r2ay= (int) (y+h/2);
        int r2bx= (int) (x-w/2);
        int r2by= (int) (y-h/2);

        if(r2ax < r1ax && r2bx<r1bx){
            if(r2ay< r1ay && r2by<r1by){
                System.out.println("r2 is inside ractangle");
            }
            else{
                System.out.println(" r2 is overlaps r1");
            }
        }
        else if(r2ay < r1ay && r2by<r1by){
            if(r2ax< r1ax && r2bx<r1bx){
                System.out.println("r2 is inside ractangle");
            }
            else{
                System.out.println(" r2 is overlaps r1");
            }
        }
        else{
            System.out.println("r2 doesnt overlap r1   ");
        }
*/


    }
}
