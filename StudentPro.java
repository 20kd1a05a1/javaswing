import javax.swing.*;
import javax.swing.text.FlowView;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class StudentPro{
    
    public static void main(String[] args) {
        StudentFrame s1 = new StudentFrame();
       String record1 = s1.mainstr;
       
       
    }
}
class StudentFrame{
    static String lname,fname,email,rid,gender,skills,lastword;
    String data;
    String sdata="student details";
    JFrame f1;
    JTabbedPane tb;
    JComboBox genderc;
    JButton formsubmit;
    JButton refress;
    JButton login;
    JButton search;
    JButton cancel;
    String mainstr;
    
    StudentFrame(){
        f1 = new JFrame("Student details check");
        f1.setLayout(null);
        tb = new JTabbedPane();
        
        
        //PANELS
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        JPanel p3 = new JPanel(new BorderLayout());
        p3.setLayout(null);
        //layout 
        p1.setBackground(new Color(255, 255, 204));
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
        
        //EMAIL LABEL
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
        genderc  = new JComboBox(colors);
        genderc.setBounds(180,210,90,20);
        p1.add(genderc);
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
        formsubmit.setBackground(new Color(51,204,255));
        formsubmit.setOpaque(true);
        //CANCEL BUTTON
        cancel = new JButton("cancel");
        cancel.setBounds(200,520,150,30);
        p1.add(cancel);
        cancel.setBackground(new Color(204,204,204));
        cancel.setOpaque(true);
        cancel = new JButton("cancel");
        cancel.setBounds(340,220,150,30);
        p2.add(cancel);
        cancel.setBackground(new Color(204,204,204));
        cancel.setOpaque(true);
       




        //REFRESS BUTTON
        refress = new JButton("refress");
        refress.setBounds(200,470,150,30);
        p1.add(refress);
        refress.setBackground(Color.PINK);
        refress.setOpaque(true);
        


        //PANEL2 SECTION
        //NAME LABEL
        JLabel namelabel2 = new JLabel("Registration Id:",JLabel.LEFT);
        namelabel2.setFont(new Font("Verdana", Font.BOLD, 17));
        namelabel2.setBounds(130,70,200,90);
        p2.add(namelabel2);

        JTextField namefield2 = new JTextField("enter your password");
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
        login.setBounds(150,220,150,30);
        p2.add(login);
        login.setBackground(Color.cyan);
        login.setOpaque(true);

        JLabel detailsname = new JLabel("you can check details here");
        detailsname.setFont(new Font("Verdana", Font.BOLD, 20));
        detailsname.setBounds(220,280,400,30);
        p2.add(detailsname);
        JLabel detailsemail = new JLabel("");
        detailsemail.setFont(new Font("Verdana", Font.BOLD, 20));
        detailsemail.setBounds(220,320,400,30);
        p2.add(detailsemail);
        JLabel detailsaddress = new JLabel("");
        detailsaddress.setFont(new Font("Verdana", Font.BOLD, 20));
        detailsaddress.setBounds(220,360,400,30);
        p2.add(detailsaddress);
        JLabel detailsskills = new JLabel("");
        detailsskills.setFont(new Font("Verdana", Font.BOLD, 20));
        detailsskills.setBounds(220,400,400,30);
        p2.add(detailsskills);
        


        //PANEL3 SECTION
        //NAME LABEL
        JLabel namelabel3 = new JLabel("RollID:",JLabel.LEFT);
        namelabel3.setFont(new Font("Verdana", Font.BOLD, 17));
        namelabel3.setBounds(80,140,200,90);
        p3.add(namelabel3);

        JTextField namefield33 = new JTextField("enter your id");
        namefield33.setFont(new Font("Verdana", Font.BOLD, 10));
        namefield33.setBounds(160,170,280,30);
        p3.add(namefield33);

        //SEARCH BUTTON
        search = new JButton("search");
        search.setBounds(460,170,150,30);
        p3.add(search);
        search.setBackground(Color.cyan);
        login.setOpaque(true);

        JLabel namelabel4 = new JLabel("your details are here:",JLabel.LEFT);
        namelabel4.setFont(new Font("Verdana", Font.BOLD, 15));
        namelabel4.setBounds(160,200,200,90);
        p3.add(namelabel4);
        
        
        
        formsubmit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                String name = namefield.getText();
                String lname = lastfield.getText();
                String rid = regfield.getText();
                String email = emailfield.getText(); 
                Object gender = genderc.getSelectedItem();
                String address = addressfield.getText();
                String skills = skillsfield.getText();
                String pwdword = pwdfield.getText();
                
               mainstr = name +","+lname+","+rid+","+email+","+gender+","+address+","+skills+","+pwdword;
               //System.out.println(mainstr);
               try{    
                FileWriter fw=new FileWriter("C:\\Users\\gowth\\OneDrive\\Desktop\\"+rid+".txt"); 
                JOptionPane.showMessageDialog(p2, "your details submitted","success", JOptionPane.INFORMATION_MESSAGE);
                fw.write(mainstr);    
                fw.close();    
               }catch(Exception ae){System.out.println(ae);} 
               System.out.println("Success...");    

            }
        });

        
      
        login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String id = namefield2.getText();
                try {
                    File myObj = new File("C:\\Users\\gowth\\OneDrive\\Desktop\\"+id+".txt"); 
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                      data = myReader.nextLine();
                      String[] res = data.split("[,]", 0);
                      String gid = res[2];
                      System.out.println(gid);
                      String gpassword = res[res.length-1];
                      System.out.println(gpassword);
                      if(gid.equals(namefield2.getText()) && gpassword.equals(lastfield2.getText())){
                        JOptionPane.showMessageDialog(p2, "your login successful","success", JOptionPane.INFORMATION_MESSAGE);
                        detailsname.setText("name:"+" "+res[0]+""+res[1]);
                        detailsemail.setText("email:"+" "+res[3]);
                        detailsaddress.setText("gender:"+" "+res[4]);
                        detailsskills.setText("address:"+" "+res[5]);
                      }
                      else{
                        JOptionPane.showMessageDialog(p2, "password incorrect","error", JOptionPane.ERROR_MESSAGE);
                      }
                    }
                    myReader.close();
                  } catch (FileNotFoundException fe) {
                    System.out.println("file is not exist");
                    fe.printStackTrace();
                  }
                  

            }
        });


       
        search.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String id3 = namefield33.getText();
                File f = new File("C:\\Users\\gowth\\OneDrive\\Desktop\\"+id3+".txt");
                if (f.exists()){
                    try (Scanner myReader1 = new Scanner(f)) {
                        while (myReader1.hasNextLine()) {
                          sdata = myReader1.nextLine();
                          String[] res1 = sdata.split("[,]", 0);
                          System.out.println(res1);
                          String tabledata[][]={{"ID","NAME","LASTNAME","EMAIL","GENDER","ADDRESS","SKILLS",},{res1[2],res1[0],res1[1],res1[3],res1[4],res1[5],res1[6]},    
                        {"","","","","","",""},    
                        {"","","","","","",""}};    
                        String column[]={"ID","NAME","LASTNAME","EMAIL","GENDER","ADDRESS","SKILLS",};         
                        JTable jt=new JTable(tabledata,column); 
                        jt.setBounds(30,300,700,100);          
                        JScrollPane sp=new JScrollPane(jt); 
                        sp.setBounds(30,300, 407, 79);
                          
                        p3.add(jt,BorderLayout.CENTER); 
                        p3.add(jt.getTableHeader(), BorderLayout.SOUTH);
                        p3.add(sp);
                         
                        }
                               
                           
                              
                        
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }
                    
                    
                    JOptionPane.showMessageDialog(p3, "your data found","success", JOptionPane.INFORMATION_MESSAGE);
                }   
                else
                    JOptionPane.showMessageDialog(p3, "your data doesnt exist","error", JOptionPane.ERROR_MESSAGE);

            }
        });

        //REFRESS ACTION LISTENER
        refress.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                namefield.setText("");
                lastfield.setText("");
                regfield.setText("");
                emailfield.setText("");
                genderc.setSelectedItem("");
                addressfield.setText("");
                skillsfield.setText("");
                pwdfield.setText("");
            }
        });
        //CANCEL ACTION LISTENER
        cancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                    f1.setVisible(false);
            }
        });

        
  
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