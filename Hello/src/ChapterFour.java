import java.util.Scanner;

public class ChapterFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    /*    System.out.println("He said \"Java is fun\"");
        System.out.println("\\t is a tab character");

        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareTo(s1));
        System.out.println(s1.substring(5,6));
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains(s2));


        System.out.println('1' + 1);
        System.out.println(1);
        System.out.println('1');

        System.out.println("1" + 1 + 1);
        System.out.println("1" + (1 + 1));
        System.out.println('1' + 1 + 1);

        System.out.println(1 + "Welcome " + 1 + 1);
        System.out.println(1 + "Welcome " + (1 + 1));
        System.out.println(1 + "Welcome " + ('\u0001' + 1));
        System.out.println(1 + "Welcome " + 'a' + 1);

        //4.1
        System.out.print("enter length from center to a vertex: ");
        double r = input.nextDouble();
        double s= 2*r*Math.sin(Math.PI/5);

        System.out.print("area of pentagon is: ");
        System.out.println(5*Math.pow(s,2)/(4*Math.tan(Math.PI/5)));


        //4.6
        System.out.println("radius of circle is 40 ");//4.6
        int radius = 40;
        System.out.println("point of triangle must be on the circle");
        int angle1 = (int) (1+Math.random()*Math.PI);
        int angle2 = (int) (1+Math.random()*(Math.PI-angle1));
        int  angle3 = 180-(angle1+angle2);

        double x1= Math.cos(angle1)*radius;
        double y1= Math.sin(angle1)*radius;
        double x2= Math.cos(angle2)*radius;// bu kısıma bir daha bak galiba önce uzunlukları bulmalısın
        double y2= Math.sin(angle2)*radius;
        double x3= Math.cos(angle3)*radius;
        double y3= Math.sin(angle3)*radius;

        System.out.println("display all angle and point of triangle");
        System.out.println(angle1+" "+angle2+" "+angle3+" ("+x1+","+y1+") ("+x2+","+y2+") ("+x3+","+y3+")");

        //4.7
        System.out.print("enter radius of circle: ");
        int radius = input.nextInt();
        System.out.println("angel of pentagon is 72 and every point on the circle");
        System.out.println("center of pentagon is (0,0)");
        System.out.println(" find the every point of pentagon");

        double x1= radius*Math.cos(72-Math.PI/2);
        double y1= radius*Math.sin(72-Math.PI/2);
        double x2= radius*Math.cos(2*72-Math.PI/2);
        double y2= radius*Math.sin(2*72-Math.PI/2);
        double x3= radius*Math.cos(3*72-Math.PI/2);
        double y3= radius*Math.sin(3*72-Math.PI/2);
        double x4= radius*Math.cos(4*72-Math.PI/2);
        double y4= radius*Math.sin(4*72-Math.PI/2);
        double x5= radius*Math.cos(5*72-Math.PI/2);
        double y5= radius*Math.sin(5*72-Math.PI/2);
        System.out.println(x1+","+y1);
        System.out.println(x2+","+y2);
        System.out.println(x3+","+y3);
        System.out.println(x4+","+y4);
        System.out.println(x5+","+y5);


        int character='E' ;//4.8
        System.out.println(character);
        char ch=69;//4.9
        System.out.println(ch);

        //4.11
        System.out.println(" enter a number between 0 and 15");
        int number = input.nextInt();
        if (number >= 10 && number <= 15) {
            char ch= (char) (number%10);
            switch (ch) {
                case 0:System.out.println('A'); break;
                case 1:System.out.println('B'); break;
                case 2:System.out.println('C'); break;
                case 3:System.out.println('D'); break;
                case 4:System.out.println('E'); break;
                case 5:System.out.println('F'); break;

            }
        }
        else if (number >= 0 && number <= 9) {
            System.out.println("the hex value is: "+number);
        }else {
            System.out.println("invalid input");
        }

        //4.13
        System.out.println("enter a letter, will be display is it vowel or consonant");
        char ch = input.next().charAt(0);
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'){
            System.out.println("Vowel");
        } else if ('a'<=ch&&ch<='z') {
            System.out.println("Consonant");
        }
        else {
            System.out.println("Not a letter");
        }

        //4.15

        System.out.println("enter a letter and i will display the exact number of that letter on the phone button");
        char letter = input.next().charAt(0);
        letter = Character.toLowerCase(letter);
        if(letter=='a'||letter=='b'||letter=='c') {
            System.out.println(2);
        }
        else if(letter=='d'||letter=='e'||letter=='f') {
            System.out.println(3);
        }
        else if(letter=='g'||letter=='h'||letter=='i') {
            System.out.println(4);
        }
        else if(letter=='j'||letter=='k'||letter=='l') {
            System.out.println(5);
        }
        else if(letter=='m'||letter=='n'||letter=='o') {
            System.out.println(6);
        }
        else if(letter=='p'||letter=='q'||letter=='r'||letter=='s') {
            System.out.println(7);
        }
        else if(letter=='t'||letter=='u'||letter=='v') {
            System.out.println(8);
        }
        else if(letter=='w'||letter=='x'||letter=='y'||letter=='z') {
            System.out.println(9);
        }


        //4.18
        System.out.print("enter a characters for major and status represanted: ");
        String s = input.nextLine();

        char major = s.charAt(0);
        char status = s.charAt(1);

        if(major == 'C' || major == 'M' || major == 'I'){
            switch (major){
                case 'C': System.out.print("Computer Science");break;
                case 'M': System.out.print("Mathematics");break;
                case 'I': System.out.print("Informatics");break;
            }
            if(status>='1' && status<='4'){
                switch (status){
                    case '1':System.out.println(" Freshman"); break;
                    case '2':System.out.println(" Sophomore"); break;
                    case '3':System.out.println(" Junior"); break;
                    case '4':System.out.println(" Senior"); break;
                }
            }
            else{
                System.out.println("invalid input");
            }

        }
        else{
            System.out.println("invalid inputsss");
        }


     */

        //4.21
        System.out.print("enter your social security number vithout space: ");
        String socialSecurityNumber = input.nextLine();
        if(10>socialSecurityNumber.length()&&socialSecurityNumber.length()>8) {

            char n1 = socialSecurityNumber.charAt(0);
            char n2 = socialSecurityNumber.charAt(1);
            char n3 = socialSecurityNumber.charAt(2);
            char n4 = '-';
            char n5 = socialSecurityNumber.charAt(3);
            char n6 = socialSecurityNumber.charAt(4);
            char n7 = '-';
            char n8 = socialSecurityNumber.charAt(5);
            char n9 = socialSecurityNumber.charAt(6);
            char n10 = socialSecurityNumber.charAt(7);
            char n11 = socialSecurityNumber.charAt(8);

            System.out.println("social security number is : " + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11);
        }
        else{
            System.out.println("invalid social security number:");
        }
    }
}
