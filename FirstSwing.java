import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
class FirstSwing { 
JFrame f; 
FirstSwing()
{
f =new JFrame();//creating instance of JFrame  
f.setTitle("Demo Frame");           
f.setSize(400,500);//400 width and 500 height  
f.setVisible(true);//making the frame visible  
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
} 
