//KACEY ROYCE TYNE SANGBAAN
//CITCS 1N-A
import javax.swing.JOptionPane;

public class JOptionpane {
    public static void main(String[] args) {
        int confirm = JOptionPane.showConfirmDialog(null, "This is to confirm your identity, do you want to continue?", "Collecting User", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            String nameInput= JOptionPane.showInputDialog(null, "Please enter your full name", "");
            String age= JOptionPane.showInputDialog(null, "Please enter your age", "");

            JOptionPane.showMessageDialog(null, "This is your name: " + nameInput + "\nThis is your age: " + age);
        }else if (confirm == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "The program is exited");
        }


    }
}
