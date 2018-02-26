package App.Helpers;

import javax.swing.JOptionPane;

/**
 *
 * @author Bismarck Franco
 */
public class Messages {
    
    public void ErrorMsg(String Message){
        JOptionPane.showMessageDialog(null, Message, "SAIP", JOptionPane.ERROR_MESSAGE);
    }
    
    public void OkMesg(String Message){
        JOptionPane.showMessageDialog(null, Message, "SAIP", JOptionPane.INFORMATION_MESSAGE);
    }
}
