import javax.swing.*;

public class Lab506 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));

        while (number <= 1) {
            number = Integer.parseInt(JOptionPane.showInputDialog("Number must be more than 1 !!\n" +
                    "Enter an integer again:"));
        }

        boolean findPrimeNum = is_prime_number(number);

        if (findPrimeNum) {
            JOptionPane.showMessageDialog(null, number + " is a prime number");
        } else {
            JOptionPane.showMessageDialog(null, number + " is NOT a prime number");
        }
    }

    static boolean is_prime_number(int number) {
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
