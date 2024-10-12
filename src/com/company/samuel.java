package com.company;
import java.util.Random;
import java.util.Scanner;

/*
class ary {
   public static void main(String[] args) {
        System.out.println();
    }
}
*/

public class samuel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aTeamTotalRun = 0;
        int bTeamTotalRun = 0;

        //System.out.println("hello");
        System.out.println("whats your call? write  0 for heads or 1 for tails");
        int ur_choice = sc.nextInt();
        Random r = new Random();
        int toss = r.nextInt(2);
        System.out.println(toss);

        if (toss == ur_choice) {
            System.out.println("you won the toss what's your call?   1 to bat and 0 to ball");
            int call = sc.nextByte();

            if (call == 1) {

                System.out.println("so you have choosed to bat first");

                for (int i = 1; i < 12; i++) {

                    Random run = new Random();
                    int runs = run.nextInt(37);
                    System.out.println("runs scored by  your team's batsman number " + i + "    are:::" + runs);

                    aTeamTotalRun = runs + aTeamTotalRun;

                    if (runs == 0) {
                        System.out.println("out");
                    }
                    System.out.println(":::aTeamRuns:::" + aTeamTotalRun);
                }
                System.out.println(":::===================aTeamRuns:::" + aTeamTotalRun);
                System.out.println("first innings are over now its time for you to ball\n\n\n");
//                System.out.println("\n");
                for (int i = 1; i < 12; i++) {

                    Random run = new Random();
                    int runs = run.nextInt(37);
                    System.out.println("runs scored by " + i + " batsman in your " + i + "baller's over are:::" + runs);
                    bTeamTotalRun = bTeamTotalRun + runs;
                    System.out.println(":::BteamRun:::" + bTeamTotalRun);
                    if (runs == 0) {
                        System.out.println("wicket down ");
                    }

                }
                System.out.println(":::BteamRun:::" + bTeamTotalRun);

                if (bTeamTotalRun == aTeamTotalRun) {
                    System.out.println("Match Tie!!! OOPS!!");
                } else if (bTeamTotalRun > aTeamTotalRun) {
                    System.out.println("B Team Won !! \nCongratulations!!");
                }
                else{
                    System.out.println("A Team Won !! \nCongratulations!!");
                }

            }
            if (call == 0) {
                System.out.println("so you've choosed to ball first");
                for (int i = 1; i < 12; i++) {

                    Random run = new Random();
                    int runs = run.nextInt(37);
                    System.out.println("runs scored by " + i + " batsman in your " + i + "baller's over are:::" + runs);

                    bTeamTotalRun = bTeamTotalRun + runs;

                    if (runs == 0) {
                        System.out.println("wicket down ");
                    }

                    System.out.println(":::BteamRun:::" + bTeamTotalRun);

                }
                System.out.println(":::+++++++++BteamRun:::" + bTeamTotalRun);
                System.out.println("first innings is done ...now its your turn to bat ");
                for (int i = 1; i < 12; i++) {

                    Random run = new Random();
                    int runs = run.nextInt(37);
                    System.out.println("runs scored by  your team's batsman number " + i + " are:::" + runs);

                    if (runs == 0) {
                        System.out.println("out");

                    }
                }
            }
        }
        else {
                System.out.println("computer won ");
                int comp_choice = r.nextInt(2);
                if (comp_choice == 1) {
                    System.out.println("opponent choose to bat first ");
                    for (int i = 1; i < 12; i++) {

                        Random run = new Random();
                        int runs = run.nextInt(37);
                        System.out.println("runs scored by computer's batsman number " + i + " are:::" + runs);

                        if (runs == 0) {
                            System.out.println("wicket down ");
                        }

                    }


                }
                if (comp_choice == 0) {
                    System.out.println("opponent choose to ball first ");
                    for (int i = 1; i < 12; i++) {

                        Random run = new Random();
                        int runs = run.nextInt(37);
                        System.out.println("runs scored by " + i + " batsman  in ypur over aare:::" + runs);

                        if (runs == 0) {
                            System.out.println("wicket down ");
                        }

                    }


                }

            }
        }
    }