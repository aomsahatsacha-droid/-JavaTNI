import javax.swing.*;

public class Labsheet403 {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "Admin1234";

    public static void main(String[] args) {

        while (true) {
            String user = JOptionPane.showInputDialog("Enter Username:");
            if (user == null) return;

            String pass = JOptionPane.showInputDialog("Enter Password:");
            if (pass == null) return;

            boolean userOK = USERNAME.equalsIgnoreCase(user);
            boolean passOK = PASSWORD.equals(pass);

            if (userOK && passOK) {
                JOptionPane.showMessageDialog(null,
                        "Login Success!!");
                break;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Login Fail...");
            }
        }
    }
}

