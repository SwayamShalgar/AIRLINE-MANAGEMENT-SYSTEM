import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

interface conpulsion{
    void available();
}
class PlaneDetails{

    void Reserve(String file,int rss){
        String ofVector;
        Vector v2 = new Vector(5);
        File myFile = new File(file);
        try {
            Scanner get = new Scanner(myFile);
            while (get.hasNextLine()){
                String str = get.nextLine();
                v.addElement(str);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Available seats are");
        for (int i = 0;i<v.size()-1;i++) {
            System.out.println(v.get(i));
        }
        System.out.println("Enter Your name : ");
        String name = sc.next();
        System.out.println("Enter seat to reserve : ");
        String res = sc.next();
        int rs;
        do {
            System.out.println("Pay "+rss+" ruppees to confirm Reservation : ");
             rs = sc.nextInt();
             if(rs==rss) {
                 System.out.println("reservation Confirmed ! ");
                 v.remove(res);
                 String str1 = name + " Reservation Confirm and Seat number is " + res;
                 File myFile1 = new File("Reservation");
                 try {
                     Scanner get = new Scanner(myFile1);
                     while (get.hasNextLine()) {
                         String str = get.nextLine();
                         v2.addElement(str);
                     }
                 } catch (FileNotFoundException e) {
                     throw new RuntimeException(e);
                 }
                 v2.addElement(str1);
                 try {
                     FileWriter fileWriter = new FileWriter("Reservation");
                     for (int i = 0; i <= v2.size() - 1; i++) {
                         ofVector = v2.get(i) + "\n";
                         fileWriter.write(ofVector);
                     }
                     fileWriter.close();
                 } catch (IOException e) {
                     throw new RuntimeException(e);
                 }
             }
             else{
                 System.out.println("Please Enter Correct Amount");
             }
        }while (rs != rss);
        System.out.println(v);
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (int i = 0;i <= v.size()-1; i++ ){
                ofVector = v.get(i)+"\n";
                fileWriter.write(ofVector);
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void Cancle(String file){
         System.out.println("Please Enter Your Seat Number : ");
         String seat = sc.next();
         int a = 0;
         File myFile = new File(file);
         File myFile2 = new File("Reservation");
         try {
             Scanner get = new Scanner(myFile);
             while (get.hasNextLine()) {
                 String str = get.nextLine();
                 v.addElement(str);
             }
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         }
         for (int i = 0; i <= v.size() - 1; i++) {
             if (seat.equals(v.get(i))) {
                 System.out.println("Seat number is Invalid ! ");
                 a = 1;
                 break;
             }
         }
         if (a == 0) {
             v.addElement(seat);
             try {
                 String ofVector;
                 FileWriter fileWriter = new FileWriter(file);
                 for (int j = 0; j <= v.size() - 1; j++) {
                     ofVector = v.get(j) + "\n";
                     fileWriter.write(ofVector);
                 }
                 fileWriter.close();
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
             try {
                 Scanner get = new Scanner(myFile2);
                 while (get.hasNextLine()) {
                     String str = get.nextLine();
                     v2.addElement(str);
                     //System.out.println(v2);
                 }
             } catch (FileNotFoundException e) {
                 throw new RuntimeException(e);
             }
             String check = "";
             int store = 0;
             String check2 ="";
             int b = 0;
             System.out.println(v2.get(1));
             do {
                 System.out.println("Enter Your Name : ");
                 String n = sc.next();
                 System.out.println(v2.size());
                 for (int i = 0; i <= v2.size()-1; i++) {
                     store = i;
                     check2 = String.valueOf(v2.get(i));
                     check = n + " Reservation Confirm and Seat number is " + seat;
                     if (check.equals(check2)) {
                         v2.remove(check);
                         System.out.println(v2);
                         try {
                             String ofVector;
                             FileWriter fileWriter = new FileWriter("Reservation");
                             for (int j = 0; j <= v2.size() - 1; j++) {
                                 ofVector = v2.get(j) + "\n";
                                 fileWriter.write(ofVector);
                             }
                             fileWriter.close();
                         } catch (IOException e) {
                             throw new RuntimeException(e);
                         }
                         System.out.println("Cancle done ! ");
                         b = 1;
                         break;
                     }
                 }
                 if(b==0) {
                     System.out.println("Enter a valid name : ");
                 }
             }while (b == 0);
         }
    }
    Vector v2 = new Vector(5);
    Vector v =new Vector(5);
    Scanner sc = new Scanner(System.in);
    void Indigo(){
        int a;
        System.out.println("Enter 1.Reserve a Seat\nEnter 2.Cancel a Seat\n");
        do {
            a = sc.nextInt();
            switch (a) {
                case 1:
                    Reserve("Indigo", 12000);
                    break;
                case 2:
                    Cancle("Indigo");
                    break;
                default:
                    System.out.println("Enter valid Input : ");
                    break;
            }
        }while (a>2);
    }
    void Spice(){
        int a;
        System.out.println("Enter 1.Reserve a Seat\nEnter 2.Cancel a Seat\n");
        do {
            a = sc.nextInt();
            switch (a) {
                case 1:
                    Reserve("Spice", 16000);
                    break;
                case 2:
                    Cancle("Spice");
                    break;
            }
            System.out.println("Enter valid Input : ");
        }while (a>2);
    }
    void emirates(){
        int a;
        System.out.println("Enter 1.Reserve a Seat\nEnter 2.Cancel a Seat\n");
        do {
            a = sc.nextInt();
            switch (a) {
                case 1:
                    Reserve("Emirates", 56000);
                    break;
                case 2:
                    Cancle("Emirates");
                    break;
            }
            System.out.println("Enter valid Input : ");
        }while (a>2);
    }
}
class Planes extends PlaneDetails {
    Scanner sc = new Scanner(System.in);
    void Domestic(){
        System.out.println("*** Welcome to domestic airline ***");
        System.out.println("\nAvailable planes are : ");
        System.out.println("\n1.Indigo Airlines (id - 123) (Goa to Mumbai)\n2.Spice Jet (id-124) (Kolkata to Delhi)\n");
        System.out.println("Enter Plane ID : ");
        int a;
        do {
            a = sc.nextInt();
            switch (a){
                case 123 : Indigo();
                    break;
                case 124 : Spice();
                    break;
                default:
                    System.out.println("Please select Valid number : ");
            }
        }while (a>125 || a<123);
    }
    void International(){
        System.out.println("*** Welcome to domestic airline ***");
        System.out.println("\nAvailable planes are : ");
        System.out.println("\n1.EMIRATES (ID - 521)\n");
        System.out.println("Enter Plane ID : ");
        int a;
        do {
            a = sc.nextInt();
            switch (a){
                case 521 : emirates();
                    break;
            }
        }while (a>521);
    }
}
class Available extends Planes implements conpulsion {
    public void available(){
        System.out.println("Select type of Travel \n");
        System.out.println("1.Domestic\n2.International\n");
        System.out.println("Enter your Travel : ");
        Scanner sc = new Scanner(System.in);
        int c;
        do {
            c = sc.nextInt();
            switch (c){
                case 1 : Domestic();
                    break;
                case 2 : International();
            }
        }while (c>3);
    }
}
public class Main {
    public static void main(String[] args) {
        Available a = new Available();
        System.out.println("\n\t********  Welcome to SESP Airlines  ********");
        System.out.println("\nEnter 1 for Reserve a seat Or Cancel a Seat");
        Scanner sc = new Scanner(System.in);
        int c = 0;
            do {
                c = sc.nextInt();
                if (c == 1) {
                    a.available();
                    break;
//                } else if (c == 2) {
//                    System.out.println("Thanks for using our software\nVisit Again ! ");
//                    break;
                } else {
                    System.out.println("Invalid Option !\nEnter A Valid Choice : ");
                }
                //System.out.println("Do you Want to Reserve more Seats ? \n1.Continue  2.Exit");
            } while (c > 1);
        System.out.println("ThankYou for Coming !! ");
    }
}