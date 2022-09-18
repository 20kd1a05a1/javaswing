import javax.swing.*;
import java.awt.*;

public class StudentPro{
    public static void main(String[] args) {
       new StudentFrame();
    }
}
class StudentFrame{
    JFrame f1;
    JTabbedPane tb;
    JComboBox gender;
    JButton formsubmit;
    JButton refress;
    JButton login;
    JButton search;
    StudentFrame(){
        f1 = new JFrame("Student details check");
        f1.setLayout(null);
        tb = new JTabbedPane();
        
        //PANELS
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        JPanel p3 = new JPanel();
        p3.setLayout(null);
        //layout 
        p1.setBackground(new Color(255, 255, 200));
        p2.setBackground(new Color(204, 229, 255));
        p3.setBackground(new Color(204, 255, 255));
        //LABELS
        //NAME LABEL
        JLabel namelabel = new JLabel("FIRST_NAME:",JLabel.LEFT);
        namelabel.setFont(new Font("Verdana", Font.BOLD, 20));
        namelabel.setBounds(20,20,200,90);
        p1.add(namelabel);

        JTextField namefield = new JTextField("enter your first name");
        namefield.setFont(new Font("Verdana", Font.BOLD, 10));
        namefield.setBounds(180,50,200,30);
        p1.add(namefield);

        //EMAIL LABEL
        JLabel lastlabel = new JLabel("LAST NAME:",JLabel.LEFT);
        lastlabel.setFont(new Font("Verdana", Font.BOLD, 20));
        lastlabel.setBounds(20,60,200,90);
        p1.add(lastlabel);

        JTextField lastfield = new JTextField("enter your last name");
        lastfield.setFont(new Font("Verdana", Font.BOLD, 10));
        lastfield.setBounds(180,90,200,30);
        p1.add(lastfield);

        //REGID LABEL
        JLabel regidlabel = new JLabel("REGID:");
        regidlabel.setFont(new Font("Verdana", Font.BOLD, 20));
        regidlabel.setBounds(20,100,100,90);
        p1.add(regidlabel);

        JTextField regfield = new JTextField("enter your email");
        regfield.setFont(new Font("Verdana", Font.BOLD, 10));
        regfield.setBounds(180,130,200,30);
        p1.add(regfield);
        
        //REGID LABEL
        JLabel emaillabel = new JLabel("EMAIL:");
        emaillabel.setFont(new Font("Verdana", Font.BOLD, 20));
        emaillabel.setBounds(20,140,200,90);
        p1.add(emaillabel);

        JTextField emailfield = new JTextField("enter your REGISTER no");
        emailfield.setFont(new Font("Verdana", Font.BOLD, 10));
        emailfield.setBounds(180,170,200,30);
        p1.add(emailfield);

        //GENDER
        JLabel genderlabel = new JLabel("GENDER:");
        genderlabel.setFont(new Font("Verdana", Font.BOLD, 20));
        genderlabel.setBounds(20,180,200,90);
        p1.add(genderlabel);

        String colors[] = {"male","female","other"};
        gender  = new JComboBox(colors);
        gender.setBounds(180,210,90,20);
        p1.add(gender);
        //ADDRESS LABEL
        JLabel addresslabel = new JLabel("ADDRESS:",JLabel.LEFT);
        addresslabel.setFont(new Font("Verdana", Font.BOLD, 20));
        addresslabel.setBounds(20,220,200,90);
        p1.add(addresslabel);

        JTextField addressfield = new JTextField("enter your adress");
        addressfield.setFont(new Font("Verdana", Font.BOLD, 10));
        addressfield.setBounds(180,250,200,30);
        p1.add(addressfield);

        //SKILLS LABEL
        JLabel skillslabel = new JLabel("SKILLS:",JLabel.LEFT);
        skillslabel.setFont(new Font("Verdana", Font.BOLD, 20));
        skillslabel.setBounds(20,260,200,90);
        p1.add(skillslabel);

        JTextField skillsfield = new JTextField("enter your skills");
        skillsfield.setFont(new Font("Verdana", Font.BOLD, 10));
        skillsfield.setBounds(180,290,200,100);
        p1.add(skillsfield);

        //PASSWORD LABEL
        JLabel pwdlabel = new JLabel("OTHER WORD:",JLabel.LEFT);
        pwdlabel.setFont(new Font("Verdana", Font.BOLD, 20));
        pwdlabel.setBounds(20,370,200,90);
        p1.add(pwdlabel);

        JTextField pwdfield = new JTextField("enter something");
        pwdfield.setFont(new Font("Verdana", Font.BOLD, 10));
        pwdfield.setBounds(190,400,200,30);
        p1.add(pwdfield);

        //SUBMIT BUTTON
        formsubmit = new JButton("submit");
        formsubmit.setBounds(30,470,150,30);
        p1.add(formsubmit);
        formsubmit.setBackground(Color.cyan);
        formsubmit.setOpaque(true);
        //REFRESS BUTTON
        refress = new JButton("refress");
        refress.setBounds(200,470,150,30);
        p1.add(refress);
        refress.setBackground(Color.PINK);
        refress.setOpaque(true);

        //PANEL2 SECTION
        //NAME LABEL
        JLabel namelabel2 = new JLabel("Email Id:",JLabel.LEFT);
        namelabel2.setFont(new Font("Verdana", Font.BOLD, 17));
        namelabel2.setBounds(130,70,200,90);
        p2.add(namelabel2);

        JTextField namefield2 = new JTextField("enter your email");
        namefield2.setFont(new Font("Verdana", Font.BOLD, 10));
        namefield2.setBounds(280,100,200,30);
        p2.add(namefield2);

        //EMAIL LABEL
        JLabel lastlabel2 = new JLabel("Password:",JLabel.LEFT);
        lastlabel2.setFont(new Font("Verdana", Font.BOLD, 17));
        lastlabel2.setBounds(130,110,200,90);
        p2.add(lastlabel2);

        JTextField lastfield2 = new JTextField("enter your password");
        lastfield2.setFont(new Font("Verdana", Font.BOLD, 10));
        lastfield2.setBounds(280,140,200,30);
        p2.add(lastfield2);

        //LOGIN BUTTON
        login = new JButton("login");
        login.setBounds(200,220,150,30);
        p2.add(login);
        login.setBackground(Color.cyan);
        login.setOpaque(true);

        //PANEL2 SECTION
        //NAME LABEL
        JLabel namelabel3 = new JLabel("Name:",JLabel.LEFT);
        namelabel3.setFont(new Font("Verdana", Font.BOLD, 17));
        namelabel3.setBounds(80,140,200,90);
        p3.add(namelabel3);

        JTextField namefield3 = new JTextField("enter your email");
        namefield3.setFont(new Font("Verdana", Font.BOLD, 10));
        namefield3.setBounds(160,170,280,30);
        p3.add(namefield3);

        //SEARCH BUTTON
        search = new JButton("search");
        search.setBounds(460,170,150,30);
        p3.add(search);
        search.setBackground(Color.cyan);
        login.setOpaque(true);

        JLabel namelabel4 = new JLabel("your details got here:",JLabel.LEFT);
        namelabel4.setFont(new Font("Verdana", Font.BOLD, 15));
        namelabel4.setBounds(160,200,200,90);
        p3.add(namelabel4);




        //JTABPANE BOUNDS
        tb.setBounds(20,20,900,700);
        tb.add("REGISTRATION",p1);
        tb.add("LOGIN",p2);
        tb.add("SEARCH",p3);

        //FRAME BOUNDS
        f1.add(tb,BorderLayout.CENTER);
        f1.setSize(900,1000);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
}