import java.awt.event.*; 
import javax.swing.*;

class RadioButtonExample
{       
    RadioButtonExample()
    {
        JFrame f = new JFrame("Radio button Example");     
        JRadioButton rb1=new JRadioButton("Male");    
        rb1.setBounds(100,50,100,30);      
        JRadioButton rb2=new JRadioButton("Female");    
        rb2.setBounds(100,100,100,30);    
        ButtonGroup bg=new ButtonGroup();    
        bg.add(rb1);
        bg.add(rb2);    
        JButton b=new JButton("click");    
        b.setBounds(100,150,80,30);    
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {    
                if(rb1.isSelected())
                {    
                    JOptionPane.showMessageDialog(f,"You are Male.");    
                }    
                if(rb2.isSelected())
                {    
                    JOptionPane.showMessageDialog(f,"You are Female.");    
                }    
            }   
        });    
        f.add(rb1);
        f.add(rb2);
        f.add(b);    
        f.setSize(300,300);
        f.setLayout(null);    
        f.setVisible(true);    
    }    


    public static void main(String args[])
    {    
        new RadioButtonExample();    
    }
}