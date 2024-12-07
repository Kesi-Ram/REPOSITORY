//KACEY ROYCE TYNE SANGBAAN
//CITCS 1N-A
import javax.swing.JOptionPane;
public class BankingSystem {
    public static void main(final String[] args) { 
            try {
                int availableBalance = 2000;
                final String[] options = {"withdraw", "Deposit","exit"};
                String input;
                final int choice = JOptionPane.showOptionDialog(null,
                        "What would you like to do? \navailable balance: " + availableBalance,
                        "Bank",
                        0 ,
                        3 ,
                        null,
                        options,
                        options[2]);
                if (availableBalance == 0) {
                    throw new Exception("insufficient Balance");
                }
                switch (choice) {
                    case 0 -> {
                        input = JOptionPane.showInputDialog(null, "Enter Desired amount", "Withdraw",JOptionPane.INFORMATION_MESSAGE);
                        final int draw = Integer.parseInt(input);
                        if(draw > availableBalance){
                            throw new Exception("Insufficient balance. Current balance: " + availableBalance);
                        }   availableBalance -= draw;
                        JOptionPane.showMessageDialog(null, "Current balance: " + availableBalance);
                        availableBalance--;
                    }
                    case 1 -> {
                        input = JOptionPane.showInputDialog(null, "Enter Desired amount", "Deposit",JOptionPane.INFORMATION_MESSAGE);
                        final int sit = Integer.parseInt(input);
                        availableBalance += sit;
                        JOptionPane.showMessageDialog(null, "Current balance: " + availableBalance);
                        availableBalance++;
                    }
                    case 2 -> {
                        JOptionPane.showMessageDialog(null, "Thank you for using the bank", "Exit", JOptionPane.INFORMATION_MESSAGE);
                        break ;
                    }
                    default -> {
                    }
                }
            }catch (final NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input, please input ");
            }catch (final Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
        }       
    }
}
