//KACEY ROYCE TYNE SANGBAAN
//CITCS 1N-A
import javax.swing.JOptionPane;
public class FinalChallenge{
    public static void main(String[] args) {
        //initialize attributes
        int totalSeats = 10;
        int bookedSeats = 0;

        //while loop to keep asking for booking
        while (true) {
            try {
                //calculating the available seats by subtracting the total seats to he booked seats which are incremented when clicking yes
                int availableSeats = totalSeats - bookedSeats;
                //conditional exception for catch
                if (availableSeats == 0) {
                    throw new Exception("Sorry this flight is fully booked");
                }
                //show option wether to continue or exit
                int option = JOptionPane.showConfirmDialog(
                    null, "Available seats " + availableSeats + " Do you want to book?", 
                    "Booking", 
                    JOptionPane.YES_NO_OPTION);
                //if user picked the no option the program will exit
                if (option == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(
                    null, 
                    "Thank you for using the flight booking system");
                    break;
                //or if the user picked yes then the flight will be booked
                }else{
                    JOptionPane.showMessageDialog(null, "flight booked successfully thank you for booking!");
                    bookedSeats++;
                }

            } 
            //this will catch the conditional exception above
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Booking Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }
}