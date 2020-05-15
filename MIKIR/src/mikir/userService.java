package mikir;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class userService {
    private String[] data = new String[3];
    private String username, password, role="";
    LoginMenu login = new LoginMenu();
    Menu menu = new Menu();
    //constructor
    public userService(String user, String pass){
        username = user;
        password = pass;
        String[] data = {"admin", "admin", "Administrator"};
        this.data = data;
    }
    
    
    private boolean checkCredentials(){
        if (data[0].equals(username) && data[1].equals(password)){
            role = data[2];
            return true;
        }
        return false;
    }
    
    public boolean login(){
        boolean status = checkCredentials();
        if (status == true){
            JOptionPane.showMessageDialog(menu, "Welcome "+data[2], "Success Login", JOptionPane.INFORMATION_MESSAGE);
            menu.setVisible(true);
            return true;
        }
        else {
            JOptionPane.showMessageDialog(menu, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
            return  false;
        }
    }
}
