package codealpha_tasks;
import java.util.Scanner;
public class HotelReservationSystem{
    static boolean[] rooms=new boolean[5];
    static String[] booking=new String[5];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\nHotel Reservation System");
            System.out.println("1. Search Available Rooms");
            System.out.println("2. Make a Reservation");
            System.out.println("3. View Booking");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    searchRooms();
                    break;
                case 2:
                    makeReservation();
                    break;
                case 3:
                    viewBooking();
                    break;
                case 4:
                    System.out.println("Thank you for using the system!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }
    static void searchRooms(){
        System.out.println("\nAvailable Rooms:");
        for(int i=0;i<rooms.length;i++){
            if(!rooms[i]){
                System.out.println("Room "+(i+1)+" is available.");
            }
        }
    }
    static void makeReservation(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter room number(1-5):");
        int roomNumber=sc.nextInt();
        if(roomNumber<1||roomNumber>5||rooms[roomNumber-1]){
            System.out.println("Room not available or already booked.");
        }
        else{
            rooms[roomNumber-1]=true;
            booking[roomNumber-1]=name;
            System.out.println("Registration successful!");
        }
    }
    static void viewBooking(){
        System.out.println("\nBooking details:");
        for(int i=0;i<booking.length;i++){
            if(rooms[i]){
                System.out.println("Room "+(i+1)+"-"+booking[i]);
            }
        }
    }
}
