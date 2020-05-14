package mikir;

import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class userService {
    private String[] data = new String[3];
    private String username, password, role="";
    LoginMenu login = new LoginMenu();
    Content konten = new Content();
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
    
    public void login(){
        boolean status = checkCredentials();
        if (status == true){
            
            menu.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
