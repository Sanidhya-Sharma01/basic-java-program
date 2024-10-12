//import java.util.*;
 
package com.company;
import java.util.*;
import java.util.Random;

 abstract class Details{
     Random rand= new Random();
     int Count=0;
   //  long number;
     Scanner sc = new Scanner(System.in);
     String  DonerName;
     String Search_name;
     String DonerBloodType;
     String address;
     String AcceptorName;
     String AcceptorBloodType;
     int Age_of_Doner;
     int AgeOfAcceptor;

 }
class AddDetails extends Details {
    //funtion to add details
    void additin() {
        System.out.println(":::enter name of donor:::");
        DonerName = sc.nextLine();
        System.out.println(":::enter blood type of donor:::");
        DonerBloodType = sc.nextLine();
        System.out.println(":::enter age  of donor:::");
        Age_of_Doner = sc.nextInt();
        System.out.println(":::enter your address:::");
        address = sc.nextLine();
        System.out.println("have you donated blood before on this platform?(yes/no)");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            Count++;
            System.out.println(Count);
        } else {
            System.out.println("so its your first time");
        }
        System.out.println("**********your details have been registered***********");
        System.out.println("your registeration id is:::" + rand.nextInt(1000));
    }
    //function to search details
    // use data bases


    void searchDet() {
        System.out.println("enter name to search details of a person ");
        Search_name = sc.nextLine();
        if (Search_name == DonerName) {
            System.out.println("name is::" + DonerName);
            System.out.println("blood type is::" + DonerBloodType);
            System.out.println("age is::" + Age_of_Doner);
        } else {
            System.out.println(":::person not found:::");
        }

    }

    void DonateBlood() {
        System.out.println(":::welcome to donate page:::");
        System.out.println("enter your blood type:");
        System.out.println("you can donate  blood to these profiles");
        //use data bse to access details


    }

    void AskBlood() {
        System.out.println(":::welcome to ask  page:::");
        System.out.println("enter your blood type:");
        System.out.println("you can get blood from these profiles");


    }
}



public class bloodbank {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            AddDetails ad = new AddDetails();
            int choice;
            do {
                System.out.println("MENU:");
                System.out.println("1. Add your details");
                System.out.println("2. search for a person's details");
                System.out.println("3. donate blood ");
                System.out.println("4. ask for blood");
                System.out.println("5. EXIT");
                choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        ad.additin();
                        break;


                    case 2:
                        ad.searchDet();
                        break;

                    case 3:
                        ad.DonateBlood();
                        break;
                    case 4:
                        ad.AskBlood();
                        break;
                    case 5:
                        System.out.println("exiting...\n" + "you have successfully exited");
                        break;
                    default:
                        System.out.println(":enter a valid choice:");
                }

            } while (choice != 5);
            scan.close();



        }


    }




