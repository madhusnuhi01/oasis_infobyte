import java.util.*;
public class online_reservation
{
    public static boolean seats[]=new boolean[10];
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            // displaying menu
            System.out.println("\nPlease select an option:");
            System.out.println("1. View Seat");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            // getting user input
            int option = sc.nextInt();
            switch (option) 
            {
                case 1:
                    viewSeatMap();
                    break;
                case 2:
                    reserveSeat();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    // exit the program
                    System.exit(0); 
                default:
                    System.out.println("Invalid option entered!");
            }
        }
    }
    public static void viewSeatMap() 
    {
        System.out.println("Current Seat Map:");
        for (int i = 0; i < seats.length; i++) 
        {
            //checking if seats are reserved
            if (seats[i])
            System.out.print("X "); 
            else 
            System.out.print((i + 1) + " "); //printing available seat number
        }
        System.out.println();
    }
    public static void reserveSeat() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter seat number between 1 to 10: ");
        int seatNumber = sc.nextInt();
        if (seatNumber < 1 || seatNumber > 10)
        System.out.println("Invalid seat number!");
        else if (seats[seatNumber - 1])
        System.out.println("Seat already reserved!");
        else
        {
        // reserve the seat
        seats[seatNumber - 1] = true; 
        System.out.println("Seat reserved successfully!");
        }
    }
    public static void cancelReservation() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter seat number between 1 to 10: ");
        int seatNumber = sc.nextInt();
        if (seatNumber < 1 || seatNumber > 10) 
            System.out.println("Invalid seat number!");
        else if (!seats[seatNumber - 1]) 
            System.out.println("Seat not reserved!");
        else 
        {
            //cancelling reservation
            seats[seatNumber - 1] = false; 
            System.out.println("Reservation canceled!");
        }
    }
}

