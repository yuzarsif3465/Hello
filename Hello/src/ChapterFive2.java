import java.util.Scanner;

public class ChapterFive2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//5.29
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
            System.out.println("               january ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            firstDay=firstDay+31;
            System.out.println();
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
            System.out.println("               February ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==30){
                            break;
                        }
                    }if (count==30){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==30){
                                break;
                            }
                        }
                    }if (count==30){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==30){
                                break;
                            }
                        }
                    }if (count==30){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==30){
                                break;
                            }
                        }
                        if (count==30){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==30){
                                break;
                            }
                        }
                    }if (count==30){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==30){
                                break;
                            }
                        }
                        if (count==30){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==30){
                                break;
                            }
                        }
                        if (count==30){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("                 march ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("                 april ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==31){
                            break;
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("                     may ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               june ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==31){
                            break;
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               july ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               agust ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               september ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==31){
                            break;
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               october ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               november ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==31){
                            break;
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               december ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();

        }
        else {//february is 28 day

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
            System.out.println("               january ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            firstDay=firstDay+31;
            System.out.println();
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
            System.out.println("               February ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==29){
                            break;
                        }
                    }if (count==29){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==29){
                                break;
                            }
                        }
                    }if (count==29){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==29){
                                break;
                            }
                        }
                    }if (count==29){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==29){
                                break;
                            }
                        }
                        if (count==29){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==29){
                                break;
                            }
                        }
                    }if (count==29){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==29){
                                break;
                            }
                        }
                        if (count==29){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==29){
                                break;
                            }
                        }
                        if (count==29){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("                 march ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("                 april ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==31){
                            break;
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("                     may ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               june ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==31){
                            break;
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               july ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               agust ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               september ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==31){
                            break;
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               october ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               november ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==31){
                            break;
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                    }if (count==31){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==31){
                                break;
                            }
                        }
                        if (count==31){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
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
            System.out.println("               december ,"+year);
            System.out.println("_____________________________________________");
            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            if(day.equals("sunday")){
                int count=1;
                for(int i=1;i<=6;i++){
                    for(int j=1;j<=7;j++){
                        System.out.printf("%-7d",count);
                        count++;
                        if (count==32){
                            break;
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                    }if (count==32){
                        break;
                    }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
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
                        System.out.println();
                    }
                    else{
                        for(int j=1;j<=7;j++){
                            System.out.printf("%-7d",count);
                            count++;
                            if (count==32){
                                break;
                            }
                        }
                        if (count==32){
                            break;
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();

        }
    }

}
