package individual; 
import java.util.Scanner; 
public class AeroplaneSeatReservation
{
    int counter = 0 ; 
    double cost = 0.0 ; 
    String name = "" ; 
    String date = "" ;
    String currentLocation = "" ; 
    String destination = "" ; 
    String phoneNumber = "" ; 
    String[]  reservedSeat = new String[50];
    String[] reservedSeat2 = {"1A","2F","3A","3B","3F","4A","5E","5F","6A","6B","6C","7B","7C","7D","7E","8A","8F","9A","9B","10D","10E","10F","11A","11B","11C","11D","11E","11F"};
    int k = 27;

    void accept(Scanner sc)
    {
        // accepting name
        String s1 = "Your name please!";
        for(int i = 0 ;i < s1.length() ; i++)
        {
            char ch = s1.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(55);
            }
            catch(Exception e)
            {

            }
        }
        System.out.println();
        name = sc.nextLine().trim() ;
        
        // capitalizing name
        String name2 = this.name ;
        name2 = name2 + " " ; 

        String word = "" ; 
        String newWord = ""; 
        String s2 = ""; 

        for(int i = 0 ; i < name2.length() ; i++)
        {
            char ch = name2.charAt(i); 
            word = word + ch  ; 

            if(ch == ' ')
            {
                char firstWord = word.charAt(0); 
                newWord = word.substring(1); 

                firstWord = Character.toUpperCase(firstWord);
                newWord = firstWord + newWord ; 

                s2 = s2 + newWord  ; 
                word = "" ; 
            }
        }

        name = s2 ; 
        this.name = name2;

        // accpeting phone number
        s1 = "Please enter your phone number";
        for(int i = 0 ;i < s1.length() ; i++)
        {
            char ch = s1.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(55);
            }
            catch(Exception e)
            {

            }
        }
        System.out.println();
        phoneNumber = sc.nextLine().trim() ;
        
        // phone number check 
        if( phoneNumber.length() != 10)
        {
            boolean flag = false; 
            while(flag == false)
            {
                System.out.println("Please make sure that the phone number that you have entered is 10 digits long \nThe phone number entered by you was " + phoneNumber.length() + " digits long");
                phoneNumber = sc.nextLine().trim();
                
                if(phoneNumber.length() == 10)
                {
                    flag = true; 
                }
            }
        }

        // accepting date of travel
        s1 = "Please enter your date of travel";
        for(int i = 0 ;i < s1.length() ; i++)
        {
            char ch = s1.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(55);
            }
            catch(Exception e)
            {

            }
        }

        System.out.println();

        date = sc.nextLine().trim() ;

        // accepting current location and destination of travel
        s1 = "Please enter your current location and destination";
        for(int i = 0 ;i < s1.length() ; i++)
        {
            char ch = s1.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(55);
            }
            catch(Exception e)
            {

            }
        }

        System.out.println();

        currentLocation = sc.nextLine().trim() ;
        destination = sc.nextLine().trim(); 

        currentLocation = currentLocation.toUpperCase();
        destination = destination.toUpperCase();
    }

    void displayAirplaneSeats()
    {
        //display statement 
        System.out.println("            Business class:         ");
        System.out.println("▢ 1A                             1F ▢");
        System.out.println("▢ 2A                             2F ▢");

        System.out.println("             First Class            ");
        System.out.println("▢ 3A   3B                   3E   3F ▢");
        System.out.println("▢ 4A   4B                   4E   4F ▢");
        System.out.println("▢ 5A   5B                   5E   5F ▢");

        System.out.println("             Economy Class           ");
        System.out.println("▢ 6A   6B   6C         6D   6E   6F ▢");
        System.out.println("▢ 7A   7B   7C         7D   7E   7F ▢");
        System.out.println("▢ 8A   8B   8C         8D   8E   8F ▢");
        System.out.println("▢ 9A   9B   9C         9D   9E   9F ▢");
        System.out.println("▢ 10A  10B  10C       10D  10E  10F ▢");
        System.out.println("▢ 11A  11B  11C       11D  11E  11F ▢");

        //displaying the reserved seats 
        System.err.println("The reserved seats are: ");
        for(int i = 0 ; i <= k ; i++)
        {
            System.err.println(reservedSeat2[i]);
            reservedSeat[i] = reservedSeat2[i];
        }

        System.err.println();
        System.err.println("PLEASE SCROLL UP TO SEE ALL THE RESERVED SEATS");
    }

    void Choose()
    {
        Scanner input = new Scanner(System.in);
        //InputDetails obj1 = new InputDetails(); 

        boolean check = true; 
        boolean flag = false;

        while(check == true && k < 50)
        {
            //display statement
            System.out.println("Please enter the seat number that you want to reserve ");
            String seat = input.nextLine().trim(); 
            int numSeat = Integer.parseInt(seat.substring(0,1));

            for(int i = 0 ; i <= k ; i++)
            {
                if(reservedSeat[i].equals(seat))
                {
                    System.out.println("OOPS LOOKS LIKE YOU THAT SEAT HAS ALREADY BEEN RESERVED!!");
                    flag = true;
                }
            }

            if(flag == false)
            {
                k++;
                reservedSeat[k] = seat;
            }

            System.out.println("do you want to reserve another seat ?");
            if( input.nextLine().trim().equalsIgnoreCase("yes"))
            {
                if(flag == false)
                {
                    System.out.println("Boarding Pass: ") ;
                    System.out.println();

                    System.out.println(name + "\t" + "Flight: OKL012" + "\t" + "seat number: " + reservedSeat[k]);
                    System.out.println("Gate: 47        date: " + date); 
                    System.out.println("from " + currentLocation + " to " + destination); 

                    System.out.println("\n" + "Have a great time" ); 

                    if(numSeat == 1 || numSeat == 2)
                    {
                        cost = cost + 200000;
                    }
                    else if ( numSeat == 3 || numSeat == 4 || numSeat == 5)
                    {
                        cost = cost + 110000;
                    }
                    else
                    {
                        cost = cost = 60000;
                    }
                }

                check = true;
                flag = false; 
            }
            else
            {
                System.out.println("Boarding Pass: ") ;
                System.out.println();

                System.out.println(name + "\t" + "Flight: OKL012" + "\t" + "seat number: " + reservedSeat[k]);
                System.out.println("Gate: 47        date: " + date); 
                System.out.println("from " + currentLocation + " to " + destination); 

                System.out.println("\n" + "Have a great time" ); 

                if(numSeat == 1 || numSeat == 2)
                {
                    cost = cost + 200000;
                }
                else if ( numSeat == 3 || numSeat == 4 || numSeat == 5)
                {
                    cost = cost + 110000;
                }
                else 
                {
                    cost = cost = 60000;
                }

                check = false;
                flag = false; 
            }

            flag = false;
        }
    }

    public static void main(String args[])
    {
        AeroplaneSeatReservation obj = new AeroplaneSeatReservation(); 
        Scanner sc = new Scanner(System.in); 

        obj.accept(sc); 
        obj.displayAirplaneSeats(); 
        obj.Choose();
    }
}