import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

class LoginFrameEventHandler implements ActionListener,ItemListener
{
LoginFrameGUI lfgui;	
LoginFrameEventHandler(LoginFrameGUI lfgui)
{
this.lfgui=lfgui;
}
public void actionPerformed(ActionEvent e)
{
   //String atrb = e.getActionCommand();
        System.out.println("Button Pressed!!!");
        JButton b = (JButton)e.getSource();
        if(b==lfgui.loginButton)
        {
            String user = lfgui.userTextField.getText();
            String pass = lfgui.passwordField.getText();
            if(user.equals("ABCDE") && pass.equals("12345"))
            {
                System.out.println("DONE");
            }
        }
        else 
        {
            lfgui.userTextField.setText("");
            lfgui.passwordField.setText("");
        }
}

public void itemStateChanged(ItemEvent e) 
{ 
        
   if (e.getStateChange() == ItemEvent.SELECTED) 
   {
      lfgui.passwordField.setEchoChar((char) 0); 
   } 
   else 
   {  
      lfgui.passwordField.setEchoChar('*');  
   } 
}

}// end of class