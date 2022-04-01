package hu.unideb.inf;

import java.util.Scanner;

/**
 * implement the function of buying aeroplane tickets
 *   Preferential rules: airline tickets have preferential policies in the off-season, but not during holidays
 *  for example  No discount on New Year's Day (1.1 - 1.3), May Day (5.1 - 5.3) and November 7 (10.1 - 10.7).this is for
 *  China situation ,just example
 *   for example20% discount on all days except the above 13 days
 *   This program is only small example method (just try)
 */
public class Main {
    public static void main(String[] args) {
        int month;
        int day;
        int ticket=15000;
        Scanner sc=new Scanner(System.in);
        System.out.println("--------Welcome to buy ticket--------");
        System.out.println("Please enter month number：");
        month=sc.nextInt();
        System.out.println("Please enter day number：");
        day=sc.nextInt();
        if(month<1||month>12) {
            System.out.println("Something wrong！");
        }else if (month==2) {
            if(day<1||day>28) {
                System.out.println("Something wrong");
            }else {
                System.out.println("You need to pay"+(ticket*0.8)+"ft");
            }
        }else if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
            if(day<1||day>31) {
                System.out.println("Something wrong！");
            }else if(month==1||month==5){
                if(day==1||day==2||day==3) {
                    System.out.println("You need to pay"+(ticket)+"ft");
                }else {
                    System.out.println("You need to pay"+(ticket*0.8)+"ft");
                }
            }else if (month==10) {
                if(day==1||day==2||day==3||day==4||day==5||day==6||day==7) {
                    System.out.println("You need to pay"+(ticket)+"ft");
                }else {
                    System.out.println("You need to pay"+(ticket*0.8)+"ft");
                }
            }else {
                System.out.println("You need to pay"+(ticket*0.8)+"ft");
            }
        }else {
            if(day<1||day>30) {
                System.out.println("Something wrong！");
            }else {
                System.out.println("You need to pay "+(ticket*0.8)+"ft");
            }

        }

    }

}
